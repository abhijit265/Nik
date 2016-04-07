package in.robo.common.util;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class CVLPropertyReader {

	private Properties properties; 
	
	private static CVLPropertyReader self = new CVLPropertyReader();
	
	private CVLPropertyReader() {
		InputStream inputStream = null;
		try {
			properties = new Properties();
			inputStream = this.getClass().getClassLoader().getResourceAsStream("cvl.properties");
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
	
	public static CVLPropertyReader getInstance() {
		return self;
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	
	public boolean containProperty(String key) {
		
		if(properties.containsKey(key)){
			return true;
		} else {
			return false;
		}
	}
	
	public Enumeration<Object> getAllAppProperties(){
		Enumeration<Object> keys = properties.keys();
		return keys;
	}
}
