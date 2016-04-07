package in.robo.common.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import in.robo.common.diy.models.UserSession;
import in.robo.framework.models.Audit;
import in.robo.framework.models.Notification;

@Component
public class FrameworkUtil  implements BeanFactoryAware,ApplicationListener<ApplicationEvent>
{
	private BeanFactory beanFactory;
	private static ThreadPoolTaskExecutor taskExecutor;

	public static void audit(Audit audit) {
		
		int buId = 0;
		try
		{
			HttpServletRequest servletRequest =((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
			 buId=((UserSession)servletRequest.getSession().getAttribute("userSession")).getBuId();	
		}
		catch(Exception e)
		{
			 buId=audit.getBuId();
		}
		audit.setBuId(buId);
		taskExecutor.execute(new AuditWorker(audit));
	}
	
	
	/**
	 * Following one static Method used for audit with Buid of Mobile API
	 * Naval Makwana
	 * @param Audit   as audit object 
	 * @param buId    as buId
	 * Description : this method takes buId from Api and call execute method respectively
	 */
	public static void audit(Audit audit,int buId) {
		HttpServletRequest servletRequest =((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		audit.setBuId(buId);
		taskExecutor.execute(new AuditWorker(audit));
	}
	
	public static void notify(Notification notification) {
		taskExecutor.execute(new NotificationWorker(notification));
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory= beanFactory;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ContextRefreshedEvent) {
			taskExecutor = new ThreadPoolTaskExecutor();
			taskExecutor.setMaxPoolSize(100);
			taskExecutor.initialize();
		}else if(event instanceof ContextClosedEvent){
			taskExecutor.shutdown();
		}
		
	}
}
