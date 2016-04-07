package in.robo.common.util;

import java.io.InputStream;
import java.util.Properties;

public class ErrorPropertyReader {

	private Properties properties; 
	
	private static ErrorPropertyReader self = new ErrorPropertyReader();
	
	private ErrorPropertyReader() {
		InputStream inputStream = null;
		try {
			properties = new Properties();
			inputStream = this.getClass().getClassLoader().getResourceAsStream("error.properties");
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
	
	public static ErrorPropertyReader getInstance() {
		return self;
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	
}
