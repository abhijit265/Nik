package in.robo.common.v1.vo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class UserTokenRequest {
	
	@JsonProperty
	private Integer sourceSystemId;
	@JsonProperty
	private String userName="";
	@JsonProperty
	private String password="";
	@JsonProperty
	private String token;
	@JsonProperty
	private Integer otp;
	@JsonProperty
	private Integer userId;
	@JsonProperty
	private Integer buId;
	@JsonProperty
	private Integer partyId;
	@JsonProperty
	private Integer clientId;
	@JsonProperty
	private Integer ispwdvalid;
	@JsonProperty
	private String logo;
	@JsonProperty
	private String themeId;
	@JsonProperty
	private String themeColor;
	@JsonProperty
	private String macId;
	@JsonProperty
	private String description;
	@JsonProperty
	private Integer userTokenId;
	@JsonProperty
	private String screenSize;
	@JsonProperty
	private String ip;
	@JsonProperty
	private String androidVersion;
	@JsonProperty
	private String mobileDevice;
	@JsonProperty
	private Integer contactId;
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

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public Integer getIspwdvalid() {
		return ispwdvalid;
	}

	public void setIspwdvalid(Integer ispwdvalid) {
		this.ispwdvalid = ispwdvalid;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Integer getBuId() {
		return buId;
	}

	public void setBuId(Integer buId) {
		this.buId = buId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(Integer sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}


	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPartyId() {
		return partyId;
	}

	public void setPartyId(Integer partyId) {
		this.partyId = partyId;
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

	public String getMacId() {
		return macId;
	}

	public void setMacId(String macId) {
		this.macId = macId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getUserTokenId() {
		return userTokenId;
	}

	public void setUserTokenId(Integer userTokenId) {
		this.userTokenId = userTokenId;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAndroidVersion() {
		return androidVersion;
	}

	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}

	public String getMobileDevice() {
		return mobileDevice;
	}

	public void setMobileDevice(String mobileDevice) {
		this.mobileDevice = mobileDevice;
	}
	
	
	
}
