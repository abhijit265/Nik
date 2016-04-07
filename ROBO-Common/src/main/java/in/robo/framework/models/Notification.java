package in.robo.framework.models;

import java.util.Date;
import java.util.Map;

public class Notification {
	private int buId;
	private int notifyTypeId;
	private int deliveryChannelID ;
	private int sourceSystemID;
	private int notifyEventID;
	private int notifyPartyID;
	private Integer notifyUserID;
	private String sessionID ;
	private int batchJobID;
	private boolean attachmentPresent;
	private int attachmentCount;
	private int attachment1DocumentID; 
	private int attachment2DocumentID ;
	private int attachment3DocumentID;
	private Map<String,String> payloadMap;
	
	
	public int getBuId() {
		return buId;
	}
	public void setBuId(int buId) {
		this.buId = buId;
	}
	public int getNotifyTypeId() {
		return notifyTypeId;
	}
	public void setNotifyTypeId(int notifyTypeId) {
		this.notifyTypeId = notifyTypeId;
	}
	public int getDeliveryChannelID() {
		return deliveryChannelID;
	}
	public void setDeliveryChannelID(int deliveryChannelID) {
		this.deliveryChannelID = deliveryChannelID;
	}
	public int getSourceSystemID() {
		return sourceSystemID;
	}
	public void setSourceSystemID(int sourceSystemID) {
		this.sourceSystemID = sourceSystemID;
	}
	public int getNotifyEventID() {
		return notifyEventID;
	}
	public void setNotifyEventID(int notifyEventID) {
		this.notifyEventID = notifyEventID;
	}
	public int getNotifyPartyID() {
		return notifyPartyID;
	}
	public void setNotifyPartyID(int notifyPartyID) {
		this.notifyPartyID = notifyPartyID;
	}
	public Integer getNotifyUserID() {
		return notifyUserID;
	}
	public void setNotifyUserID(Integer notifyUserID) {
		this.notifyUserID = notifyUserID;
	}
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public int getBatchJobID() {
		return batchJobID;
	}
	public void setBatchJobID(int batchJobID) {
		this.batchJobID = batchJobID;
	}
	public boolean getAttachmentPresent() {
		return attachmentPresent;
	}
	public void setAttachmentPresent(boolean attachmentPresent) {
		this.attachmentPresent = attachmentPresent;
	}
	public int getAttachmentCount() {
		return attachmentCount;
	}
	public void setAttachmentCount(int attachmentCount) {
		this.attachmentCount = attachmentCount;
	}
	public int getAttachment1DocumentID() {
		return attachment1DocumentID;
	}
	public void setAttachment1DocumentID(int attachment1DocumentID) {
		this.attachment1DocumentID = attachment1DocumentID;
	}
	public int getAttachment2DocumentID() {
		return attachment2DocumentID;
	}
	public void setAttachment2DocumentID(int attachment2DocumentID) {
		this.attachment2DocumentID = attachment2DocumentID;
	}
	public int getAttachment3DocumentID() {
		return attachment3DocumentID;
	}
	public void setAttachment3DocumentID(int attachment3DocumentID) {
		this.attachment3DocumentID = attachment3DocumentID;
	}
	public Map<String, String> getPayloadMap() {
		return payloadMap;
	}
	public void setPayloadMap(Map<String, String> payloadMap) {
		this.payloadMap = payloadMap;
	}
	
	
	
	

}
