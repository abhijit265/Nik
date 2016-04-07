package in.robo.common.diy.models;

import java.io.Serializable;

//import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PasswordPolicy implements Serializable 
{
	private static final long serialVersionUID = -8043249534264443827L;
	
	@JsonProperty
	private String attributeValue;
	@JsonProperty
	private Integer attributCodeId;
	
		
	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}


	public Integer getAttributCodeId() {
		return attributCodeId;
	}

	public void setAttributCodeId(Integer attributCodeId) {
		this.attributCodeId = attributCodeId;
	}

//	@Override
//	public String toString() 
//	{
//		return new ReflectionToStringBuilder(this).toString();
//	}
	

}
