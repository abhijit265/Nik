package in.robo.common.v1.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 
 * @author Priyanka Lad
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {

	
	private Integer partyId;
	private Integer otp;
	private String token ;
	private String buId ;
	private String contactMobile;
	private Integer userId; 
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getContactMobile() {
		return contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}
	private Integer lastUpdatedBy;
	
	
	public Integer getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Integer getPartyId() {
		return partyId;
	}
	public void setPartyId(Integer partyId) {
		this.partyId = partyId;
	}
	
	public Integer getOtp() {
		return otp;
	}
	public void setOtp(Integer otp) {
		this.otp = otp;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	
	
	
}
