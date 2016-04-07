package in.robo.common.util;

import in.robo.framework.models.Audit;

public class AuditWorker  implements Runnable {
	
	private Audit audit;
	
	private String restURL;
	
	public AuditWorker(Audit audit) {
		this.audit = audit;
		this.restURL=FiinfraUtility.getRestDBURL();
	}

	@Override
	public void run() {
		try {
			
			//RestTemplate restTemplate = new RestTemplate();
			
			String url = FiinfraUtility.getRestDBURL();
			
			url = restURL + "services/common/doAudit/Ramu/1234";
			
			//restTemplate.postForObject(url, audit, Integer.class);
			OFARestClient.postForObject(url, audit, Integer.class);
			Thread.currentThread();
			
			Thread.sleep(5*1000);
		} catch (Exception ex){}
		
	}

}
