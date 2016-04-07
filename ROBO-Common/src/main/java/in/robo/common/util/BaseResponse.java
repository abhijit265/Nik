package in.robo.common.util;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BaseResponse<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	private String status;
	private String reasonCode;
	private T responseObject;
	private List<T> responseListObject;
	
	public T getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(T responseObject) {
		this.responseObject = responseObject;
	}

	public List<T> getResponseListObject() {
		return responseListObject;
	}

	public void setResponseListObject(List<T> responseListObject) {
		this.responseListObject = responseListObject;
	}

	public BaseResponse() {
		super();
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(" Status : " + this.getStatus());
		buffer.append(" Reason Code : " + this.getReasonCode());
		return buffer.toString();
	}
}
