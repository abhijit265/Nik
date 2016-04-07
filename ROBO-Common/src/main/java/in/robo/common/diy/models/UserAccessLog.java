package in.robo.common.diy.models;

import java.io.Serializable;

//import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class UserAccessLog implements Serializable 
{
	private static final long serialVersionUID = 6788694863291309609L;
	@JsonProperty
	private Integer userId;
	@JsonProperty
	private Integer loginAccessModeId;
	@JsonProperty
	private String ssoSourceSystem;
	@JsonProperty
	private String enteredPassword;
	@JsonProperty
	private String sourceIPAddress;
	@JsonProperty
	private Integer loginSuccessful;
	@JsonProperty
	private String redirectUrl;
	@JsonProperty
	private String failureCode;
	@JsonProperty
	private String failureText;
	@JsonProperty
	private String sessionId;
	@JsonProperty
	private Integer sessionExpired;
	@JsonProperty
	private Integer sourceSystemId;
	
	@JsonProperty
	private Integer partyID;
	
	
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getLoginAccessModeId() {
		return loginAccessModeId;
	}
	public void setLoginAccessModeId(Integer loginAccessModeId) {
		this.loginAccessModeId = loginAccessModeId;
	}
	public String getSsoSourceSystem() {
		return ssoSourceSystem;
	}
	public void setSsoSourceSystem(String ssoSourceSystem) {
		this.ssoSourceSystem = ssoSourceSystem;
	}
	public String getEnteredPassword() {
		return enteredPassword;
	}
	public void setEnteredPassword(String enteredPassword) {
		this.enteredPassword = enteredPassword;
	}
	public String getSourceIPAddress() {
		return sourceIPAddress;
	}
	public void setSourceIPAddress(String sourceIPAddress) {
		this.sourceIPAddress = sourceIPAddress;
	}
	public Integer getLoginSuccessful() {
		return loginSuccessful;
	}
	public void setLoginSuccessful(Integer loginSuccessful) {
		this.loginSuccessful = loginSuccessful;
	}
	public String getRedirectUrl() {
		return redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getFailureCode() {
		return failureCode;
	}
	public void setFailureCode(String failureCode) {
		this.failureCode = failureCode;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Integer getSessionExpired() {
		return sessionExpired;
	}
	public void setSessionExpired(Integer sessionExpired) {
		this.sessionExpired = sessionExpired;
	}
	public String getFailureText() {
		return failureText;
	}
	public void setFailureText(String failureText) {
		this.failureText = failureText;
	}
	public Integer getSourceSystemId() {
		return sourceSystemId;
	}
	public void setSourceSystemId(Integer sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}
	public Integer getPartyID() {
		return partyID;
	}
	public void setPartyID(Integer partyID) {
		this.partyID = partyID;
	}
	
	
	
//	@Override
//	public String toString() 
//	{
//		return new ReflectionToStringBuilder(this).toString();
//	}
	

}
