package in.robo.common.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class MDFEncreption {
	 
	 
	
	public static String getEncreptedString(String plaintext)
	{
		Md5PasswordEncoder passwordEncoder= new Md5PasswordEncoder();
		String encreptedString = passwordEncoder.encodePassword(plaintext, null);
		return encreptedString;
		
	}

}
