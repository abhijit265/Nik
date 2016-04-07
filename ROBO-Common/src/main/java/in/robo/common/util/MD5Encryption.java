package in.robo.common.util;
import java.math.BigInteger;
import java.security.MessageDigest;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
public class MD5Encryption
{
	
	static Md5PasswordEncoder passwordEncoder= new Md5PasswordEncoder();
	
	public static String encrypt(String password)
	{
		 String encreptedString = passwordEncoder.encodePassword(password, null);
		  return encreptedString;
	}
	
		  
}