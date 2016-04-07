package in.robo.common.util;

import in.robo.framework.models.Notification;

import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;

public class NotificationWorker implements Runnable {
	private static final Logger logger = Logger.getLogger(NotificationWorker.class);
	Notification notification;
	private  String restURL;

	public NotificationWorker(Notification notification) {
		super();
		this.notification = notification;
		this.restURL=FiinfraUtility.getRestDBURL();
	}


	@Override
	public void run() {
		RestTemplate restTemplate = new RestTemplate();
		String url="";
		url = restURL + "services/common/insertNotification/Ramu/1234";
		restTemplate.postForObject(url, notification, Integer.class);
		Thread.currentThread();
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			logger.error("Exception in NotificationWorker");
			e.printStackTrace();
		}
		
	}

}
