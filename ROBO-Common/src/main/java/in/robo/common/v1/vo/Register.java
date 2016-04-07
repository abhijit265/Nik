/**
 * Register.java
 * @author  	Vijay Malusare
 * @CreatedDate   04/04/2016
 * @lastmodifieddate 
 */
package in.robo.common.v1.vo;

public class Register
{
	
	private String firstName;
	private String lastName;
	private String emailId;
	private Integer password;
	private Integer buId;
	private Integer partyId;
	
	
	
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
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
	
		
	@Override
	public String toString() {
		return "register [buId=" + buId + ", partyId="+partyId + ",firstName="
				+ firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + "]";
	}
	
}
