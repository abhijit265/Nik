package in.robo.common.authentication;

import in.robo.common.authentication.LoginUtlility;
import in.robo.common.diy.models.UserAccessLog;
import in.robo.common.util.BaseResponse;
import in.robo.common.util.FiinfraConstants;
import in.robo.common.util.FiinfraUtility;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class CustomDaoAuthenticationProvider extends DaoAuthenticationProvider {
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	HttpServletRequest httpServletRequest;

	@Value("${USER_LOGIN_ATTEMPT_FAILED}")
	private String failedLogin;
	
	
	@Value("${SAVE_USER_ACCESS_LOG}") 
	private String SAVE_USER_ACCESS_LOG;
	
	@Value("${GET_USERID_FOR_USER}") 
	private String GET_USERID_FOR_USER;

	@SuppressWarnings("deprecation")
	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {

		Object salt = null;

		if (this.getSaltSource() != null) {
			salt = this.getSaltSource().getSalt(userDetails);
		}

		if (authentication.getCredentials() == null) {
			logger.debug("Authentication failed: no credentials provided");

			throw new BadCredentialsException(messages.getMessage(
					"AbstractUserDetailsAuthenticationProvider.wrongpassword",
					"Bad credentials"), userDetails);
		}
		
		String presentedPassword = authentication.getCredentials().toString();

		if (!getPasswordEncoder().isPasswordValid(userDetails.getPassword(),
				presentedPassword, salt)) {
			logger.debug("Authentication failed: password does not match stored value");
			// calling stored procedure for wrong password
			String uri=httpServletRequest.getRequestURL().toString();
			System.out.println("uri in common is:---"+uri);
			   if(!uri.endsWith("/"))
				uri+="/";
			String url = failedLogin + "/" + authentication.getName()
					+ "/" + httpServletRequest.getRemoteAddr();
			Integer result = restTemplate.getForObject(url, Integer.class);
		
			if (result == 1) {
				//get userid for user
				String token = "43f";
				String useridUrl = GET_USERID_FOR_USER +authentication.getName()+"/"+token;
				Integer userId = restTemplate.getForObject(useridUrl, Integer.class);
				//save user access log for wrong password
				String encodedPassword = getPasswordEncoder().encodePassword(presentedPassword, null);
				String redirectUrl = ""+httpServletRequest.getRequestURL();
				String ipaddress = httpServletRequest.getRemoteAddr();
				String errorMessage = messages.getMessage("AbstractUserDetailsAuthenticationProvider.wrongpassword");
				saveUserAccessLog(userId,encodedPassword,redirectUrl,httpServletRequest.getSession().getId(),ipaddress,authentication.getName(),FiinfraConstants.INVALID_PASSWORD, errorMessage);
				throw new BadCredentialsException(
						messages.getMessage(
								"AbstractUserDetailsAuthenticationProvider.wrongpassword",
								"Bad credentials"), userDetails);
			} else if(result == 2){
				throw new BadCredentialsException(
						messages.getMessage(
								"AbstractUserDetailsAuthenticationProvider.exceedattempts",
								"Invalid credentials"), userDetails);
			} else if(result == 3){
				throw new BadCredentialsException(
						messages.getMessage(
								"AbstractUserDetailsAuthenticationProvider.policy",
								"Invalid credentials"), userDetails);
				
			}
		}
	}
	
	private void saveUserAccessLog(Integer userId,String password,String url,String sessionId,String ipAddress,String username,String errorCode, String errorMessage)
	{
		String uri=httpServletRequest.getRequestURL().toString();
			System.out.println("uri in common is:---"+uri);
			   if(!uri.endsWith("/"))
				uri+="/";
		String token = "23d";
		UserAccessLog accessLog = new UserAccessLog();
		accessLog.setUserId(userId);
		accessLog.setLoginAccessModeId(FiinfraConstants.LOGIN_ACCESS_MODE_STANDARD);
		accessLog.setEnteredPassword(password);
		accessLog.setLoginSuccessful(0);
		accessLog.setRedirectUrl(url);
		accessLog.setSessionId(sessionId);
		accessLog.setSourceIPAddress(ipAddress);
		accessLog.setFailureCode(errorCode);
		accessLog.setFailureText(errorMessage);
		accessLog.setSourceSystemId(FiinfraConstants.DIY);
		UriComponentsBuilder uriCB = UriComponentsBuilder.fromHttpUrl(SAVE_USER_ACCESS_LOG+ username+"/" + token);
		//uriCB.queryParam("buId", LoginUtlility.getBuIdForUrl(uri));
		BaseResponse<Boolean> br = new BaseResponse<Boolean>();
		br = restTemplate.postForObject(FiinfraUtility.getURLWithParams(uriCB), accessLog, BaseResponse.class);
	}

}
