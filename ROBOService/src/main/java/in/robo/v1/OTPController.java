package in.robo.v1;

import in.robo.common.util.BaseResponse;
import in.robo.common.util.FiinfraConstants;
import in.robo.common.v1.vo.Contact;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
 * @author Bajirao.Gharge
 * @created 31/03/2015 description : This OTPController get the otp number of
 *          given client and also update otp flag.
 * @LastModifiedby Smita Jadhav
 * @LastModifiedDate 04/04/2016
 * @Description :Added method for validating OTP.
 */

@Controller
@Path("/v1/otp")
public class OTPController {

	@Autowired
	private RestTemplate restTemplate;

	private static final Logger logger = Logger.getLogger(OTPController.class);


	@Value("${URL_GET_OTPVALIDATE}")
	private String URL_GET_OTPVALIDATE;

		/**
	 * @author Smita.Jadhav
	 * @date 04/04/2016 This controller Validate OTP.
	 * @request /api/v1/validate with @GET method
	 * @param parameter
	 *            - otp , mobile number and set in in.robo.v1015.Contact pojo.
	 * @return response - If user otp is exists then return success response
	 *         other send failure response with reason.
	 * @throws Exception.
	 */

	@SuppressWarnings("unchecked")
	@GET
	@Path("/validate")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOTPValidate(@Context HttpServletRequest request,
			@QueryParam("otp") String otp,
			@QueryParam("mobileNo") String mobileNo) throws Exception {

		logger.info("In proxy : OTPController service side  getOTPValidate method.");
		BaseResponse<Contact> br = null;
		try {
			String url = URL_GET_OTPVALIDATE + "?otp=" + otp + "&mobileNo="
					+ mobileNo;
			br = new BaseResponse<Contact>();
			br = restTemplate.getForObject(url, BaseResponse.class);
		} catch (Exception e) {
			br.setReasonCode(e.getMessage());
			logger.info("Exception :" + e.getMessage());
			br.setStatus(FiinfraConstants.fail);
		}

		logger.info("Return response from getOTPValidate method of OTPController proxy controller.");
		return Response
				.ok()
				// 200
				.entity(br)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods",
						"GET, POST, DELETE, PUT").build();

	}

}
