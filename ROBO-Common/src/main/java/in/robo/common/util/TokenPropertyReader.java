package in.robo.common.util;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class TokenPropertyReader {

	private Properties properties; 
	
	private static TokenPropertyReader self = new TokenPropertyReader();
	
	private TokenPropertyReader() {
		InputStream inputStream = null;
		try {
			properties = new Properties();
			inputStream = this.getClass().getClassLoader().getResourceAsStream("token.properties");
			properties.load(inputStream);
		} catch (Exception ex) {

		}

		if (inputStream != null) {
			try {
				inputStream.close();
			} catch (Exception e) {
			}
		}		
	}
	
	public static TokenPropertyReader getInstance() {
		return self;
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	
	public Enumeration<Object> getAllAppProperties(){
		Enumeration<Object> keys = properties.keys();
		return keys;
	}
}
