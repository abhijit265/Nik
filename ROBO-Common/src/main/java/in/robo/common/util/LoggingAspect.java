package in.robo.common.util;

import org.aspectj.lang.JoinPoint;

/**
 * @author Prabu
 * 
 */
public class LoggingAspect {
 public void log(JoinPoint jp,Exception ex) throws Throwable {
  //System.out.println("\nException is:"+ex.getLocalizedMessage());
  //System.out.println("XML Configuration driven: After throwing "+jp.getSignature().getName()+"()");
 }
}