package in.robo.framework.models;

public class Audit {
	private int actionByPartyId; 
	private int actionByUserID ;	
	private int eventID; 
	private String eventName;	
	private String eventTextXML	;
	private int sourceSystemID ;	
	private String sourceModule; 	
	private String sourceScreen; 	
	private String objectName ;	
	private String progamNo ;	
	private String dbProc; 	
	private int sessionID;
	private int buId;
	private String macId;
	public int getActionByPartyId() {
		return actionByPartyId;
	}
	public String getMacId() {
		return macId;
	}
	public void setMacId(String macId) {
		this.macId = macId;
	}
	public void setActionByPartyId(int actionByPartyId) {
		this.actionByPartyId = actionByPartyId;
	}
	public int getActionByUserID() {
		return actionByUserID;
	}
	public void setActionByUserID(int actionByUserID) {
		this.actionByUserID = actionByUserID;
	}
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventTextXML() {
		return eventTextXML;
	}
	public void setEventTextXML(String eventTextXML) {
		this.eventTextXML = eventTextXML;
	}
	public int getSourceSystemID() {
		return sourceSystemID;
	}
	public void setSourceSystemID(int sourceSystemID) {
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
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public String getProgamNo() {
		return progamNo;
	}
	public void setProgamNo(String progamNo) {
		this.progamNo = progamNo;
	}
	public String getDbProc() {
		return dbProc;
	}
	public void setDbProc(String dbProc) {
		this.dbProc = dbProc;
	}
	public int getSessionID() {
		return sessionID;
	}
	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	}
	
	public int getBuId() {
		return buId;
	}
	public void setBuId(int buId) {
		this.buId = buId;
	}
	
//	public  Audit(int actionByPartyId,int actionByUserID,int eventID,int sourceSystemID,String sourceModule,String sourceScreen){
//		this.actionByPartyId=actionByPartyId;
//		this.actionByUserID=actionByUserID;
//		this.eventID=eventID;
//		this.sourceSystemID=sourceSystemID;
//		this.sourceModule=sourceModule;
//		this.sourceScreen=sourceScreen;
//	}
	
	@Override
	public String toString() {
		return "Audit [actionByPartyId=" + actionByPartyId
				+ ", actionByUserID=" + actionByUserID + ", eventID=" + eventID
				+ ", eventName=" + eventName + ", eventTextXML=" + eventTextXML
				+ ", sourceSystemID=" + sourceSystemID + ", sourceModule="
				+ sourceModule + ", sourceScreen=" + sourceScreen
				+ ", objectName=" + objectName + ", progamNo=" + progamNo
				+ ", dbProc=" + dbProc + ", sessionID=" + sessionID + ", buId="
				+ buId + "]";
	}
	
	
	

}
