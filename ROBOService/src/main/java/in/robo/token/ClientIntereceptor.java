package in.robo.token;

/** 
 * @author Nikhil Thakker
 * @Created on 27/08/2015
 * @desc This class interecept the all request and set the Token, buid and Merchantid in header
 */
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class ClientIntereceptor implements ClientHttpRequestInterceptor {

	/**
	 * @author Nikhil Thakker
	 * @Created on 27/08/2015
	 * @param request
	 * @param merchantId
	 * @desc This class interecept the all request and set the Token, buid and
	 *       Merchantid in header
	 */
	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
			throws IOException {

		try {
			HttpServletRequest servletRequest = ((ServletRequestAttributes) RequestContextHolder
					.currentRequestAttributes()).getRequest();

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

			HttpHeaders headers = request.getHeaders();

			if (encreptedString != null) {
				headers.set("token", encreptedString);
			}

			if (buId != null) {
				headers.set("buId", buId);
			}

			if (merchantId != null) {
				headers.set("merchantId", merchantId);
			}

			if (sourceInformation != null) {
				headers.set("sourceInformation", sourceInformation);
			}

			if (macId != null) {
				headers.set("macId", macId);
			}

			headers.set("THREAD", Thread.currentThread().getName());

			return execution.execute(request, body);

		} catch (Exception e) {
			// e.printStackTrace();
		}
		return execution.execute(request, body);
	}

}
