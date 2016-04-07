package in.robo.common.authentication;

import org.springframework.security.core.GrantedAuthority;

public class GrantedAuthorityImpl implements GrantedAuthority {
	private static final long serialVersionUID = 1L;
	private String roleName;

	public GrantedAuthorityImpl(String rolename) {
		this.roleName = rolename;
	}

	@Override
	public String getAuthority() {
		return roleName;
	}

}
