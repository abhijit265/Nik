package in.robo.common.token;

import in.robo.common.authentication.LoginUtlility;
import in.robo.common.diy.models.UserSession;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class ClientIntereceptor implements ClientHttpRequestInterceptor
{
	private static final Logger LOGGER = Logger.getLogger(ClientIntereceptor.class);

	@Override
	public ClientHttpResponse intercept(HttpRequest request, byte[] body,
			ClientHttpRequestExecution execution) throws IOException {
		// TODO Auto-generated method stub
		try 
		{
			HttpServletRequest servletRequest =((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
			String IPAddress="";
			if(servletRequest != null){
				IPAddress = servletRequest.getLocalAddr();
				LOGGER.info("ip at client  remote "+IPAddress);
				//IPAddress = request.getURI().getHost();//if not IP address then go with server name
			}
			UserSession userSession = (UserSession) servletRequest.getSession().getAttribute("userSession");
			String buId=null;
			String url = request.getURI().toString();
			System.out.println("In Client Intercepr   url:--"+url);
			buId=(String) servletRequest.getSession().getAttribute("buIdFromWelcome");
			System.out.println("In Client Intercepr buid buIdFromWelcome "+buId);
			if(userSession != null && buId==null){				
				buId=String.valueOf(userSession.getBuId());
				System.out.println("In Client Intercepr buid from session "+buId);
			}
			if(buId==null || buId==""){
				buId=servletRequest.getParameter("buId");
				System.out.println("In Client Intercepr buid from request "+buId);
				/*if(url.contains("-eof-"))
					buId=url.substring(url.indexOf("-eof-")+5);
					//if(buId.contains("&")){
						//buId=buId.substring(0,buId.indexOf("&"));
					//}
				}*/
				//System.out.println("In Client Intercepr buid from request 2222  "+buId);
				
				if(buId == null || buId==""){
					
					
					buId = LoginUtlility.getBuIdForUrl(url);
					System.out.println("In Client Intercepr buid from url "+buId);
				}
			}else{
				
			}
			System.out.println("In Client Intercepr   "+buId);
			// getting source system id through property file
			String sourceSystemID = "31001";// default partner portal
			//read properties file
			Properties properties = new Properties();
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream("token.properties");
			if(inputStream != null){
				properties.load(inputStream);
				sourceSystemID = properties.getProperty("SOURCE_SYSTEM_ID");
			}
			String username = "Ketan";
			String encreptedString = FiinfraToken.generateRestToken(username, sourceSystemID, IPAddress);
			HttpHeaders headers = request.getHeaders();
			headers.set("token", encreptedString);
			headers.set("buId",buId);
			return execution.execute(request, body);
		} catch (FiinfraTokenException e) {
			e.printStackTrace();
		}
		return execution.execute(request, body);
	}

}
