package in.robo.common.util;

import org.apache.log4j.PropertyConfigurator;

public class Logger {
	@SuppressWarnings("unused")
	private static org.apache.log4j.Logger logger = null;
	public static final int ALL = 1;
	public static final int DEBUG = 2;
	public static final int INFO = 3;
	public static final int WARNING = 4;
	public static final int ERROR = 5;
	public static final int FATAL = 6;

	@SuppressWarnings("rawtypes")
	public static void logEntry(Class class1, Object message, int logType, String methodSignature) {
		try {
			String propertyFilePath = AppPropertyReader.getInstance().getProperty("log4jPropertiesFilePath");
			String log4jDefaultPropertiesFilePath = AppPropertyReader.getInstance()
					.getProperty("log4jDefaultPropertiesFilePath");
			PropertyConfigurator.configure(propertyFilePath);

			if (message != null) {
				logger = org.apache.log4j.Logger.getLogger(class1);
				switch (logType) {
				case ALL:
					logger.debug(methodSignature + ":" + message);
					break;
				case DEBUG:
					logger.debug(methodSignature + ":" + message);
					break;
				case INFO:
					logger.info(methodSignature + ":" + message);
					break;
				case WARNING:
					logger.warn(methodSignature + ":" + message);
					break;
				case ERROR:
					logger.error(methodSignature + ":", new Throwable(message.toString()));
					break;
				case FATAL:
					logger.fatal(methodSignature + ":" + message);
					break;
				default:
					logger.info(methodSignature + ":" + message);
					break;
				}
			}
			PropertyConfigurator.configure(log4jDefaultPropertiesFilePath);
		} catch (Exception e) {
			try {
				logger.error("Error in logger:", e);
			} catch (Exception ex) {
			}
		}

	}

}
