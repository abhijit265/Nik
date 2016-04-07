package in.robo.common.authentication.models;

import java.io.Serializable;
import java.sql.Timestamp;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserDetailsJson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty
	private String userName;
	@JsonProperty
	private Integer userID;
	@JsonProperty
	private Integer buId;
	@JsonProperty
	private Integer partyId;
	@JsonProperty
	private boolean active;
	@JsonProperty
	private String password;
	@JsonProperty
	private String emailId;
	@JsonProperty
	private Integer loginAttempts;
	@JsonProperty
	private Boolean accountLocked;
	@JsonProperty
	private Timestamp accountLockDttm;
	@JsonProperty
	private Timestamp accountLockExpiryDttm;
	@JsonProperty
	private Timestamp lastFailedLoginDttm;
	@JsonProperty
	private String lastLoginIPAddress;
	@JsonProperty
	private Boolean loggedIn;
	@JsonProperty
	private Timestamp accessStartDate;
	@JsonProperty
	private Timestamp accessExpiryDate;
	@JsonProperty
	private Boolean forceChangePasswordOnLogin;
	@JsonProperty
	private Timestamp lastSuccessfulLoginDttm;
	@JsonProperty
	private Integer securityQuestionID;
	@JsonProperty
	private String securityAnswer;
	@JsonProperty
	private String roleName;
	@JsonProperty
	private Timestamp nextPasswordChangeDtm;
	@JsonProperty
	private Integer ownerPartyId;
	@JsonProperty
	private String logo;
	@JsonProperty
	private String themeId;
	@JsonProperty
	private String themeColor;
	@JsonProperty
	private Integer userTokenId;
	@JsonProperty
	private String euin;
	@JsonProperty
	private String arn;
	
	
	
	
	public String getEuin() {
		return euin;
	}

	public void setEuin(String euin) {
		this.euin = euin;
	}

	public String getArn() {
		return arn;
	}

	public void setArn(String arn) {
		this.arn = arn;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}
		
	public Integer getBuId() {
		return buId;
	}

	public void setBuId(Integer buId) {
		this.buId = buId;
	}

	public Integer getPartyId() {
		return partyId;
	}

	public void setPartyId(Integer partyId) {
		this.partyId = partyId;
	}

	public boolean getActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getLoginAttempts() {
		return loginAttempts;
	}

	public void setLoginAttempts(Integer loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

	public Boolean getAccountLocked() {
		return accountLocked;
	}

	public void setAccountLocked(Boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	public Timestamp getAccountLockDttm() {
		return accountLockDttm;
	}

	public void setAccountLockDttm(Timestamp accountLockDttm) {
		this.accountLockDttm = accountLockDttm;
	}

	public Timestamp getAccountLockExpiryDttm() {
		return accountLockExpiryDttm;
	}

	public void setAccountLockExpiryDttm(Timestamp accountLockExpiryDttm) {
		this.accountLockExpiryDttm = accountLockExpiryDttm;
	}

	public Timestamp getLastFailedLoginDttm() {
		return lastFailedLoginDttm;
	}

	public void setLastFailedLoginDttm(Timestamp lastFailedLoginDttm) {
		this.lastFailedLoginDttm = lastFailedLoginDttm;
	}

	public String getLastLoginIPAddress() {
		return lastLoginIPAddress;
	}

	public void setLastLoginIPAddress(String lastLoginIPAddress) {
		this.lastLoginIPAddress = lastLoginIPAddress;
	}

	public Boolean getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public Timestamp getAccessStartDate() {
		return accessStartDate;
	}

	public void setAccessStartDate(Timestamp accessStartDate) {
		this.accessStartDate = accessStartDate;
	}

	public Timestamp getAccessExpiryDate() {
		return accessExpiryDate;
	}

	public void setAccessExpiryDate(Timestamp accessExpiryDate) {
		this.accessExpiryDate = accessExpiryDate;
	}

	public Boolean getForceChangePasswordOnLogin() {
		return forceChangePasswordOnLogin;
	}

	public void setForceChangePasswordOnLogin(Boolean forceChangePasswordOnLogin) {
		this.forceChangePasswordOnLogin = forceChangePasswordOnLogin;
	}

	public Timestamp getLastSuccessfulLoginDttm() {
		return lastSuccessfulLoginDttm;
	}

	public void setLastSuccessfulLoginDttm(Timestamp lastSuccessfulLoginDttm) {
		this.lastSuccessfulLoginDttm = lastSuccessfulLoginDttm;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

		
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getSecurityQuestionID() {
		return securityQuestionID;
	}

	public void setSecurityQuestionID(Integer securityQuestionID) {
		this.securityQuestionID = securityQuestionID;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	
	
	public Timestamp getNextPasswordChangeDtm() {
		return nextPasswordChangeDtm;
	}

	public void setNextPasswordChangeDtm(Timestamp nextPasswordChangeDtm) {
		this.nextPasswordChangeDtm = nextPasswordChangeDtm;
	}
	

	public Integer getOwnerPartyId() {
		return ownerPartyId;
	}

	public void setOwnerPartyId(Integer ownerPartyId) {
		this.ownerPartyId = ownerPartyId;
	}

	
	
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getThemeId() {
		return themeId;
	}

	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}

	public String getThemeColor() {
		return themeColor;
	}

	public void setThemeColor(String themeColor) {
		this.themeColor = themeColor;
	}
	
	

	public Integer getUserTokenId() {
		return userTokenId;
	}

	public void setUserTokenId(Integer userTokenId) {
		this.userTokenId = userTokenId;
	}

	@Override
	public String toString() {
		return "UserDetailsJson [userName=" + userName + ", userID=" + userID
				+ ", active=" + active + ", password=" + password
				+ ", emailId=" + emailId + ", loginAttempts=" + loginAttempts
				+ ", accountLocked=" + accountLocked + ", accountLockDttm="
				+ accountLockDttm + ", accountLockExpiryDttm="
				+ accountLockExpiryDttm + ", lastFailedLoginDttm="
				+ lastFailedLoginDttm + ", lastLoginIPAddress="
				+ lastLoginIPAddress + ", loggedIn=" + loggedIn
				+ ", accessStartDate=" + accessStartDate
				+ ", accessExpiryDate=" + accessExpiryDate
				+ ", forceChangePasswordOnLogin=" + forceChangePasswordOnLogin
				+ ", lastSuccessfulLoginDttm=" + lastSuccessfulLoginDttm
				+ ", securityQuestionID=" + securityQuestionID
				+ ", securityAnswer=" + securityAnswer + ", roleName="
				+ roleName + ", ownerPartyId="+ownerPartyId+",themeId="+themeId+",logo="+logo+",themeColor="+themeColor+"]";
	}

	

}
