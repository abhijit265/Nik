package in.robo.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.ws.rs.QueryParam;

public  class BaseRequest {
	
	public static final String DEFAULT_DATE_FORMAT = "yyyyMMdd";
	public static final String DEFAULT_TIME_FORMAT = "HHmm";
	
	@QueryParam("page")
	private Integer page ;
	private Integer rows ;
	private String orderBy;
	
	@QueryParam("partyId")
	private Integer partyId ;
	@QueryParam("buId")
	private Integer buId;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String buildQueryString(){
		StringBuilder sb = new StringBuilder();
		appendAll(sb);

		return sb.toString();
	}
	
	@QueryParam("lastUpdatedBy")
	private int lastUpdatedBy;

	public int getLastUpdatedBy() {
		return lastUpdatedBy;
	}


	public void setLastUpdatedBy(int lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	

	public static  void append(StringBuilder sb, String key,Long value){
		if(value != null){
			append(sb, key, value.toString());
		}
	}

	public static  void append(StringBuilder sb, String key,Boolean value){
		if(value != null){
			append(sb, key, value.toString());
		}
	}

	public static  void append(StringBuilder sb, String key,Integer value){
		if(value != null && value > 0){
			append(sb, key, value.toString());
		}
	}

	public static  void append(StringBuilder sb, String key,Date value){
		if(value != null){
			append(sb, key, format(value));
		}
	}
	
	public static String format(Date date){
		if(date ==null){
			return null;
		}
		return new SimpleDateFormat(DEFAULT_DATE_FORMAT,
				Locale.getDefault()).format(date);

	}

	public static void append(StringBuilder sb, String key,String value){
		if(value != null && !value.trim().isEmpty() ){
		if(sb.length() >0){
			sb.append("&");
		}

		sb.append(encode(key, value));
		}
	}
	public static void appendWithoutEncode(StringBuilder sb, String key,String value){
		if(value != null && !value.trim().isEmpty() ){
		if(sb.length() >0){
			sb.append("&");
		}

		sb.append(key+"="+value);
		}
	}

	
	public static  String encode(String name, String value) {
	    try {
	      return URLEncoder.encode(name, "UTF-8") + "=" + URLEncoder.encode(value, "UTF-8");
	    } catch (UnsupportedEncodingException ex) {
	      throw new RuntimeException("Broken VM does not support UTF-8");
	    }
	  }

	public static  String decode(String value) {
	    try {
	      return URLDecoder.decode(value, "UTF-8") ;
	    } catch (UnsupportedEncodingException ex) {
	      throw new RuntimeException("Broken VM does not support UTF-8");
	    }
	  }

	protected void appendAll(StringBuilder sb) {
		append(sb, "partyId", this.partyId);
		append(sb, "buId", this.buId);
		append(sb, "page", this.page);
		append(sb, "rows", this.rows);
		append(sb, "lastUpdatedBy", this.lastUpdatedBy);
	}

	public Integer getPartyId() {
		return partyId;
	}

	public void setPartyId(Integer partyId) {
		this.partyId = partyId;
	}

	public Integer getBuId() {
		return buId;
	}

	public void setBuId(Integer buId) {
		this.buId = buId;
	}
	
	public static boolean isEmpty(Integer val){
		return val ==null || val <=0;
	}
}
