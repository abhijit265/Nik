package in.robo.common.util;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


public class AppConstant implements ApplicationListener<ContextRefreshedEvent>{
	
	public static String cdn;
	
	public void setCdn(String cdn) {
		AppConstant.cdn = cdn;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		//just to ensure bean get initlized on application event
		//cdn = this.cdnPath;
	}
}
