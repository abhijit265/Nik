package in.robo.common.util;

import in.robo.common.diy.models.PartyAttribute;

import java.io.Serializable;


import java.sql.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

public class Partner implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Integer partyID;
	 private String firstName;
	 private String lastName;
	 private String companyName;
	 private String arn;
	 private String euin;
	 private String location;
	 private String partnerName;
	 private String contactEmail;
	 private String contactMobile;
	 private String city;
	 private String allocatedServiceTeam;
	 private String displayShortName;
	 private boolean isActive;
	 private String pstName;
	 private String pktName;
	 private String potName;
	 private String rmName;
	 private String rmHeadName;
	 private String pstSn;
	 private String pktSn;
	 private String potSn;
	 private String rmSn;
	 private String rmHeadSn;
	 private Integer opp;
	 private Integer client;
	 private Integer pclient;
	 
	 private String shortName;
	 private String name;
	 private String relatedPartyId;
	 private String teamMemberID;
	 private String departmenttypeid;
	 private String pstTeamMemberId;
	 private String pktTeamMemberId;
	 private String potTeamMemberId;
	 private String rmTeamMemberId;
	 private String rmHeadTeamMemberId;
	 private String lastSuccessfullLogin;
	 private String loginName;
	 private String buId;
	 private String userId;
	 private String eNCPassword;
	 private String bulkPartnerXml;
	 @JsonIgnore
	 MultipartFile leadUpload;
	 private String ownerPartyId;
	 private String createdBy;
	 private String userName;
	 private String lastLogin;
	 private String sessionId;
	 private String bulkSTAselect;
	 private String emailCommunicationName;
	 private String searchText; 
	 private int recordTypeID;
	 private String  emailCommunicationID;
	 private String userDataXML;
	 private Integer allCount;
	 private int codeValueId;
	 private String codeValue;
	 private String communicationEmailId;
	 private String edit;
	
 
	 private Integer roleId;
	 private Integer categoryId;
	 private Integer subscriptionPackageId;
	 
	 private String role;
	 private String category;
	 private String subscriptionPackage;
	 private String subscriptionStatus;
	 private Date trialEndDate;
	 private Date trialStartDate;
	 private Date subscriptionStartDate;
	 private Date subscriptionExpiryDate;
	 private Date renewalNoticeDate;
	 private Date nextPaymentDttm;
	 private String lastPaymentAmount;
	 private String cumulativeAmountDue;
	 private Integer subscriptionStatusID;
	 private Integer CurrentSubscriptionTypeID;
	 private Integer paymentStatusID;
	 private String currentSubscriptionType;
	 private String productName;
	 private int buPartyId;
	 private String state;
	 private String stateID;
	 private String cityID;
	 private String isHeadNode;
	 private int currentNode;
	 
	 
	 
	 private int userid1;
	 private int headNode;
	 
	 private String subscriptionPackag1;
	 private String pkt;
	 private String rMHead;
	 private String rm;
	 private String pot; 
	 private String pst;
	 private int departmentID;
	 private String departmentName;
	 
	 private String empanelledAxisMF;
	 private String preferredDate;
	 private String preferredTime;
	 private Integer partnerSource;
	 
	 
	public int getHeadNode() {
		return headNode;
	}
	public void setHeadNode(int headNode) {
		this.headNode = headNode;
	}
	
	public Integer getPartnerSource() {
		return partnerSource;
	 }
	public void setPartnerSource(Integer partnerSource) {
		this.partnerSource = partnerSource;
	}
	
	private int nodeId;
	 
	private String pageNo ;
	private String  pageSize;
	private String orderBy;
	private String sord;
	 private String accesStartDate;
	 private String accesEndDate;
	 
	 
	 
	 //checklist pojo
	
	 	public String getEmpanelledAxisMF() {
			return empanelledAxisMF;
		}
		public void setEmpanelledAxisMF(String empanelledAxisMF) {
			this.empanelledAxisMF = empanelledAxisMF;
		}
		public String getPreferredDate() {
			return preferredDate;
		}
		public void setPreferredDate(String preferredDate) {
			this.preferredDate = preferredDate;
		}
		public String getPreferredTime() {
			return preferredTime;
		}
		public void setPreferredTime(String preferredTime) {
			this.preferredTime = preferredTime;
		}
	 
	public int getNodeId() {
		return nodeId;
	}
	public String getPageNo() {
			return pageNo;
		}
		public void setPageNo(String pageNo) {
			this.pageNo = pageNo;
		}
		public String getPageSize() {
			return pageSize;
		}
		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}
		public String getOrderBy() {
			return orderBy;
		}
		public void setOrderBy(String orderBy) {
			this.orderBy = orderBy;
		}
		public String getSord() {
			return sord;
		}
		public void setSord(String sord) {
			this.sord = sord;
		}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
		public int getUserid1() {
		return userid1;
	}
	public void setUserid1(int userid1) {
		this.userid1 = userid1;
	}
		public String getAccesStartDate() {
		return accesStartDate;
	}
	public void setAccesStartDate(String accesStartDate) {
		this.accesStartDate = accesStartDate;
	}
	public String getAccesEndDate() {
		return accesEndDate;
	}
	public void setAccesEndDate(String accesEndDate) {
		this.accesEndDate = accesEndDate;
	}
		private String programSponsor ;
		 private String agreementCheckD ;
		 private String welcomeContacted  ;
		 private String onboardingCheck ;
		 private String ragion ;
		private String ratting;
		 
		private String execution_tracker   ;
		 private String goal_tracking_achievement ;
		 private String track_your_practice ;
		private String self_Financial_Plan;
		 
		/*
			@programSponcer nvarchar,
			@welcomeContacted nvarchar,
			@AgreementSigned nvarchar,
			@Onboarded nvarchar,
			@Region int*/
		 
		 
		 public String getWelcomeContacted() {
			return welcomeContacted;
		}
		public String getExecution_tracker() {
			return execution_tracker;
		}
		public void setExecution_tracker(String execution_tracker) {
			this.execution_tracker = execution_tracker;
		}
		public String getGoal_tracking_achievement() {
			return goal_tracking_achievement;
		}
		public void setGoal_tracking_achievement(String goal_tracking_achievement) {
			this.goal_tracking_achievement = goal_tracking_achievement;
		}
		public String getTrack_your_practice() {
			return track_your_practice;
		}
		public void setTrack_your_practice(String track_your_practice) {
			this.track_your_practice = track_your_practice;
		}
		public String getSelf_Financial_Plan() {
			return self_Financial_Plan;
		}
		public void setSelf_Financial_Plan(String self_Financial_Plan) {
			this.self_Financial_Plan = self_Financial_Plan;
		}
		public void setWelcomeContacted(String welcomeContacted) {
			this.welcomeContacted = welcomeContacted;
		}
		private String onboardxml;
		
		private String onboardListId ;
		  private String onboardList ;
		  private String onboardListValue ;
		  private String onboardlistDate ;
		 
		  
		  
		  public String getRagion() {
				return ragion;
			}
			public void setRagion(String ragion) {
				this.ragion = ragion;
			}
		  public String getOnboardxml() {
			return onboardxml;
		}
		public void setOnboardxml(String onboardxml) {
			this.onboardxml = onboardxml;
		}
		public String getOnboardListId() {
			return onboardListId;
		}
		public void setOnboardListId(String onboardListId) {
			this.onboardListId = onboardListId;
		}
		public String getOnboardList() {
			return onboardList;
		}
		public void setOnboardList(String onboardList) {
			this.onboardList = onboardList;
		}
		public String getOnboardListValue() {
			return onboardListValue;
		}
		public void setOnboardListValue(String onboardListValue) {
			this.onboardListValue = onboardListValue;
		}
		public String getOnboardlistDate() {
			return onboardlistDate;
		}
		public void setOnboardlistDate(String onboardlistDate) {
			this.onboardlistDate = onboardlistDate;
		}
		
		 
		 
	 public String getRatting() {
			return ratting;
		}
		public void setRatting(String ratting) {
			this.ratting = ratting;
		}

	

	public String getProgramSponsor() {
		return programSponsor;
	}
	public void setProgramSponsor(String programSponsor) {
		this.programSponsor = programSponsor;
	}
	public String getAgreementCheckD() {
		return agreementCheckD;
	}
	public void setAgreementCheckD(String agreementCheckD) {
		this.agreementCheckD = agreementCheckD;
	}
	public String getOnboardingCheck() {
		return onboardingCheck;
	}
	public void setOnboardingCheck(String onboardingCheck) {
		this.onboardingCheck = onboardingCheck;
	}
	
	 
	 
	 
	 
	 
	 
	 
 
	public int getCurrentNode() {
		return currentNode;
	}
	public void setCurrentNode(int currentNode) {
		this.currentNode = currentNode;
	}
	public String getIsHeadNode() {
		return isHeadNode;
	}
	public void setIsHeadNode(String isHeadNode) {
		this.isHeadNode = isHeadNode;
	}
	public int getBuPartyId() {
		return buPartyId;
	}
	public void setBuPartyId(int buPartyId) {
		this.buPartyId = buPartyId;
	}
	public int getCodeValueId() {
		return codeValueId;
	}
	public void setCodeValueId(int codeValueId) {
		this.codeValueId = codeValueId;
	}
	public String getCodeValue() {
		return codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	public int getRecordTypeID() {
		return recordTypeID;
	}
	public void setRecordTypeID(int recordTypeID) {
		this.recordTypeID = recordTypeID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String geteNCPassword() {
		return eNCPassword;
	}
	public void seteNCPassword(String eNCPassword) {
		this.eNCPassword = eNCPassword;
	}
	public Integer getPartyID() {
		return partyID;
	}
	public void setPartyID(Integer partyID) {
		this.partyID = partyID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getArn() {
		return arn;
	}
	public void setArn(String arn) {
		this.arn = arn;
	}
	public String getEuin() {
		return euin;
	}
	public void setEuin(String euin) {
		this.euin = euin;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactMobile() {
		return contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAllocatedServiceTeam() {
		return allocatedServiceTeam;
	}
	public void setAllocatedServiceTeam(String allocatedServiceTeam) {
		this.allocatedServiceTeam = allocatedServiceTeam;
	}
	public String getDisplayShortName() {
		return displayShortName;
	}
	public void setDisplayShortName(String displayShortName) {
		this.displayShortName = displayShortName;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getPstName() {
		return pstName;
	}
	public void setPstName(String pstName) {
		this.pstName = pstName;
	}
	public String getPstSn() {
		return pstSn;
	}
	public void setPstSn(String pstSn) {
		this.pstSn = pstSn;
	}
	public String getPktSn() {
		return pktSn;
	}
	public void setPktSn(String pktSn) {
		this.pktSn = pktSn;
	}
	public String getPotSn() {
		return potSn;
	}
	public void setPotSn(String potSn) {
		this.potSn = potSn;
	}
	public String getRmSn() {
		return rmSn;
	}
	public void setRmSn(String rmSn) {
		this.rmSn = rmSn;
	}
	public String getPktName() {
		return pktName;
	}
	public void setPktName(String pktName) {
		this.pktName = pktName;
	}
	public String getPotName() {
		return potName;
	}
	public void setPotName(String potName) {
		this.potName = potName;
	}
	public String getRmName() {
		return rmName;
	}
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	public Integer getOpp() {
		return opp;
	}
	public void setOpp(Integer opp) {
		this.opp = opp;
	}
	public Integer getClient() {
		return client;
	}
	public void setClient(Integer client) {
		this.client = client;
	}
	public Integer getPclient() {
		return pclient;
	}
	public void setPclient(Integer pclient) {
		this.pclient = pclient;
	}

	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelatedPartyId() {
		return relatedPartyId;
	}
	public void setRelatedPartyId(String relatedPartyId) {
		this.relatedPartyId = relatedPartyId;
	}
	public String getTeamMemberID() {
		return teamMemberID;
	}
	public void setTeamMemberID(String teamMemberID) {
		this.teamMemberID = teamMemberID;
	}
	public String getDepartmenttypeid() {
		return departmenttypeid;
	}
	public void setDepartmenttypeid(String departmenttypeid) {
		this.departmenttypeid = departmenttypeid;
	}
	
	public String getPstTeamMemberId() {
		return pstTeamMemberId;
	}
	public void setPstTeamMemberId(String pstTeamMemberId) {
		this.pstTeamMemberId = pstTeamMemberId;
	}
	public String getPktTeamMemberId() {
		return pktTeamMemberId;
	}
	public void setPktTeamMemberId(String pktTeamMemberId) {
		this.pktTeamMemberId = pktTeamMemberId;
	}
	public String getPotTeamMemberId() {
		return potTeamMemberId;
	}
	public void setPotTeamMemberId(String potTeamMemberId) {
		this.potTeamMemberId = potTeamMemberId;
	}
	public String getRmTeamMemberId() {
		return rmTeamMemberId;
	}
	public void setRmTeamMemberId(String rmTeamMemberId) {
		this.rmTeamMemberId = rmTeamMemberId;
	}
	public String getRmHeadSn() {
		return rmHeadSn;
	}
	public void setRmHeadSn(String rmHeadSn) {
		this.rmHeadSn = rmHeadSn;
	}
	public String getRmHeadTeamMemberId() {
		return rmHeadTeamMemberId;
	}
	public void setRmHeadTeamMemberId(String rmHeadTeamMemberId) {
		this.rmHeadTeamMemberId = rmHeadTeamMemberId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getBuId() {
		return buId;
	}
	public void setBuId(String buId) {
		this.buId = buId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getLastSuccessfullLogin() {
		return lastSuccessfullLogin;
	}
	public void setLastSuccessfullLogin(String lastSuccessfullLogin) {
		this.lastSuccessfullLogin = lastSuccessfullLogin;
	}

	public String getBulkPartnerXml() {
		return bulkPartnerXml;
	}
	public void setBulkPartnerXml(String bulkPartnerXml) {
		this.bulkPartnerXml = bulkPartnerXml;
	}
	@JsonIgnore
	public MultipartFile getLeadUpload() {
		return leadUpload;
	}
	@JsonIgnore
	public void setLeadUpload(MultipartFile leadUpload) {
		this.leadUpload = leadUpload;
	}
	public String getOwnerPartyId() {
		return ownerPartyId;
	}
	public void setOwnerPartyId(String ownerPartyId) {
		this.ownerPartyId = ownerPartyId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getBulkSTAselect() {
		return bulkSTAselect;
	}
	public void setBulkSTAselect(String bulkSTAselect) {
		this.bulkSTAselect = bulkSTAselect;
	}
	public String getRmHeadName() {
		return rmHeadName;
	}
	public void setRmHeadName(String rmHeadName) {
		this.rmHeadName = rmHeadName;
	}
	public String getEmailCommunicationName() {
		return emailCommunicationName;
	}
	public void setEmailCommunicationName(String emailCommunicationName) {
		this.emailCommunicationName = emailCommunicationName;
	}
	public String getSearchText() {
		return searchText;
	} 
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	public String getEmailCommunicationID() {
		return emailCommunicationID;
	}
	public void setEmailCommunicationID(String emailCommunicationID) {
		this.emailCommunicationID = emailCommunicationID;
	}
	public String getUserDataXML() {
		return userDataXML;
	}
	public void setUserDataXML(String userDataXML) {
		this.userDataXML = userDataXML;
	}
	public Integer getAllCount() {
		return allCount;
	}
	public void setAllCount(Integer allCount) {
		this.allCount = allCount;
	}
	public String getCommunicationEmailId() {
		return communicationEmailId;
	}
	public void setCommunicationEmailId(String communicationEmailId) {
		this.communicationEmailId = communicationEmailId;
	}
	public String getEdit() {
		return edit;
	}
	public void setEdit(String edit) {
		this.edit = edit;
	}
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getSubscriptionPackageId() {
		return subscriptionPackageId;
	}
	public void setSubscriptionPackageId(Integer subscriptionPackageId) {
		this.subscriptionPackageId = subscriptionPackageId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubscriptionPackage() {
		return subscriptionPackage;
	}
	public void setSubscriptionPackage(String subscriptionPackage) {
		this.subscriptionPackage = subscriptionPackage;
	}
	public String getSubscriptionStatus() {
		return subscriptionStatus;
	}
	public void setSubscriptionStatus(String subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}
	public Date getTrialEndDate() {
		return trialEndDate;
	}
	public void setTrialEndDate(Date trialEndDate) {
		this.trialEndDate = trialEndDate;
	}
	public Date getSubscriptionExpiryDate() {
		return subscriptionExpiryDate;
	}
	public void setSubscriptionExpiryDate(Date subscriptionExpiryDate) {
		this.subscriptionExpiryDate = subscriptionExpiryDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getTrialStartDate() {
		return trialStartDate;
	}
	public void setTrialStartDate(Date trialStartDate) {
		this.trialStartDate = trialStartDate;
	}
	public Date getSubscriptionStartDate() {
		return subscriptionStartDate;
	}
	public void setSubscriptionStartDate(Date subscriptionStartDate) {
		this.subscriptionStartDate = subscriptionStartDate;
	}
	public Date getRenewalNoticeDate() {
		return renewalNoticeDate;
	}
	public void setRenewalNoticeDate(Date renewalNoticeDate) {
		this.renewalNoticeDate = renewalNoticeDate;
	}
	public Date getNextPaymentDttm() {
		return nextPaymentDttm;
	}
	public void setNextPaymentDttm(Date nextPaymentDttm) {
		this.nextPaymentDttm = nextPaymentDttm;
	}
	public String getLastPaymentAmount() {
		return lastPaymentAmount;
	}
	public void setLastPaymentAmount(String lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
	}
	public String getCumulativeAmountDue() {
		return cumulativeAmountDue;
	}
	public void setCumulativeAmountDue(String cumulativeAmountDue) {
		this.cumulativeAmountDue = cumulativeAmountDue;
	}
	public Integer getSubscriptionStatusID() {
		return subscriptionStatusID;
	}
	public void setSubscriptionStatusID(Integer subscriptionStatusID) {
		this.subscriptionStatusID = subscriptionStatusID;
	}
	public Integer getCurrentSubscriptionTypeID() {
		return CurrentSubscriptionTypeID;
	}
	public void setCurrentSubscriptionTypeID(Integer currentSubscriptionTypeID) {
		CurrentSubscriptionTypeID = currentSubscriptionTypeID;
	}
	public Integer getPaymentStatusID() {
		return paymentStatusID;
	}
	public void setPaymentStatusID(Integer paymentStatusID) {
		this.paymentStatusID = paymentStatusID;
	}
	public String getCurrentSubscriptionType() {
		return currentSubscriptionType;
	}
	public void setCurrentSubscriptionType(String currentSubscriptionType) {
		this.currentSubscriptionType = currentSubscriptionType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getStateID() {
		return stateID;
	}
	public void setStateID(String stateID) {
		this.stateID = stateID;
	}
	public String getCityID() {
		return cityID;
	}
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}
	
	
	private List<PartyAttribute> partyAttributeList;
	
	private Integer isAMCEmpaneled;
	
	private Integer isPartnerDetails;
	
	public List<PartyAttribute> getPartyAttributeList() {
		return partyAttributeList;
	}
	public void setPartyAttributeList(List<PartyAttribute> partyAttributeList) {
		this.partyAttributeList = partyAttributeList;
	}
	
	public Integer getIsAMCEmpaneled() {
		return isAMCEmpaneled;
	}
	public void setIsAMCEmpaneled(Integer isAMCEmpaneled) {
		this.isAMCEmpaneled = isAMCEmpaneled;
	}
	
	public Integer getIsPartnerDetails() {
		return isPartnerDetails;
	}
	public void setIsPartnerDetails(Integer isPartnerDetails) {
		this.isPartnerDetails = isPartnerDetails;
	}
	
	private String renewalDate;
	private String businessCode;
	private String businessARN;
	private String businessEUIN;
	private String nseRegistrated;
	private String nseRegister;
	private String integrate;
	private String password;
	
	public String getRenewalDate() {
		return renewalDate;
	}
	public void setRenewalDate(String renewalDate) {
		this.renewalDate = renewalDate;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getBusinessARN() {
		return businessARN;
	}
	public void setBusinessARN(String businessARN) {
		this.businessARN = businessARN;
	}
	public String getBusinessEUIN() {
		return businessEUIN;
	}
	public void setBusinessEUIN(String businessEUIN) {
		this.businessEUIN = businessEUIN;
	}
	public String getNseRegistrated() {
		return nseRegistrated;
	}
	public void setNseRegistrated(String nseRegistrated) {
		this.nseRegistrated = nseRegistrated;
	}
	public String getNseRegister() {
		return nseRegister;
	}
	public void setNseRegister(String nseRegister) {
		this.nseRegister = nseRegister;
	}
	public String getIntegrate() {
		return integrate;
	}
	public void setIntegrate(String integrate) {
		this.integrate = integrate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Partner [partyID=" + partyID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", companyName=" + companyName
				+ ", arn=" + arn + ", euin=" + euin + ", location=" + location
				+ ", partnerName=" + partnerName + ", contactEmail="
				+ contactEmail + ", contactMobile=" + contactMobile + ", city="
				+ city + ", allocatedServiceTeam=" + allocatedServiceTeam
				+ ", displayShortName=" + displayShortName + ", isActive="
				+ isActive + ", pstName=" + pstName + ", pktName=" + pktName
				+ ", potName=" + potName + ", rmName=" + rmName
				+ ", rmHeadName=" + rmHeadName + ", pstSn=" + pstSn
				+ ", pktSn=" + pktSn + ", potSn=" + potSn + ", rmSn=" + rmSn
				+ ", rmHeadSn=" + rmHeadSn + ", opp=" + opp + ", client="
				+ client + ", pclient=" + pclient + ", shortName=" + shortName
				+ ", name=" + name + ", relatedPartyId=" + relatedPartyId
				+ ", teamMemberID=" + teamMemberID + ", departmenttypeid="
				+ departmenttypeid + ", pstTeamMemberId=" + pstTeamMemberId
				+ ", pktTeamMemberId=" + pktTeamMemberId + ", potTeamMemberId="
				+ potTeamMemberId + ", rmTeamMemberId=" + rmTeamMemberId
				+ ", rmHeadTeamMemberId=" + rmHeadTeamMemberId
				+ ", lastSuccessfullLogin=" + lastSuccessfullLogin
				+ ", loginName=" + loginName + ", buId=" + buId + ", userId="
				+ userId + ", eNCPassword=" + eNCPassword + ", bulkPartnerXml="
				+ bulkPartnerXml + ", leadUpload=" + leadUpload
				+ ", ownerPartyId=" + ownerPartyId + ", createdBy=" + createdBy
				+ ", userName=" + userName + ", lastLogin=" + lastLogin
				+ ", sessionId=" + sessionId + ", bulkSTAselect="
				+ bulkSTAselect + ", emailCommunicationName="
				+ emailCommunicationName + ", searchText=" + searchText
				+ ", recordTypeID=" + recordTypeID + ", emailCommunicationID="
				+ emailCommunicationID + ", userDataXML=" + userDataXML
				+ ", allCount=" + allCount + ", codeValueId=" + codeValueId
				+ ", codeValue=" + codeValue + ", communicationEmailId="
				+ communicationEmailId + ", edit=" + edit + ", roleId="
				+ roleId + ", categoryId=" + categoryId
				+ ", subscriptionPackageId=" + subscriptionPackageId
				+ ", role=" + role + ", category=" + category
				+ ", subscriptionPackage=" + subscriptionPackage
				+ ", subscriptionStatus=" + subscriptionStatus
				+ ", trialEndDate=" + trialEndDate + ", trialStartDate="
				+ trialStartDate + ", subscriptionStartDate="
				+ subscriptionStartDate + ", subscriptionExpiryDate="
				+ subscriptionExpiryDate + ", renewalNoticeDate="
				+ renewalNoticeDate + ", nextPaymentDttm=" + nextPaymentDttm
				+ ", lastPaymentAmount=" + lastPaymentAmount
				+ ", cumulativeAmountDue=" + cumulativeAmountDue
				+ ", subscriptionStatusID=" + subscriptionStatusID
				+ ", CurrentSubscriptionTypeID=" + CurrentSubscriptionTypeID
				+ ", paymentStatusID=" + paymentStatusID
				+ ", currentSubscriptionType=" + currentSubscriptionType
				+ ", productName=" + productName + ", buPartyId=" + buPartyId
				+ ", state=" + state + ", stateID=" + stateID + ", cityID="
				+ cityID + "]";
	}
	public String getSubscriptionPackag1() {
		return subscriptionPackag1;
	}
	public void setSubscriptionPackag1(String subscriptionPackag1) {
		this.subscriptionPackag1 = subscriptionPackag1;
	}
	public String getPkt() {
		return pkt;
	}
	public void setPkt(String pkt) {
		this.pkt = pkt;
	}
	
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getPot() {
		return pot;
	}
	public void setPot(String pot) {
		this.pot = pot;
	}
	public String getPst() {
		return pst;
	}
	public void setPst(String pst) {
		this.pst = pst;
	}
	public String getrMHead() {
		return rMHead;
	}
	public void setrMHead(String rMHead) {
		this.rMHead = rMHead;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	 
}
