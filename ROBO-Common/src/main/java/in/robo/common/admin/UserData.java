package in.robo.common.admin;

public class UserData {

	private String name;
	private int partyId;
	private int roleId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPartyId() {
		return partyId;
	}
	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	private String userName;
	private String userPassword;
	private String userEmailId;
	private int buID;
	private String userDataXML;
	private String lastModifiedDate;
	private int createdBy;
	private String partyIds;
	
	public String getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	
	
	

	public int getBuID() {
		return buID;
	}
	public void setBuID(int buID) {
		this.buID = buID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getUserDataXML() {
		return userDataXML;
	}
	public void setUserDataXML(String userDataXML) {
		this.userDataXML = userDataXML;
	}
	public String getPartyIds() {
		return partyIds;
	}
	public void setPartyIds(String partyIds) {
		this.partyIds = partyIds;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	
}
