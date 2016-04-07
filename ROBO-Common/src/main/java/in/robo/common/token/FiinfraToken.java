package in.robo.common.token;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


public class FiinfraToken {

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
	
	
	public String generateWebIntegrationToken(String userName, String applicationId, String ipAddress) throws FiinfraTokenException {
		try {
			FiinfraCipher cipher = new FiinfraCipher();
			String token = "userName~"+userName+
					"|applicationId~"+applicationId+
					"|ipAddress~"+ipAddress+
					"|tokenTime~"+sdf.format(new Date());
			
			String encryptedToken = cipher.encrypt(token);
			String encodedToken = URLEncoder.encode(encryptedToken, "UTF-8");
			return encodedToken;
		} catch (Exception ex) {
			throw new FiinfraTokenException(ex);
		}
	}

	

	public static String generateThirdPartyToken(String domainName, String merchantId, String ipAddress) throws FiinfraTokenException {
		try {
			FiinfraCipher cipher = new FiinfraCipher();
			String token = "domainName~"+domainName+
					"|applicationId~"+merchantId+
					"|ipAddress~"+ipAddress+
					"|tokenTime~"+sdf.format(new Date());
			
			String encryptedToken = cipher.encrypt(token);
			String encodedToken = URLEncoder.encode(encryptedToken, "UTF-8");
			return encodedToken;
		} catch (Exception ex) {
			throw new FiinfraTokenException(ex);
		}
	}

	
	
	public static String generateLocalToken(String userName, String applicationId,String ipAddress) throws FiinfraTokenException {
		try {
			FiinfraCipher cipher = new FiinfraCipher();
			String token = "userName~"+userName+
					"|applicationId~"+applicationId+
					"|ipAddress~"+ipAddress+
					"|tokenTime~"+sdf.format(new Date());
					
			String encryptedToken = cipher.encrypt(token);
			String encodedToken = URLEncoder.encode(encryptedToken, "UTF-8");
			
			return encodedToken;
		} catch (Exception ex) {
			throw new FiinfraTokenException(ex);
		}
	}
	
	public static String generateRestToken(String serviceName, String applicationId, String ipAddress) throws FiinfraTokenException {
		try {
			FiinfraCipher cipher = new FiinfraCipher();
			String token = "serviceName~"+serviceName+
					"|applicationId~"+applicationId+
					"|ipAddress~"+ipAddress+
					"|tokenTime~"+sdf.format(new Date());
						
			String encryptedToken = cipher.encrypt(token);
			String encodedToken = URLEncoder.encode(encryptedToken, "UTF-8");
			return encodedToken;
		} catch (Exception ex) {
			throw new FiinfraTokenException(ex);
		}
	}

	public String generateWSToken(String serviceName, String applicationId, String ipAddress) throws FiinfraTokenException {
		return generateRestToken(serviceName, applicationId, ipAddress);
	}
	/**
	 * @author Nikhil Thakkar
	 * @Created on 27/08/2015
	 * @param merchantId
	 * @return
	 * @throws FiinfraTokenException
	 * @Purpose Below method generates token from merchant Id and current time which will be used to identify the user who is calling any API 
	 */
	public static String generateTokenByPartyId( String merchantId) throws FiinfraTokenException {
	    try {
	     FiinfraCipher cipher = new FiinfraCipher();
	     String token = "merchantId~"+merchantId+
	       "|tokenTime~"+sdf.format(new Date());
	     String encryptedToken = cipher.encrypt(token);
	     String encodedToken = URLEncoder.encode(encryptedToken, "UTF-8");
	     return encodedToken;
	    } catch (Exception ex) {
	     throw new FiinfraTokenException(ex);
	    }
	   }
	
	/**
	 * @author Amruta Badgujar
	 * @Created on 15/10/2015
	 * @return
	 * @throws FiinfraTokenException
	 * @Purpose Below method generates token from merchant Id and current time which will be used to identify the user who is calling any API 
	 */
	public static String generateTokenForIINLink(int partyId,int contactId,int buId,String kyc) throws FiinfraTokenException {
		 try {
		     FiinfraCipher cipher = new FiinfraCipher();
		     String token = "partyId~"+partyId+
		    		 "|contactId~"+contactId+
		    		 "|buId~"+buId+
		    		 "|kyc~"+kyc+
		       "|tokenTime~"+sdf.format(new Date());
		     String encryptedToken = cipher.encrypt(token);
		     String encodedToken = URLEncoder.encode(encryptedToken, "UTF-8");
		     return encodedToken;
		    } catch (Exception ex) {
		     throw new FiinfraTokenException(ex);
		    }
	}
	
	/**
	 * @author Mrunal Sangawar
	 * @Created on 15/10/2015
	 * @return
	 * @throws FiinfraTokenException
	 * @Purpose Below method generates token from merchant Id and current time which will be used to identify the user who is calling any API 
	 */
	public static String generateTokenForFatcaLink(int partyId,int contactId,int buId,String taxStatusId,String panNo,String iin,String userId,String invName) throws FiinfraTokenException {
		 try {
		     FiinfraCipher cipher = new FiinfraCipher();
		     String token = "partyId~"+partyId+
		    		 "|contactId~"+contactId+
		    		 "|buId~"+buId+
		    		 "|taxStatusId~"+taxStatusId+
		    		 "|panNo~"+panNo+
		    		 "|iin~"+iin+
		    		 "|userId~"+userId+
		    		 "|invName~"+invName+
		       "|tokenTime~"+sdf.format(new Date());
		     String encryptedToken = cipher.encrypt(token);
		     String encodedToken = URLEncoder.encode(encryptedToken, "UTF-8");
		     return encodedToken;
		    } catch (Exception ex) {
		     throw new FiinfraTokenException(ex);
		    }
	}
	/*public static void main(String[] args) {
		//int partyId,int contactId,int buId,String kyc
		try {
			String encryptedString = generateTokenForIINLink(206293, 1032477, 27827, "true");
			System.out.println(encryptedString);
			System.out.println(FiinfraTokenDecrypter.decryptToken(encryptedString));
			Map<String, String> tokenMap = FiinfraTokenDecrypter.decryptToken(encryptedString);
			System.out.println(tokenMap.get("buId"));
		} catch (FiinfraTokenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
