package in.robo.common.authentication;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.openxml4j.opc.internal.FileHelper;

public class LoginUtlility 
{
	public static String getBuIdForUrl(String url){
		String buId=null;
		Properties properties = new Properties();
		InputStream stream = FileHelper.class.getClassLoader()
				.getResourceAsStream("ApplicationResources.properties");
		try {
			properties.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Enumeration<Object> keys = properties.keys();
		while(keys.hasMoreElements()){
			String key = (String) keys.nextElement();
			if(url.contains(key.toString())){
				buId = properties.getProperty(key.toString());
				System.out.println("buId to get buid:--"+buId);
				try  
				  {  
					double d = Double.parseDouble(buId);  
				  }  
				  catch(Exception nfe)  
				  {  
					//continue;
				  }
				return buId;
			}
		}
		if(buId==null)
			buId="27827";
		return buId;
	}
}
