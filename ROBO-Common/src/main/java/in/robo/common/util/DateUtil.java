/**
 * 
 */
package in.robo.common.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author sony
 *
 */
public class DateUtil {

	private final static String DATE_FORMAT_DD_MM_YYYY = "dd-MM-yyyy";
	private final static String DATE_FORMAT_DD_MMM_YYYY = "dd-MMM-yyyy";
	
	public static Timestamp getTimeStamp(String date) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_DD_MM_YYYY);
		Timestamp timestamp = null;
		if(date != null && (!date.trim().equals(""))){	
			String[] datePart = null;
			if(date.contains("/")){
				 datePart = date.trim().split("/");
				 timestamp = new Timestamp(dateFormat.parse(datePart[0] + "-" + datePart[1] + "-" + datePart[2]).getTime());
			}else{
				datePart = date.trim().split("-");
			timestamp = new Timestamp(dateFormat.parse(datePart[0] + "-" + datePart[1] + "-" + datePart[2]).getTime());
			}
		}
		return timestamp;
	}
	
	public static Timestamp getTimeStampForNewFormat(String date) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_DD_MMM_YYYY);
		Timestamp timestamp = null;
		if(date != null && (!date.trim().equals(""))){	
			String[] datePart = null;
			if(date.contains("/")){
				 datePart = date.trim().split("/");
				 timestamp = new Timestamp(dateFormat.parse(datePart[0] + "-" + datePart[1] + "-" + datePart[2]).getTime());
			}else{
				datePart = date.trim().split("-");
			timestamp = new Timestamp(dateFormat.parse(datePart[0] + "-" + datePart[1] + "-" + datePart[2]).getTime());
			}
		}
		return timestamp;
	}
}
