package in.robo.common.util;

public class User 
{
	 private Integer userID;
	 private String userName;
	 private String emailID;
	// private String lastLogIntegerime;
	 private Integer partyId;
	 private Integer recordTypeId;
	
	 private Integer buPartyId;
	 private String lastName;
	 private String roleName;
	 private String contactMobile;
	 private Boolean isActive;
	 private Boolean isLocked;
	 private Boolean isLogged;
	 private Boolean isForceChange; 
	 private String userPassword;
	 private Integer securityQueID;  
	 private String securityAns;
	 private String accessStartDate;
	 private String accessEndDate;
	 private String accountLockDate;
	 private String accountReleaseDate;
	 private String createDates;
	 private String lastModifiedDates;
	 private String creatBy;
	 private Integer lastModifyBy;
	 private String codeValueName;
	 private Integer codeValueID;
	 private String codeValue;
	 private String lastLogingFailed;
	 private Integer loginAttempts;
	 private String lastLoginIPAddress;
	 private String nextPasswordChangeDate;
	 private String lastLoginTime;
	 private String secQueName;
	 private Integer roleID;
     private Integer userStatus;
   //private Integer partyIds;
     private String lastCurrentDateLogin;
     private String lastCurrentDateTime;
 
     private Integer allCount;
     private String searchText;
     private String deleteList;
     private int theme;
     
    
	//audit history
     private String partyName;
     private String sourceSystemID;
     private String sourceModule;
     private String sourceScreen;
     private String auditdatetime;
     private String eventID;
		 
     private String arn;
     private String panNo;
     private String rssFeedName;
     private String emailName;
     private String firstName;
     private Integer modifiedBy;
	 private String newPassword;	 
	 private String oldPassword;
	 private String themName;
	 
	 private Integer currentNode;
     
	 private Integer headNode;
	 private String mobileNumber;
	 private String bizUnitName;
	 private String rmName;
	 private Integer rmPartyId;
	 
	 private Integer docTypeId;
	 
	 
	 
	    private String pageNo ;
		private String  pageSize;
		private String orderBy;
		private String sord;
		private int nodeId;
		
		private String buname;
		
	public int getNodeId() {
			return nodeId;
		}

		public void setNodeId(int nodeId) {
			this.nodeId = nodeId;
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
		
	 
	 
	 
	 
	public Integer getDocTypeId()
		{
			return docTypeId;
		}

	public void setDocTypeId(Integer docTypeId) 
		{
			this.docTypeId = docTypeId;
		}
	public String getRmName() {
		return rmName;
	}
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	public Integer getRmPartyId() {
		return rmPartyId;
	}
	public void setRmPartyId(Integer rmPartyId) {
		this.rmPartyId = rmPartyId;
	}
	public String getBizUnitName() {
		return bizUnitName;
	}
	public void setBizUnitName(String bizUnitName) {
		this.bizUnitName = bizUnitName;
	}
	private Integer clientID;
	private String clientName;
	
	
	
	
	 public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	private Integer loggedInPartyId;
	 
	 
	 private String extraParam;
	 private String extraParamOne;
	 private Integer extraParamTwo;
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
     public Integer getExtraParamTwo() {
		return extraParamTwo;
	}
	public void setExtraParamTwo(Integer extraParamTwo) {
		this.extraParamTwo = extraParamTwo;
	}
	public String getExtraParam() {
		return extraParam;
	}
	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}
	public String getExtraParamOne() {
		return extraParamOne;
	}
	public void setExtraParamOne(String extraParamOne) {
		this.extraParamOne = extraParamOne;
	}

	public Integer getLoggedInPartyId() {
		return loggedInPartyId;
	}
	public void setLoggedInPartyId(Integer loggedInPartyId) {
		this.loggedInPartyId = loggedInPartyId;
	}
	public Integer getClientID() {
		return clientID;
	}
	public void setClientID(Integer clientID) {
		this.clientID = clientID;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Integer getHeadNode() {
		return headNode;
	}
	public void setHeadNode(Integer headNode) {
		this.headNode = headNode;
	}
	public Integer getCurrentNode() {
		return currentNode;
	}
	public void setCurrentNode(Integer currentNode) {
		this.currentNode = currentNode;
	}
	public String getThemName() {
		return themName;
	}
	public void setThemName(String themName) {
		this.themName = themName;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public int getTheme() {
 		return theme;
 	}
 	public void setTheme(int theme) {
 		this.theme = theme;
 	}
	
	public Integer getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getArn() {
		return arn;
	}
	public void setArn(String arn) {
		this.arn = arn;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getEmailName() {
		return emailName;
	}
	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSearchText() 
	{
		return searchText;
	}
	public void setSearchText(String searchText)
	{
		this.searchText = searchText;
	}
	public Integer getAllCount() 
	{
		return allCount;
	}
	public void setAllCount(Integer allCount)
	{
		this.allCount = allCount;
	}
	public String getLastCurrentDateLogin() 
	{
		return lastCurrentDateLogin;
	}
	public void setLastCurrentDateLogin(String lastCurrentDateLogin)
	{
		this.lastCurrentDateLogin = lastCurrentDateLogin;
	}
	public String getLastCurrentDateTime() 
	{
		return lastCurrentDateTime;
	}
	public void setLastCurrentDateTime(String lastCurrentDateTime)
	{
		this.lastCurrentDateTime = lastCurrentDateTime;
	}
	/*public Integer getPartyIds() {
			return partyIds;
		}
		public void setPartyIds(Integer partyIds) {
			this.partyIds = partyIds;
		}*/
	public Integer getUserStatus()
	{
		return userStatus;
	}
	public void setUserStatus(Integer userStatus)
	{
		this.userStatus = userStatus;
	}
	public Integer getCodeValueID() 
	{
		return codeValueID;
	}
	public void setCodeValueID(Integer codeValueID) 
	{
		this.codeValueID = codeValueID;
	}
	public String getCodeValue() 
	{
		return codeValue;
	}
	public void setCodeValue(String codeValue) 
	{
		this.codeValue = codeValue;
	}
	public String getCodeValueName()
	{
		return codeValueName;
	}
	public void setCodeValueName(String codeValueName) 
	{
		this.codeValueName = codeValueName;
	}
	public Integer getLastModifyBy()
	{
		return lastModifyBy;
	}
	public void setLastModifyBy(Integer lastModifyBy)
	{
		this.lastModifyBy = lastModifyBy;
	}
	public String getCreatBy() 
	{
		return creatBy;
	}
	public void setCreatBy(String creatBy)
	{
		this.creatBy = creatBy;
	}
	public String getLastModifiedDates() 
	{
		return lastModifiedDates;
	}
	public void setLastModifiedDates(String lastModifiedDates) 
	{
		this.lastModifiedDates = lastModifiedDates;
	}
	public String getCreateDates() 
	{
		return createDates;
	}
	public void setCreateDates(String createDates) 
	{
		this.createDates = createDates;
	}
	public String getAccessStartDate()
	{
		return accessStartDate;
	}
	public void setAccessStartDate(String accessStartDate)
	{
		this.accessStartDate = accessStartDate;
	}
	public String getAccessEndDate()
	{
		return accessEndDate;
	}
	public void setAccessEndDate(String accessEndDate) 
	{
		this.accessEndDate = accessEndDate;
	}
	public String getAccountLockDate() 
	{
		return accountLockDate;
	}
	public void setAccountLockDate(String accountLockDate) 
	{
		this.accountLockDate = accountLockDate;
	}
	public String getAccountReleaseDate() 
	{
		return accountReleaseDate;
	}
	public void setAccountReleaseDate(String accountReleaseDate) 
	{
		this.accountReleaseDate = accountReleaseDate;
	}
	public String getLastLogingFailed()
	{
		return lastLogingFailed;
	}
	public void setLastLogingFailed(String lastLogingFailed) 
	{
		this.lastLogingFailed = lastLogingFailed;
	}
	public String getNextPasswordChangeDate() 
	{
		return nextPasswordChangeDate;
	}
	public void setNextPasswordChangeDate(String nextPasswordChangeDate)
	{
		this.nextPasswordChangeDate = nextPasswordChangeDate;
	}
	
	public String getLastLoginTime() 
	{
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) 
	{
		this.lastLoginTime = lastLoginTime;
	}


	public Integer getRoleID() {
		return roleID;
	}
	public void setRoleID(Integer roleID) {
		this.roleID = roleID;
	}
	public String getSecQueName() {
		return secQueName;
	}
	public void setSecQueName(String secQueName) {
		this.secQueName = secQueName;
	}
		public String getLastLoginIPAddress() {
	  return lastLoginIPAddress;
	 }
	 public void setLastLoginIPAddress(String lastLoginIPAddress) {
	  this.lastLoginIPAddress = lastLoginIPAddress;
	 }
		 public Integer getLoginAttempts() {
	  return loginAttempts;
	 }
	 public void setLoginAttempts(Integer loginAttempts) {
	  this.loginAttempts = loginAttempts;
	 }
	

	 public String getSecurityAns() {
	  return securityAns;
	 }
	 public void setSecurityAns(String securityAns) {
	  this.securityAns = securityAns;
	 }
	 public Integer getSecurityQueID() {
	  return securityQueID;
	 }
	 public void setSecurityQueID(Integer securityQueID) {
	  this.securityQueID = securityQueID;
	 }
	 public String getUserPassword() {
	  return userPassword;
	 }
	 public void setUserPassword(String userPassword) {
	  this.userPassword = userPassword;
	 }
	 public Boolean getisForceChange() {
	  return isForceChange;
	 }
	 public void setisForceChange(Boolean isForceChange) {
	  this.isForceChange = isForceChange;
	 }
	 public Boolean getisLogged() {
	  return isLogged;
	 }
	 public void setisLogged(Boolean isLogged) {
	  this.isLogged = isLogged;
	 }
	 public Boolean getisLocked() {
	  return isLocked;
	 }
	 public void setisLocked(Boolean isLocked) {
	  this.isLocked = isLocked;
	 }
	 public Boolean getisActive()
	 {
	  return isActive;
	 }
	 public void setisActive(Boolean isActive) {
	  this.isActive = isActive;
	 }
	 public String getContactMobile() {
	  return contactMobile;
	 }
	 public void setContactMobile(String contactMobile) {
	  this.contactMobile = contactMobile;
	 }
	 
	
	 public Integer getUserID() {
	  return userID;
	 }
	 public void setUserID(Integer userID) {
	  this.userID = userID;
	 }
	 public String getUserName() {
	  return userName;
	 }
	 public void setUserName(String userName) {
	  this.userName = userName;
	 }
	 public String getEmailID() {
	  return emailID;
	 }
	 public void setEmailID(String emailID) {
	  this.emailID = emailID;
	 }

	
	 public Integer getPartyId() {
	  return partyId;
	 }
	 public void setPartyId(Integer partyId) {
	  this.partyId = partyId;
	 }
	 public Integer getRecordTypeId() {
	  return recordTypeId;
	 }
	 public void setRecordTypeId(Integer recordTypeId) {
	  this.recordTypeId = recordTypeId;
	 }

	 public Integer getBuPartyId() {
	  return buPartyId;
	 }
	 public void setBuPartyId(Integer buPartyId)
	 {
	  this.buPartyId = buPartyId;
	 }
	 public String getLastName() {
	  return lastName;
	 }
	 public void setLastName(String lastName) {
	  this.lastName = lastName;
	 }
	 public String getRoleName() {
	  return roleName;
	 }
	 public void setRoleName(String roleName) {
	  this.roleName = roleName;
	 }
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public String getSourceSystemID() {
		return sourceSystemID;
	}
	public void setSourceSystemID(String sourceSystemID) {
		this.sourceSystemID = sourceSystemID;
	}
	public String getSourceModule() {
		return sourceModule;
	}
	public void setSourceModule(String sourceModule) {
		this.sourceModule = sourceModule;
	}
	public String getSourceScreen() {
		return sourceScreen;
	}
	public void setSourceScreen(String sourceScreen) {
		this.sourceScreen = sourceScreen;
	}
	public String getAuditdatetime() {
		return auditdatetime;
	}
	public void setAuditdatetime(String auditdatetime) {
		this.auditdatetime = auditdatetime;
	}
	public String getEventID() {
		return eventID;
	}
	public void setEventID(String eventID) {
		this.eventID = eventID;
	}
	public String getDeleteList() {
		return deleteList;
	}
	public void setDeleteList(String deleteList) {
		this.deleteList = deleteList;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getRssFeedName() {
		return rssFeedName;
	}
	
	public void setRssFeedName(String rssFeedName) {
		this.rssFeedName = rssFeedName;
	}
	
	private Boolean isDataWipeOut;
	
	public Boolean getIsDataWipeOut() {
	  return isDataWipeOut;
	}
	
	public void setIsDataWipeOut(Boolean isDataWipeOut) {
		this.isDataWipeOut = isDataWipeOut;
	}

	public String getBuname() {
		return buname;
	}

	public void setBuname(String buname) {
		this.buname = buname;
	}
}



