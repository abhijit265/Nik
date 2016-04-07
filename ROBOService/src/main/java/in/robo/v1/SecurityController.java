/** 
 * @author Nikhil Thakkar
 * @Created on 27/08/2015
 * @desc this class will hold all security related methods e.g getToken
 */
package in.robo.v1;

import in.robo.common.util.BaseResponse;
import in.robo.common.util.FiinfraConstants;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
@Path("/security")
public class SecurityController {

	@Value("${URL_GET_TOKEN}")
	private String URL_GET_TOKEN;

	private static final Logger logger = Logger.getLogger(SecurityController.class);

	Response response;

	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * @author Nikhil Thakkar
	 * @param request
	 * @param merchantId
	 * @return Response
	 * @throws ParseException
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 * @desc generates token based on merchant id and return as a resonse
	 */
	@SuppressWarnings("unchecked")
	@GET
	@Path(value = "/getToken/{merchantId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getToken(@Context HttpServletRequest request, @PathParam("merchantId") String merchantId)
			throws ParseException, JsonGenerationException, JsonMappingException, IOException {

		logger.info("In Proxy getToken method");
		
		BaseResponse<String> br = null;
		
		try {
			StringBuilder url = new StringBuilder();
			
			url = url.append(URL_GET_TOKEN).append("/").append(merchantId);
			
			br = new BaseResponse<String>();
			
			br = restTemplate.getForEntity(url.toString(), BaseResponse.class).getBody();

			logger.info("Out Proxy getToken method");
			
			return Response.ok() // 200
					.entity(br).header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
		} catch (Exception e) {

			br.setStatus(FiinfraConstants.fail);
			
			br.setReasonCode(e.getMessage());
			
			logger.info("Out Proxy getToken method");
			
			return Response.ok() // 200
					.entity(br).header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT").build();
		}

	}

}
