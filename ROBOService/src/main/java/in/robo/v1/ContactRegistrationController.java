package in.robo.v1;

import in.robo.common.util.BaseResponse;
import in.robo.common.util.OFARestClient;

import in.robo.common.v1.vo.Register;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author Vijay Malusare
 * @date 04-Apr-2016 
 * This controller pass the data to the app side ContactRegistrationRegistrationFacade for further operations.And return response to client.
 * @LastModifiedby 
 * @LastModifiedDate 
 * @Description : 
 */

@Controller
@Path("/v1/register")
public class ContactRegistrationController 
{
	

	
	@Autowired
	private RestTemplate restTemplate;

	private static final Logger logger = Logger
			.getLogger(ContactRegistrationController.class);
	
	@Value("${URL_UPDATE_USER_DETAILS}")
	private String URL_UPDATE_USER_DETAILS;
	
	
	@SuppressWarnings("unchecked")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)	
	public Response updateUserdetails(@Context HttpServletRequest request,
			Register register) throws IOException, ParseException {
		
		logger.info("In proxy controller : @PUT METHOD of ContactRegistrationController service side  updateUserDetails ."+register.toString());

		BaseResponse<Register> br = new BaseResponse<Register>();
		
		String url = URL_UPDATE_USER_DETAILS;
				 
			br =OFARestClient.servicePostForObject(url, register,BaseResponse.class, request);
			
		
	logger.info("Return response from updateUserDetails method of ContactRegistrationController proxy controller."+br.toString());
		
		return Response.ok().entity(br).header("Access-Control-Allow-Origin", "*").header("Access-Control-Allow-Methods",
						"GET, POST, DELETE, PUT").build();

	}	
}
