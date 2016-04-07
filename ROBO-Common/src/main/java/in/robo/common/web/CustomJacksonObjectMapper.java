package in.robo.common.web;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

public class CustomJacksonObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = -3307387267918247717L;

	public CustomJacksonObjectMapper() {
		super();
		this.setSerializationInclusion(Inclusion.NON_NULL);
		//this.configure(Feature.WRITE_DATES_AS_TIMESTAMPS, false);
		//SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		//this.setDateFormat(format);
		
	}
}