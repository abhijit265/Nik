package in.robo.common.authentication;

import java.util.Collection;
import java.util.HashSet;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.client.RestTemplate;

public class UserDetailsImpl implements UserDetails {
	

	private static final Logger LOGGER = Logger
			.getLogger(UserDetailsImpl.class);

	private static final long serialVersionUID = 1L;
	private HttpServletRequest httpServletRequest;
	private Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
	private String username;
	private String password;
	private boolean accountExpired;
	private boolean accountLocked;
	private boolean credentialExpired;
	private boolean enabled;
	private RestTemplate restTemplate;

	public UserDetailsImpl(Collection<GrantedAuthority> authorities,
			String username, String password, boolean accountExpired,
			boolean accountLocked, boolean credentialExpired, boolean enabled,
			RestTemplate restTemplate, HttpServletRequest request) {
		super();
		this.authorities = authorities;
		this.username = username;
		this.password = password;
		this.accountExpired = accountExpired;
		this.accountLocked = accountLocked;
		this.credentialExpired = credentialExpired;
		this.enabled = enabled;
		this.restTemplate = restTemplate;
		this.httpServletRequest = request;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return accountExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return accountLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		LOGGER.debug("Calling successful web service");
		return credentialExpired;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	
	public void setAccountExpired(boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	public void setCredentialExpired(boolean credentialExpired) {
		this.credentialExpired = credentialExpired;
	}

}
