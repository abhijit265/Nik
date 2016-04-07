package in.robo.common.token;

import in.robo.common.util.FiinfraConstants;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.commons.lang.time.DateUtils;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;



public class FiinfraTokenDecrypter {
	
	
	
	private static final Logger LOGGER = Logger.getLogger(FiinfraTokenDecrypter.class);
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
	private static final String VALID_TOKEN_TIME_IN_MINUTE="validTokenMinute";
	
	
	@Autowired
	RestTemplate restTemplate;
	
	
	static String nurl;
	
	
	public FiinfraTokenDecrypter() {
	}

	public static Map<String, String> decryptToken(String token)
			throws FiinfraTokenException {

		try {
			Map<String, String> map = new HashMap<String, String>();

			String decodedToken = token;
			decodedToken = URLDecoder.decode(token, "UTF-8");
			
			String decryptedToken = (new FiinfraCipher()).decrypt(decodedToken);
			StringTokenizer sz = new StringTokenizer(decryptedToken, "|");

			while (sz.hasMoreTokens()) {
				String s = sz.nextToken();
				//LOGGER.info("s " + s);
				String[] keyVal = s.split("~");
				map.put(keyVal[0], keyVal[1]);
			}
			
			map.put("isTokenValid", "true");
			
			
			
			return map;

		} catch (Exception ex) {
			throw new FiinfraTokenException(ex);
		}
	}
	
	// by abhijit for guest iin screen 
	
	public static Map<String, String> decryptTokenForGuestIINScreen(String token)
			throws FiinfraTokenException {

		try {
			Map<String, String> map = new HashMap<String, String>();

			String decodedToken = token;
			decodedToken = token;	//URLDecoder.decode(token, "UTF-8");
			
			String decryptedToken = (new FiinfraCipher()).decrypt(decodedToken);
			StringTokenizer sz = new StringTokenizer(decryptedToken, "|");

			while (sz.hasMoreTokens()) {
				String s = sz.nextToken();
				//LOGGER.info("s " + s);
				String[] keyVal = s.split("~");
				map.put(keyVal[0], keyVal[1]);

			}
			
			map.put("isTokenValid", "true");
			return map;

		} catch (Exception ex) {
			throw new FiinfraTokenException(ex);
		}
	}
	
	
	/*public static Boolean isTokenValidated(String ipaddress,String deceptedString)
	{
	try
		{
			
			Properties prop = new Properties();
			String MerchantAddress = "";
		 
			try {
		 
			  InputStream inputStream = 
			    FileHelper.class.getClassLoader().getResourceAsStream("ApplicationResources.properties");
		 
			  prop.load(inputStream);
			  MerchantAddress = prop.getProperty("MERCHANT_URL");
		 
			} catch (IOException e) {
				e.printStackTrace();
			}
		 
			
			Map<String, String> tokenMap = decryptToken(deceptedString);
			String ipAddress = tokenMap.get("ipAddress");
			Integer sourceSystemId =Integer.valueOf(tokenMap.get("applicationId"));
			
			if(sourceSystemId!=FiinfraConstants.PARTNER_PORTAL&&sourceSystemId!=FiinfraConstants.SERVICE_PORTAL
					&&sourceSystemId!=FiinfraConstants.CLIENT_PORTAL&&sourceSystemId!=FiinfraConstants.DIY
					&&sourceSystemId!=FiinfraConstants.INTEGRATION_PORTAL)
			{
				//String url = null;
				MerchantAddress+=sourceSystemId+"/"+ipAddress+"/"+"localhost";
			  	RestTemplate rs=new RestTemplate();
			  	String result = rs.getForObject(MerchantAddress, String.class);
			  	System.out.println("sucess");
			  	if (result.equalsIgnoreCase("sucess"))
			  		return true;
			  	else
			  		return false;
			  	
			}
			
			if(ipaddress.equalsIgnoreCase(ipAddress) && sourceSystemId == FiinfraConstants.PARTNER_PORTAL
				|| sourceSystemId == FiinfraConstants.SERVICE_PORTAL
				|| sourceSystemId == FiinfraConstants.CLIENT_PORTAL
				|| sourceSystemId == FiinfraConstants.DIY
				|| sourceSystemId == FiinfraConstants.INTEGRATION_PORTAL){
				return true;
			}
			else
				return false;
		} 
		catch (FiinfraTokenException e) 
		{
			e.printStackTrace();
		}
		return true;
	
	}*/
	
	@SuppressWarnings("deprecation")
	public static Boolean isTokenValidated(String deceptedString,String merchantId) throws IOException
	{
		InputStream inputStream;
	try
		{
		Properties prop = new Properties();
		inputStream = FileHelper.class.getClassLoader().getResourceAsStream("ApplicationResources.properties");
		  prop.load(inputStream);
		 boolean isValidMerchant = prop.containsKey(merchantId);
		 if(!isValidMerchant){
			 return false;
		 }
			Map<String, String> tokenMap = decryptToken(deceptedString);
			String mId =String.valueOf(tokenMap.get("merchantId"));
			if(mId==null){
				String serviceName =String.valueOf(tokenMap.get("serviceName"));
				if(serviceName==null){
					return false;
				}else{
					return true;
				}
				
			}else if(mId.equals("null")){
				String serviceName =String.valueOf(tokenMap.get("serviceName"));
				if(serviceName==null){
					return false;
				}else{
					return true;
				}
				
			}
			LOGGER.info("tokenTime:---"+tokenMap.get("tokenTime"));
			Date tokenTime =sdf.parse(tokenMap.get("tokenTime"));
			Date currentDate = new Date();
			int tokenvalidMinutes=0;
			Properties prop1 = new Properties();
			InputStream inputStream1 ;
			try { 
				inputStream1 = 
				  FileHelper.class.getClassLoader().getResourceAsStream("ApplicationResources.properties");
				  prop1.load(inputStream1);
				  tokenvalidMinutes = Integer.valueOf(prop1.get(VALID_TOKEN_TIME_IN_MINUTE).toString());
				  inputStream1.close();
				} catch (IOException e) {
					e.printStackTrace();
					return false;
				}
			LOGGER.info("tokenTime:---"+tokenTime);
			LOGGER.info("tokenvalidMinutes:---"+tokenvalidMinutes);
			LOGGER.info("Merchant ID from Token:---"+mId);
			LOGGER.info("Merchant ID from Request:---"+merchantId); 
			Date tokenValidTime=DateUtils.addMinutes(tokenTime, tokenvalidMinutes);
			if(tokenValidTime.before(currentDate) || !mId.equals(merchantId))//validates merchant id as well as token age
				return false;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
		
		return true;
		

	}
	
	@SuppressWarnings("deprecation")
	public static Boolean validateLocalToken(String ipAddress,String token){
		try
		{
			Map<String, String> tokenMap = decryptToken(token);
			String IPAddress = tokenMap.get("ipAddress");
			/*Date requestDate = new Date(sdf.format(tokenMap.get("tokenTime")));
			Date currentDate = DateUtils.addMilliseconds(new Date(), 5);//added time spam of 5 minute
*/			Integer sourceSystemId =Integer.valueOf(tokenMap.get("applicationId"));
			if(IPAddress.equalsIgnoreCase(ipAddress) && sourceSystemId == FiinfraConstants.PARTNER_PORTAL
				|| sourceSystemId == FiinfraConstants.SERVICE_PORTAL
				|| sourceSystemId == FiinfraConstants.CLIENT_PORTAL
				|| sourceSystemId == FiinfraConstants.DIY
				|| sourceSystemId == FiinfraConstants.INTEGRATION_PORTAL
				|| sourceSystemId == FiinfraConstants.SPA_PORTAL//&& requestDate.before(currentDate)
				){
				return true;
			}
			else
				return false;
		} 
		catch (FiinfraTokenException e) 
		{
			e.printStackTrace();
		}
		return true;
	}
}
