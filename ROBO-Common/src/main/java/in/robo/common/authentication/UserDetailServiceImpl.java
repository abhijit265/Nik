package in.robo.common.authentication;

import in.robo.common.authentication.models.UserDetailsJson;
import in.robo.common.diy.models.UserAccessLog;
import in.robo.common.util.BaseResponse;
import in.robo.common.util.FiinfraConstants;
import in.robo.common.util.FiinfraUtility;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service("userService")
@Lazy
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	HttpServletRequest httpServletRequest;
			
	private MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();
	
	@Value("${SAVE_USER_ACCESS_LOG}") 
	private String SAVE_USER_ACCESS_LOG;
	
	@Value("${RETRIVE_USER_DETAILS}")
	private String userDetailsURL;
	

	@Value("${EXPIRED_USER_LOCK_ACCOUNT}")
	private String expired_user_lock_account;
	

	private static final Logger LOGGER = Logger
			.getLogger(UserDetailServiceImpl.class);

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		LOGGER.debug(username + " is trying to login");
		UserDetails userDetails = null;
		String IPaddress = null;
		UserDetailsJson userDetailsJson = getUserByUsername(username);
		if (userDetailsJson != null) {
			IPaddress = httpServletRequest.getRemoteAddr();
			LOGGER.debug(IPaddress + "IPAddress is for current user");

			GrantedAuthority authorityAdmin = new GrantedAuthorityImpl(
					userDetailsJson.getRoleName());
			Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
			authorities.add(authorityAdmin);
			boolean accountExpired = isAccountExpired(
					userDetailsJson.getAccessStartDate(),
					userDetailsJson.getAccessExpiryDate(),username,userDetailsJson.getUserID());
			boolean accountLocked = isAccountLocked(
					userDetailsJson.getAccountLocked(),
					userDetailsJson.getAccountLockExpiryDttm(), username,userDetailsJson.getUserID());
			//check account active
			accountincative(userDetailsJson.getActive(),username,userDetailsJson.getUserID());
			userDetails = new UserDetailsImpl(authorities,
					userDetailsJson.getUserName(),
					userDetailsJson.getPassword(), !accountExpired,
					!accountLocked, true, userDetailsJson.getActive(),
					restTemplate, httpServletRequest);
		} else {
			//log user for invalid username
			saveUserAccessLog("139005","Invalid User ID",username,0);

			throw new UsernameNotFoundException(
					"Username provided is not avaialable in database");
		}

		return userDetails;
	}

	@SuppressWarnings("unchecked")
	private UserDetailsJson getUserByUsername(String username) {
		LOGGER.debug("URL 	" + userDetailsURL);
		String uri=httpServletRequest.getRequestURL().toString();
			System.out.println("uri in common is:---"+uri);
			   if(!uri.endsWith("/"))
				uri+="/";
			  // UserDetailsJson userDetailsJson = null;
			   httpServletRequest.getSession().setAttribute("buIdFromWelcome", LoginUtlility.getBuIdForUrl(uri));
		UserDetailsJson userDetailsJson = restTemplate.getForObject(
				userDetailsURL + "/" + username+"-eof-"+LoginUtlility.getBuIdForUrl(uri), UserDetailsJson.class);
	  /* BaseResponse<UserDetailsJson> baseResponse = new BaseResponse<UserDetailsJson>();
		baseResponse = restTemplate.getForObject(userDetailsURL + "/" + username+"-eof-"+LoginUtlility.getBuIdForUrl(uri), BaseResponse.class);
		userDetailsJson = baseResponse.getResponseObject();*/
		/*	   UserDetailsJson userDetailsJson = restTemplate.getForObject(
				userDetailsURL + "/" + username, UserDetailsJson.class);*/

		if (userDetailsJson != null) {
			if (userDetailsJson.getAccountLocked() == null)
				userDetailsJson.setAccountLocked(true);

			LOGGER.debug(userDetailsJson);
		}
		return userDetailsJson;
	}

	private Boolean isAccountExpired(Timestamp accessStartDate,
			Timestamp accessExpiryDate,String username,Integer userid) {
		Timestamp currentDttm = new Timestamp(System.currentTimeMillis());
		if (accessExpiryDate != null && accessStartDate != null) {
			// Checking if Current Date is between Access StartDate and ExpiryDate
			if (currentDttm.after(accessStartDate)
					&& currentDttm.before(accessExpiryDate))
			{
				return false;
			}
		}
		//unlimited access
		else if(currentDttm.after(accessStartDate) && accessExpiryDate == null)
		{
			return false;
		}
		//log user for account expire
		saveUserAccessLog("139004", messages.getMessage("AbstractUserDetailsAuthenticationProvider.expired"),username,userid);
		return true;
		
	}

	private Boolean isAccountLocked(Boolean accountLocked,
			Timestamp accountLockExpiryDttm, String username,Integer userid) {
		Timestamp currentDttm = new Timestamp(System.currentTimeMillis());
		if (accountLocked) {
			// If current date time is less than Account lock expire date time
			// then the account is locked hence return true
			if (currentDttm.before(accountLockExpiryDttm)) {
				//log user for account locked
				saveUserAccessLog("139003", messages.getMessage("AbstractUserDetailsAuthenticationProvider.locked"),username,userid);
				return true;
			} else {
				// call stored proc "ExpiredLockAccount"
				String url = expired_user_lock_account + "/" + username;
				LOGGER.debug(url);
				restTemplate.getForObject(url, Boolean.class);
				return false;
			}
		}
		return false;
	}
	
	private void accountincative(Boolean active,String username,Integer userid)
	{
		if(!active)
		{
			//log user for inactive account
			saveUserAccessLog("139002", messages.getMessage("AbstractUserDetailsAuthenticationProvider.disabled"),username,userid);
		}
	}
	
	private void saveUserAccessLog(String errorCode, String errorMessage,String username,Integer userId)
	{
		String uri=httpServletRequest.getRequestURL().toString();
			System.out.println("uri in common is:---"+uri);
			   if(!uri.endsWith("/"))
				uri+="/";
		//get userid for user
		String token = "43f";
		//save user access log
		UserAccessLog accessLog = new UserAccessLog();
		accessLog.setUserId(userId);
		accessLog.setLoginAccessModeId(FiinfraConstants.LOGIN_ACCESS_MODE_STANDARD);
		accessLog.setEnteredPassword(null);
		accessLog.setLoginSuccessful(0);
		accessLog.setRedirectUrl(httpServletRequest.getRequestURL().toString());
		accessLog.setSessionId(httpServletRequest.getSession().getId());
		accessLog.setSourceIPAddress(httpServletRequest.getRemoteAddr());
		accessLog.setFailureCode(errorCode);
		accessLog.setFailureText(errorMessage);
		accessLog.setSourceSystemId(FiinfraConstants.DIY);
		UriComponentsBuilder uriCB = UriComponentsBuilder.fromHttpUrl(SAVE_USER_ACCESS_LOG+ username+"/" + token);
		//uriCB.queryParam("buId", LoginUtlility.getBuIdForUrl(uri));
		BaseResponse<Boolean> br = new BaseResponse<Boolean>();
		br = restTemplate.postForObject(FiinfraUtility.getURLWithParams(uriCB), accessLog, BaseResponse.class);
	}
}
