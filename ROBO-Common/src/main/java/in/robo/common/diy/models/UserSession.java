package in.robo.common.diy.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

//import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class UserSession implements Serializable 
{
	@JsonProperty
	Integer Id;
	@JsonProperty
	Integer buId;
	@JsonProperty
	Integer partyId;
	@JsonProperty
	Integer partyTypeId;
	@JsonProperty
	Integer userId;
	@JsonProperty
	Integer roleId;
	@JsonProperty
	List<String> roles;
	@JsonProperty
	String partyLogo;
	@JsonProperty
	String partyTheme;
	@JsonProperty
	String portalName;
	@JsonProperty
	String buLogo;
	@JsonProperty
	Timestamp lastLoginDttm;
	@JsonProperty
	String name;
	@JsonProperty
	int themeId;
	@JsonProperty
	String photo;
	@JsonProperty
	String logo;
	@JsonProperty
	String userName;
	@JsonProperty
	private Integer ownerId;
	@JsonProperty
	private String ownerPhoto;
	@JsonProperty
	private String ownerName;
	@JsonProperty
	private String ownerLogo;
	@JsonProperty
	private int sourceSystemId;
	@JsonProperty
	private int successfulLoginCount;
	@JsonProperty
	private int tcSignOffFlag;
	@JsonProperty
	private int tcSignOffContentId;
	
	@JsonProperty
	private String codeValueDescription;
	
	@JsonProperty
	private Boolean isForceChangePasswordOnLogin;
	@JsonProperty
	private Integer recordtypeId;
	@JsonProperty
	private String token;	
	@JsonProperty
	private String dashboardPhoto; // required in Client portal for showing personalized desktop image	
	@JsonProperty
	private String contactEmail;	
	@JsonProperty
	private String emailCommunicationID;	
	@JsonProperty
	private String emailCommunicationName;	
	@JsonProperty
	private String contactMobile;
	@JsonProperty
	private String ownerMobile;	
	@JsonProperty
	private String ownerEmail;	
	@JsonProperty
	private String disclaimerText;	
	@JsonProperty
	private String dndText;	
	@JsonProperty
	private boolean dcActivated;	
	@JsonProperty
	private boolean firstLogin;	
	@JsonProperty
	private String themeName;	
	@JsonProperty
	private int alertCount;
	@JsonProperty
	private String tweeterLink;
	@JsonProperty
	private String newsFeed;
	@JsonProperty
	private String fbLink;	
	@JsonProperty
	private int subcriptionType;	
	@JsonProperty
	private int currentSubscriptionTypeID;	
	@JsonProperty
	private int onlineTransactionEnabled;
	@JsonProperty
	private String onlineTransactionEnableForClient;
	
	@JsonProperty
	private String onlineTransactionEnabledForBU;
	@JsonProperty
	private String onlineTransactionOptionForBU;
	
	public int getOnlineTransactionEnabled() {
		return onlineTransactionEnabled;
	}
	public void setOnlineTransactionEnabled(int onlineTransactionEnabled) {
		this.onlineTransactionEnabled = onlineTransactionEnabled;
	}
	public String getOnlineTransactionOption() {
		return onlineTransactionOption;
	}
	public void setOnlineTransactionOption(String onlineTransactionOption) {
		this.onlineTransactionOption = onlineTransactionOption;
	}
	@JsonProperty
	private String onlineTransactionOption;	
	
	public int getCurrentSubscriptionTypeID() {
		return currentSubscriptionTypeID;
	}
	public void setCurrentSubscriptionTypeID(int currentSubscriptionTypeID) {
		this.currentSubscriptionTypeID = currentSubscriptionTypeID;
	}
	@JsonProperty
	private boolean headOfNode;
	@JsonProperty
	private int currentNodeId;
	@JsonProperty
	private String currentNodeName;
	public String getCurrentNodeName() {
		return currentNodeName;
	}
	public void setCurrentNodeName(String currentNodeName) {
		this.currentNodeName = currentNodeName;
	}
	@JsonProperty
	private int level;
	@JsonProperty
	private Integer logoWidth;	
	@JsonProperty
	private Integer logoHeight;
	@JsonProperty
	private Boolean isRTAFilePasswordSet;
	
	@JsonProperty
	private boolean xrayActivated;
	
	@JsonProperty
	private String ARN;
	@JsonProperty
	private String euin;
	
	@JsonProperty
	private String registeredWithNSENMFII;
	
	@JsonProperty
	private String integratedWithNSENMFII;
	
	
	public Boolean getIsRTAFilePasswordSet() {
		return isRTAFilePasswordSet;
	}
	public void setIsRTAFilePasswordSet(Boolean isRTAFilePasswordSet) {
		this.isRTAFilePasswordSet = isRTAFilePasswordSet;
	}
	public Integer getLogoWidth() {
		return logoWidth;
	}
	public void setLogoWidth(Integer logoWidth) {
		this.logoWidth = logoWidth;
	}
	public Integer getLogoHeight() {
		return logoHeight;
	}
	public void setLogoHeight(Integer logoHeight) {
		this.logoHeight = logoHeight;
	}
	public Integer getPlanTypeId() {
		return planTypeId;
	}
	public void setPlanTypeId(Integer planTypeId) {
		this.planTypeId = planTypeId;
	}
	@JsonProperty
	private Integer planTypeId;

	public int getSubcriptionType() {
		return subcriptionType;
	}
	public void setSubcriptionType(int subcriptionType) {
		this.subcriptionType = subcriptionType;
	}
	public boolean isFirstLogin() {
		return firstLogin;
	}
	public void setFirstLogin(boolean firstLogin) {
		this.firstLogin = firstLogin;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
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
	public Integer getPartyTypeId() {
		return partyTypeId;
	}
	public void setPartyTypeId(Integer partyTypeId) {
		this.partyTypeId = partyTypeId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public String getPartyLogo() {
		return partyLogo;
	}
	public void setPartyLogo(String partyLogo) {
		this.partyLogo = partyLogo;
	}
	public String getPartyTheme() {
		return partyTheme;
	}
	public void setPartyTheme(String partyTheme) {
		this.partyTheme = partyTheme;
	}
	public String getPortalName() {
		return portalName;
	}
	public void setPortalName(String portalName) {
		this.portalName = portalName;
	}
	public String getBuLogo() {
		return buLogo;
	}
	public void setBuLogo(String buLogo) {
		this.buLogo = buLogo;
	}
	public Timestamp getLastLoginDttm() {
		return lastLoginDttm;
	}
	public void setLastLoginDttm(Timestamp lastLoginDttm) {
		this.lastLoginDttm = lastLoginDttm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getThemeId() {
		return themeId;
	}
	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
//	@Override
//	public String toString() 
//	{
//		return ReflectionToStringBuilder.toString(this).toString();
//	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerPhoto() {
		return ownerPhoto;
	}
	public void setOwnerPhoto(String ownerPhoto) {
		this.ownerPhoto = ownerPhoto;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerLogo() {
		return ownerLogo;
	}
	public void setOwnerLogo(String ownerLogo) {
		this.ownerLogo = ownerLogo;
	}
	public int getSourceSystemId() {
		return sourceSystemId;
	}
	public void setSourceSystemId(int sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}
	
	public boolean isClient(){
		return getPartyTypeId() != null && (getPartyTypeId().intValue() == 14005 || getPartyTypeId().intValue() == 14006 || getPartyTypeId().intValue() == 14007);
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getSuccessfulLoginCount() {
		return successfulLoginCount;
	}
	public void setSuccessfulLoginCount(int successfulLoginCount) {
		this.successfulLoginCount = successfulLoginCount;
	}
	public Boolean getIsForceChangePasswordOnLogin() {
		return isForceChangePasswordOnLogin;
	}
	public void setIsForceChangePasswordOnLogin(Boolean isForceChangePasswordOnLogin) {
		this.isForceChangePasswordOnLogin = isForceChangePasswordOnLogin;
	}
	public Integer getRecordtypeId() {
		return recordtypeId;
	}
	public void setRecordtypeId(Integer recordtypeId) {
		this.recordtypeId = recordtypeId;
	}
	public String getDashboardPhoto() {
		return dashboardPhoto;
	}
	public void setDashboardPhoto(String dashboardPhoto) {
		this.dashboardPhoto = dashboardPhoto;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getEmailCommunicationID() {
		return emailCommunicationID;
	}
	public void setEmailCommunicationID(String emailCommunicationID) {
		this.emailCommunicationID = emailCommunicationID;
	}
	public String getEmailCommunicationName() {
		return emailCommunicationName;
	}
	public void setEmailCommunicationName(String emailCommunicationName) {
		this.emailCommunicationName = emailCommunicationName;
	}

	public String getContactMobile() {
		return contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getOwnerMobile() {
		return ownerMobile;
	}
	public void setOwnerMobile(String ownerMobile) {
		this.ownerMobile = ownerMobile;
	}
	public String getOwnerEmail() {
		return ownerEmail;
	}
	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}
	public String getDisclaimerText() {
		return disclaimerText;
	}
	public void setDisclaimerText(String disclaimerText) {
		this.disclaimerText = disclaimerText;
	}
	public String getDndText() {
		return dndText;
	}
	public void setDndText(String dndText) {
		this.dndText = dndText;
	}
	public boolean isDcActivated() {
		return dcActivated;
	}
	public void setDcActivated(boolean dcActivated) {
		this.dcActivated = dcActivated;
	}
	public String getThemeName() {
		return themeName;
	}
	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}

	public int getAlertCount() {
		return alertCount;
	}
	public void setAlertCount(int alertCount) {
		this.alertCount = alertCount;
	}
	public String getTweeterLink() {
		return tweeterLink;
	}
	public void setTweeterLink(String tweeterLink) {
		this.tweeterLink = tweeterLink;
	}
	public String getFbLink() {
		return fbLink;
	}
	public void setFbLink(String fbLink) {
		this.fbLink = fbLink;
	}
	
	public int getCurrentNodeId() {
		return currentNodeId;
	}
	public void setCurrentNodeId(int currentNodeId) {
		this.currentNodeId = currentNodeId;
	}
	public boolean getHeadOfNode() {
		return headOfNode;
	}
	public void setHeadOfNode(boolean headOfNode) {
		this.headOfNode = headOfNode;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public boolean isXrayActivated() {
		return xrayActivated;
	}
	public void setXrayActivated(boolean xrayActivated) {
		this.xrayActivated = xrayActivated;
	}
	public String getARN() {
		return ARN;
	}
	public void setARN(String aRN) {
		ARN = aRN;
	}	
public String getEuin() {
		return euin;
	}
	public void setEuin(String euin) {
		this.euin = euin;
	}
	public String getRegisteredWithNSENMFII() {
		return registeredWithNSENMFII;
	}
	public void setRegisteredWithNSENMFII(String registeredWithNSENMFII) {
		this.registeredWithNSENMFII = registeredWithNSENMFII;
	}
	public String getIntegratedWithNSENMFII() {
		return integratedWithNSENMFII;
	}
	public void setIntegratedWithNSENMFII(String integratedWithNSENMFII) {
		this.integratedWithNSENMFII = integratedWithNSENMFII;
	}
	public String getOnlineTransactionEnableForClient() {
		return onlineTransactionEnableForClient;
	}
	public void setOnlineTransactionEnableForClient(
			String onlineTransactionEnableForClient) {
		this.onlineTransactionEnableForClient = onlineTransactionEnableForClient;
	}
	public String getOnlineTransactionEnabledForBU() {
		return onlineTransactionEnabledForBU;
	}
	public void setOnlineTransactionEnabledForBU(
			String onlineTransactionEnabledForBU) {
		this.onlineTransactionEnabledForBU = onlineTransactionEnabledForBU;
	}
	public String getOnlineTransactionOptionForBU() {
		return onlineTransactionOptionForBU;
	}
	public void setOnlineTransactionOptionForBU(String onlineTransactionOptionForBU) {
		this.onlineTransactionOptionForBU = onlineTransactionOptionForBU;
	}
	@Override
	public String toString() {
		return "UserSession [ARN=" + ARN + ", euin=" + euin + "]";
	}
	
	Integer approvedStatus;
	public Integer getApprovedStatus() {
		return approvedStatus;
	}
	public void setApprovedStatus(Integer approvedStatus) {
		this.approvedStatus = approvedStatus;
	}
	public String getNewsFeed() {
		return newsFeed;
	}
	public void setNewsFeed(String newsFeed) {
		this.newsFeed = newsFeed;
	}
	public int getTcSignOffFlag() {
		return tcSignOffFlag;
	}
	public void setTcSignOffFlag(int tcSignOffFlag) {
		this.tcSignOffFlag = tcSignOffFlag;
	}
	public int getTcSignOffContentId() {
		return tcSignOffContentId;
	}
	public void setTcSignOffContentId(int tcSignOffContentId) {
		this.tcSignOffContentId = tcSignOffContentId;
	}
	public String getCodeValueDescription() {
		return codeValueDescription;
	}
	public void setCodeValueDescription(String codeValueDescription) {
		this.codeValueDescription = codeValueDescription;
	}
	
}
