package in.robo.common.diy.models;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class KeyValue implements Comparable<KeyValue>
{
	@JsonProperty
	private Integer id;
	@JsonProperty
	private String name;
	@JsonProperty
	private String value;
	

	@JsonProperty
	private Integer level;
	
	

	@JsonProperty
	private Integer partyid;
	
	
	
	
	
	
	
	public Integer getPartyid() {
		return partyid;
	}
	public void setPartyid(Integer partyid) {
		this.partyid = partyid;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public KeyValue(){
		
	}
	public KeyValue(Integer id, String name){
		this.id= id;
		this.name = name;
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
	@Override
	public int compareTo(KeyValue o) {
		return this.getName().compareTo(o.getName());
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

		
	
}
