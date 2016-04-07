package in.robo.common.diy.models;

import java.io.Serializable;

//import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PartyAttribute implements Serializable 
{
	private static final long serialVersionUID = -6274316217872193588L;
	
	@JsonProperty
	private Integer id;
	@JsonProperty
	private Integer partyId;
	@JsonProperty
	private Integer attributeSeqNo;
	@JsonProperty
	private Object attributeValue;
	@JsonProperty
	private Integer createdBy;
	@JsonProperty
	private Integer attributeCodeID;
	@JsonProperty
	private Integer valueDataTypeID;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPartyId() {
		return partyId;
	}
	public void setPartyId(Integer partyId) {
		this.partyId = partyId;
	}
	public Integer getAttributeSeqNo() {
		return attributeSeqNo;
	}
	public void setAttributeSeqNo(Integer attributeSeqNo) {
		this.attributeSeqNo = attributeSeqNo;
	}
	public Object getAttributeValue() {
		return attributeValue;
	}
	public void setAttributeValue(Object attributeValue) {
		this.attributeValue = attributeValue;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Integer getAttributeCodeID() {
		return attributeCodeID;
	}
	public void setAttributeCodeID(Integer attributeCodeID) {
		this.attributeCodeID = attributeCodeID;
	}
	public Integer getValueDataTypeID() {
		return valueDataTypeID;
	}
	public void setValueDataTypeID(Integer valueDataTypeID) {
		this.valueDataTypeID = valueDataTypeID;
	}
	
	
//	@Override
//	public String toString() 
//	{
//		return new ReflectionToStringBuilder(this).toString();
//	}

}
