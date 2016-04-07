package in.robo.common.util;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CodeValueData implements Comparable<CodeValueData>{
	private int codeValueId;
	private int codeTypeId;
	private String codeValue;
	private String codeValueDescription;
	private String codeType;
	private int displaySeqNo;
	private int parentCodeValueId;
	private String mappedValue1;
	private String mappedValue2;
	private String mappedValue3;
	private int isActive;
	private String codeTypeIds;
	public String getCodeTypeIds() {
		return codeTypeIds;
	}

	public void setCodeTypeIds(String codeTypeIds) {
		this.codeTypeIds = codeTypeIds;
	}

	@JsonProperty
	private Integer id;
	@JsonProperty
	private String name;
	
	
	public CodeValueData(){
		
	}
	
	public CodeValueData(int id, String name) {
		this.id= id;
		this.name = name;
	}
	public int getCodeValueId() {
		return codeValueId;
	}
	public void setCodeValueId(int codeValueId) {
		this.codeValueId = codeValueId;
	}
	public int getCodeTypeId() {
		return codeTypeId;
	}
	public void setCodeTypeId(int codeTypeId) {
		this.codeTypeId = codeTypeId;
	}
	public String getCodeValue() {
		return codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	public int getDisplaySeqNo() {
		return displaySeqNo;
	}
	public void setDisplaySeqNo(int displaySeqNo) {
		this.displaySeqNo = displaySeqNo;
	}
	public int getParentCodeValueId() {
		return parentCodeValueId;
	}
	public void setParentCodeValueId(int parentCodeValueId) {
		this.parentCodeValueId = parentCodeValueId;
	}
	public String getMappedValue1() {
		return mappedValue1;
	}
	public void setMappedValue1(String mappedValue1) {
		this.mappedValue1 = mappedValue1;
	}
	public String getMappedValue2() {
		return mappedValue2;
	}
	public void setMappedValue2(String mappedValue2) {
		this.mappedValue2 = mappedValue2;
	}
	public String getMappedValue3() {
		return mappedValue3;
	}
	public void setMappedValue3(String mappedValue3) {
		this.mappedValue3 = mappedValue3;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	@Override
	public int compareTo(CodeValueData codeVal) {
		return codeValue.compareTo(codeVal.getCodeValue());
	}

	public String getCodeValueDescription() {
		return codeValueDescription;
	}

	public void setCodeValueDescription(String codeValueDescription) {
		this.codeValueDescription = codeValueDescription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}
	
}
