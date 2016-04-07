package in.robo.common.util;

import in.robo.common.authentication.LoginUtlility;
import in.robo.common.diy.models.UserSession;
import in.robo.common.token.FiinfraToken;
import in.robo.common.token.FiinfraTokenException;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class OFARestClient {

	private static final Logger LOGGER = Logger.getLogger(OFARestClient.class);


	public static BaseResponse servicePostForObject(String url, Object requestObject,Object BaseResponse, HttpServletRequest servletRequest) {

		Client client = Client.create();

		WebResource webResource = client.resource(url);

		String jsonRequest = JsonConverterUtility.objectToJSON(requestObject);

		Builder builder = webResource.accept("application/json");

		builder.header("Content-Type", "application/json");

		String encreptedString = servletRequest.getHeader("token");

		String buId = servletRequest.getHeader("buId");

		if (buId == null) {
			try {
				buId = servletRequest.getParameter("buId").toString();
			} catch (Exception e) {

			}

		}

		String merchantId = servletRequest.getHeader("merchantId");

		if (merchantId == null) {
			encreptedString = "1234";
		}

		String sourceInformation = servletRequest.getHeader("sourceInformation");

		String macId = servletRequest.getHeader("macId");

		if (encreptedString != null) {
			builder.header("token", encreptedString);
		}

		if (buId != null) {
			builder.header("buId", buId);
		}

		if (merchantId != null) {
			builder.header("merchantId", merchantId);
		}

		if (sourceInformation != null) {
			builder.header("sourceInformation", sourceInformation);
		}

		if (macId != null) {
			builder.header("macId", macId);
		}

		builder.header("THREAD", Thread.currentThread().getName());

		ClientResponse response = builder.post(ClientResponse.class, jsonRequest);

		BaseResponse baseResponse = response.getEntity(BaseResponse.class);

		return baseResponse;
	}
	
	
	public static BaseResponse serviceGetForEntity(String url, Object BaseResponse, HttpServletRequest servletRequest) {

		Client client = Client.create();

		WebResource webResource = client.resource(url);

		Builder builder = webResource.accept("application/json");

		builder.header("Content-Type", "application/json");

		String encreptedString = servletRequest.getHeader("token");

		String buId = servletRequest.getHeader("buId");

		if (buId == null) {
			try {
				buId = servletRequest.getParameter("buId").toString();
			} catch (Exception e) {

			}

		}

		String merchantId = servletRequest.getHeader("merchantId");

		if (merchantId == null) {
			encreptedString = "1234";
		}

		String sourceInformation = servletRequest.getHeader("sourceInformation");

		String macId = servletRequest.getHeader("macId");

		if (encreptedString != null) {
			builder.header("token", encreptedString);
		}

		if (buId != null) {
			builder.header("buId", buId);
		}

		if (merchantId != null) {
			builder.header("merchantId", merchantId);
		}

		if (sourceInformation != null) {
			builder.header("sourceInformation", sourceInformation);
		}

		if (macId != null) {
			builder.header("macId", macId);
		}

		ClientResponse response = builder.get(ClientResponse.class);

		BaseResponse baseResponse = response.getEntity(BaseResponse.class);

		return baseResponse;
	}
	
	
	

	public static BaseResponse postForObject(String url, Object requestObject, Object BaseResponse) {

		Client client = Client.create();

		WebResource webResource = client.resource(url);

		String jsonRequest = JsonConverterUtility.objectToJSON(requestObject);

		Builder builder = webResource.accept("application/json");

		builder.header("Content-Type", "application/json");

		ClientResponse response = builder.post(ClientResponse.class, jsonRequest);

		BaseResponse baseResponse = response.getEntity(BaseResponse.class);

		return baseResponse;
	}

	public static BaseResponse postForObject(String url, Object requestObject, Object BaseResponse,
			HttpServletRequest servletRequest) {

		Client client = Client.create();

		WebResource webResource = client.resource(url);

		String jsonRequest = JsonConverterUtility.objectToJSON(requestObject);

		Builder builder = webResource.accept("application/json");

		builder.header("Content-Type", "application/json");

		String IPAddress = "";

		if (servletRequest != null) {
			IPAddress = servletRequest.getLocalAddr();
		}

		UserSession userSession = (UserSession) servletRequest.getSession().getAttribute("userSession");
		String buId = null;
		buId = (String) servletRequest.getSession().getAttribute("buIdFromWelcome");

		if (userSession != null && buId == null) {
			buId = String.valueOf(userSession.getBuId());
		}

		if (buId == null || buId == "") {
			buId = servletRequest.getParameter("buId");

			if (buId == null || buId == "") {

				buId = LoginUtlility.getBuIdForUrl(url);
			}
		} else {

		}

		String encreptedString = "";

		String sourceSystemID = "31001";// default partner portal

		sourceSystemID = TokenPropertyReader.getInstance().getProperty("SOURCE_SYSTEM_ID");

		String username = "OFA";

		try {
			encreptedString = FiinfraToken.generateRestToken(username, sourceSystemID, IPAddress);
		} catch (FiinfraTokenException e) {
			// e.printStackTrace();
		}
		builder.header("token", encreptedString);
		builder.header("buId", buId);

		ClientResponse response = builder.post(ClientResponse.class, jsonRequest);

		BaseResponse baseResponse = response.getEntity(BaseResponse.class);

		return baseResponse;
	}

	public static BaseResponse getForEntity(String url, Object responseType) {

		Client client = Client.create();

		WebResource webResource = client.resource(url);

		Builder builder = webResource.accept("application/json");

		builder.header("Content-Type", "application/json");

		ClientResponse response = builder.get(ClientResponse.class);

		BaseResponse baseResponse = response.getEntity(BaseResponse.class);

		return baseResponse;
	}

	public static BaseResponse getForEntity(String url, Object responseType, HttpServletRequest servletRequest) {

		Client client = Client.create();

		WebResource webResource = client.resource(url);

		Builder builder = webResource.accept("application/json");

		builder.header("Content-Type", "application/json");

		String IPAddress = "";

		if (servletRequest != null) {
			IPAddress = servletRequest.getLocalAddr();
		}

		UserSession userSession = (UserSession) servletRequest.getSession().getAttribute("userSession");
		String buId = null;
		buId = (String) servletRequest.getSession().getAttribute("buIdFromWelcome");

		if (userSession != null && buId == null) {
			buId = String.valueOf(userSession.getBuId());
		}

		if (buId == null || buId == "") {
			buId = servletRequest.getParameter("buId");

			if (buId == null || buId == "") {

				buId = LoginUtlility.getBuIdForUrl(url);
			}
		} else {

		}

		String encreptedString = "";

		String sourceSystemID = "31001";// default partner portal

		TokenPropertyReader.getInstance().getProperty("SOURCE_SYSTEM_ID");

		String username = "OFA";

		try {
			encreptedString = FiinfraToken.generateRestToken(username, sourceSystemID, IPAddress);
		} catch (FiinfraTokenException e) {
			// e.printStackTrace();
		}
		builder.header("token", encreptedString);
		builder.header("buId", buId);

		ClientResponse response = builder.get(ClientResponse.class);

		BaseResponse baseResponse = response.getEntity(BaseResponse.class);

		return baseResponse;
	}

	public static BaseResponse getForEntity(String url, Map<String, ?> urlVariables,
			HttpServletRequest servletRequest) {

		Client client = Client.create();

		WebResource webResource = client.resource(url);

		// String jsonRequest =
		// JsonConverterUtility.objectToJSON(requestObject);

		Builder builder = webResource.accept("application/json");

		builder.header("Content-Type", "application/json");

		String IPAddress = "";

		if (servletRequest != null) {
			IPAddress = servletRequest.getLocalAddr();
		}

		UserSession userSession = (UserSession) servletRequest.getSession().getAttribute("userSession");
		String buId = null;
		buId = (String) servletRequest.getSession().getAttribute("buIdFromWelcome");

		if (userSession != null && buId == null) {
			buId = String.valueOf(userSession.getBuId());
		}

		if (buId == null || buId == "") {
			buId = servletRequest.getParameter("buId");

			if (buId == null || buId == "") {

				buId = LoginUtlility.getBuIdForUrl(url);
			}
		} else {

		}

		String encreptedString = "";

		String sourceSystemID = "31001";// default partner portal

		TokenPropertyReader.getInstance().getProperty("SOURCE_SYSTEM_ID");

		String username = "OFA";

		try {
			encreptedString = FiinfraToken.generateRestToken(username, sourceSystemID, IPAddress);
		} catch (FiinfraTokenException e) {
			// e.printStackTrace();
		}
		builder.header("token", encreptedString);
		builder.header("buId", buId);

		ClientResponse response = builder.get(ClientResponse.class);

		BaseResponse baseResponse = response.getEntity(BaseResponse.class);

		return baseResponse;
	}

	public static BaseResponse getForObject(String url, Object BaseResponse, HttpServletRequest servletRequest) {

		Client client = Client.create();

		WebResource webResource = client.resource(url);

		// String jsonRequest =
		// JsonConverterUtility.objectToJSON(requestObject);

		Builder builder = webResource.accept("application/json");

		builder.header("Content-Type", "application/json");

		String IPAddress = "";

		if (servletRequest != null) {
			IPAddress = servletRequest.getLocalAddr();
		}

		UserSession userSession = (UserSession) servletRequest.getSession().getAttribute("userSession");
		String buId = null;
		buId = (String) servletRequest.getSession().getAttribute("buIdFromWelcome");

		if (userSession != null && buId == null) {
			buId = String.valueOf(userSession.getBuId());
		}

		if (buId == null || buId == "") {
			buId = servletRequest.getParameter("buId");

			if (buId == null || buId == "") {

				buId = LoginUtlility.getBuIdForUrl(url);
			}
		} else {

		}

		String encreptedString = "";

		String sourceSystemID = "31001";// default partner portal

		TokenPropertyReader.getInstance().getProperty("SOURCE_SYSTEM_ID");

		String username = "OFA";

		try {
			encreptedString = FiinfraToken.generateRestToken(username, sourceSystemID, IPAddress);
		} catch (FiinfraTokenException e) {
			// e.printStackTrace();
		}
		builder.header("token", encreptedString);
		builder.header("buId", buId);

		ClientResponse response = builder.get(ClientResponse.class);

		BaseResponse baseResponse = response.getEntity(BaseResponse.class);

		return baseResponse;
	}

}
