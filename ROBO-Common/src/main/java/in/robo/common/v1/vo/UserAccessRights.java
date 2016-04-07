package in.robo.common.v1.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAccessRights {
private Integer userAccessRightsId ;
	
	private Integer userId;
	
	private Integer sourceSystemId;
	
	private String acessStartDate;
	
	private String acessEndDate;
	
	private Integer noOfDeviceAllowed;
	
	private Integer isAllowed;
	
	private Integer isActive;
	
	private Integer createdBy;
	
	private Integer lastModifiedBy;
	
	private String  createdDate;
	
	private String lastModifiedDate;

	private String userName;
	
	

	private Boolean isDataWipeOut;






	public Boolean getIsDataWipeOut() {
		return isDataWipeOut;
	}
	public void setIsDataWipeOut(Boolean isDataWipeOut) {
		this.isDataWipeOut = isDataWipeOut;
	}
	
	
	
	
	
	
	
	public Integer getUserAccessRightsId() {
		return userAccessRightsId;
	}

	public void setUserAccessRightsId(Integer userAccessRightsId) {
		this.userAccessRightsId = userAccessRightsId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSourceSystemId() {
		return sourceSystemId;
	}

	public void setSourceSystemId(Integer sourceSystemId) {
		this.sourceSystemId = sourceSystemId;
	}

	public String getAcessStartDate() {
		return acessStartDate;
	}

	public void setAcessStartDate(String acessStartDate) {
		this.acessStartDate = acessStartDate;
	}

	public String getAcessEndDate() {
		return acessEndDate;
	}

	public void setAcessEndDate(String acessEndDate) {
		this.acessEndDate = acessEndDate;
	}

	public Integer getNoOfDeviceAllowed() {
		return noOfDeviceAllowed;
	}

	public void setNoOfDeviceAllowed(Integer noOfDeviceAllowed) {
		this.noOfDeviceAllowed = noOfDeviceAllowed;
	}

	public Integer getIsAllowed() {
		return isAllowed;
	}

	public void setIsAllowed(Integer isAllowed) {
		this.isAllowed = isAllowed;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Integer lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
