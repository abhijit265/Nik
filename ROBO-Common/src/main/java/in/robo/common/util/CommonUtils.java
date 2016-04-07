package in.robo.common.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;

public class CommonUtils {
	public static final BigDecimal CR = new BigDecimal(10000000);
	public static final BigDecimal LAC = new BigDecimal(100000);
	public static final BigDecimal THOUSAND = new BigDecimal(1000);
	private static final long DAY_IN_MILLI = 24 * 60 * 60 * 1000;

	private CommonUtils() {

	}

	public static int zeroIfNULL(Integer value) {
		return value == null ? 0 : value;
	}

	public static char yesIfOne(Integer value) {
		return value == null || value==0 ? 'N' : 'Y';
	}
	
	public static String yesIfOne(String value) {
		return value == null || value.equals("0") ? "N" : "Y";
	}
	
	public static String yesIfOneValue(Integer value) {
		return value == null || value==0 ? "" : "Y";
	}

	public static double zeroIfNULL(Double value) {
		return value == null ? 0d : value;
	}
	
	public static String zeroIfNULL(String value) {
		return value == null ? "0" : value;
	}

	public static String formatAmountINR(long value) {
		return formatAmountINR((double) value, false);
	}

	public static String formatAmountINR(long value, boolean flag) {
		return formatAmountINR((double) value, flag);
	}

	public static String formatAmountINR(double value) {
		return formatAmountINR(value, false);
	}

	public static String formatAmountINR(double value, boolean flag) {
		if (flag) {
			if (Math.abs(value) < 1000) {
				return format("###", value);
			}
			double hundreds = value % 1000;
			int other = (int) (value / 1000);
			return format(",##", other) + ',' + format("000", hundreds);
		}
		final boolean isNegative = value < 0;
		final String post;
		BigDecimal outValue;
		final int scale;
		final BigDecimal val = new BigDecimal(Math.abs(value));
		if (val.compareTo(CR) >= 0) {
			post = "Cr";
			outValue = val.divide(CR);
			scale = 2;
		} else if (val.compareTo(LAC) >= 0) {
			post = "Lac";
			outValue = val.divide(LAC);
			scale = 2;
		} else if (val.compareTo(THOUSAND) >= 0) {
			post = "K";
			outValue = val.divide(THOUSAND);
			scale = 2;
		} else {
			post = "/-";
			outValue = val;
			scale = 0;
		}

		if (isNegative) {
			outValue = outValue.negate();
		}
		DecimalFormat df = new DecimalFormat();

		df.setMaximumFractionDigits(scale);

		df.setMinimumFractionDigits(0);

		df.setGroupingUsed(false);

		return df.format(outValue.setScale(scale, BigDecimal.ROUND_HALF_DOWN))
				+ (StringUtils.isEmpty(post) ? "" : " " + post);

		// return outValue.setScale(scale,
		// BigDecimal.ROUND_HALF_DOWN).toPlainString() +" "+post ;
	}

	// public static void main (String[] args){
	// System.out.println(formatAmountINR(10045065));
	// System.out.println(formatAmountINR(150340));
	// System.out.println(formatAmountINR(15000));
	// System.out.println(formatAmountINR(15856));
	// System.out.println(formatAmountINR(150));
	//
	// }

	private static String format(String pattern, Object value) {
		return new DecimalFormat(pattern).format(value);
	}

	public static String formatAmountMonthly(long amount) {
		return formatAmountINR(amount / 12);
	}

	public static String emptyIfNull(String str) {
		return str == null ? "" : str;

	}

	public static long convertToK(long value) {
		return value / 1000;
	}

	public static long convertToLac(long value) {
		return value / 100000;
	}

	public static double convertToLac(double value) {
		return divide(value, 100000);
	}

	public static long toLong(String val) {
		if (!StringUtils.isEmpty(val)) {
			return new BigDecimal(val).longValue();
		}
		return 0;
	}

	public static double toDouble(String val) {
		if (!StringUtils.isEmpty(val)) {
			return new BigDecimal(val).doubleValue();
		}
		return 0;
	}

	public static int toInt(String val) {
		if (!StringUtils.isEmpty(val)) {
			try{
			return new BigDecimal(val).intValue();
		}catch(Exception ex){
			return 0;
		}

		}
		return 0;
	}

	public static int toInt(String val, int defaultValue) {
		if (!StringUtils.isEmpty(val)) {
			try{
				return new BigDecimal(val).intValue();	
			}catch(Exception ex){
				return defaultValue;
			}
			
		}
		return defaultValue;
	}

	public static long convertToCr(long value) {
		return value / 10000000;
	}

	public static long calculateAmountYearly(long amount, int freq) {
		final int multiply;
		switch (freq) {
		// Daily
		case 63001:
			multiply = 365;
			break;
		// Weekly
		case 63002:
			multiply = 52;
			break;
		// Monthly
		case 63003:
			multiply = 12;
			break;
		// Quartery
		case 63004:
			multiply = 4;
			break;
		// Half-Yearly
		case 63005:
			multiply = 2;
			break;
		// Yearly
		case 63006:
			multiply = 1;
			break;
		default:
			multiply = 1;
		}

		return amount * multiply;

	}

	public static long calculateAmountMonthly(long amount, int freq) {
		final double multiply;
		switch (freq) {
		// Daily
		case 63001:
			multiply = 30;
			break;
		// Weekly
		case 63002:
			multiply = 4;
			break;
		// Monthly
		case 63003:
			multiply = 1;
			break;
		// Quartery
		case 63004:
			multiply = 0.25;
			break;
		// Half-Yearly
		case 63005:
			multiply = 0.5;
			break;
		// Yearly
		case 63006:
			multiply = 12;
			break;
		default:
			multiply = 1;
		}

		return (long) (new Double(amount) / multiply);

	}

	public static String getCssClassFromCodeValue(String codeValue,
			String defaultClass) {
		if (StringUtils.isEmpty(codeValue)) {
			codeValue = defaultClass;
		}
		return StringUtils.replace(codeValue.toLowerCase(), " ", "_") + "_icon";
	}

	public static String retriveCssClassFromCodeValue(String codeValue,
			String postfix) {
		if (StringUtils.isEmpty(codeValue)) {
			return "";
		}
		if (StringUtils.isEmpty(postfix)) {
			return StringUtils.replace(codeValue.toLowerCase(), " ", "_");
		}
		return StringUtils.replace(codeValue.toLowerCase(), " ", "_") + "_"
				+ postfix;
	}

	public static String getCssGoalClassFromCodeValue(String codeValue,
			String defaultClass) {
		if (StringUtils.isEmpty(codeValue)) {
			codeValue = defaultClass;
		}
		return StringUtils.replace(codeValue.toLowerCase(), " ", "_");
	}

	public static Date convertToDate(String str, String format) {
		if (StringUtils.isEmpty(str)) {
			return null;
		}
		try {
			return new SimpleDateFormat(format).parse(str);
		} catch (ParseException pe) {
			return null;
		}
	}

	public static Date convertToDate(String str) {
		if (StringUtils.isEmpty(str)) {
			return null;
		}
		List<SimpleDateFormat> knownPatterns = new ArrayList<SimpleDateFormat>();
		knownPatterns.add(new SimpleDateFormat("dd-MMM-YYYY"));
		knownPatterns.add(new SimpleDateFormat("dd-MM-yyyy"));
		knownPatterns.add(new SimpleDateFormat("dd/MM/yyyy"));
		knownPatterns.add(new SimpleDateFormat("dd/MM/yy"));
		knownPatterns.add(new SimpleDateFormat("dd-MM-yy"));
		knownPatterns.add(new SimpleDateFormat("yyyyMMdd"));
		knownPatterns.add(new SimpleDateFormat("yyyy-MM-dd"));

		// knownPatterns.add(new SimpleDateFormat("MMM d"));
		// knownPatterns.add(new SimpleDateFormat("d MMM"));
		// knownPatterns.add(new SimpleDateFormat("d-MMM"));
		// knownPatterns.add(new SimpleDateFormat("MMM-d"));

		for (SimpleDateFormat pattern : knownPatterns) {
			try {
				return pattern.parse(str);
			} catch (ParseException pe) {
				// Loop on
			}
		}
		return null;
	}

	public static Timestamp dateToTimeStamp(String dtStr) {
		if (!StringUtils.isEmpty(dtStr)) {
			Date dt = CommonUtils.convertToDate(dtStr);
			if (dt != null) {
				Calendar cal = Calendar.getInstance();
				cal.setTime(dt);
				return new Timestamp(cal.getTimeInMillis());
			}
		}
		return null;
	}

	public static Timestamp dateToTimeStamp(String dtStr, String format) {
		if (!StringUtils.isEmpty(dtStr)) {
			Date dt = CommonUtils.convertToDate(dtStr,format);
			if (dt != null) {
				Calendar cal = Calendar.getInstance();
				cal.setTime(dt);
				return new Timestamp(cal.getTimeInMillis());
			}
		}
		return null;
	}

	public static String reFormatDate(String dt) {
		return formatDate(convertToDate(dt));
	}

	public static String format(Timestamp ts, String format) {
		if (ts == null) {
			return "";
		}
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(ts.getTime());
		return new SimpleDateFormat(format).format(cal.getTime());

	}

	public static Date toDate(Timestamp ts) {
		if (ts == null) {
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(ts.getTime());
		return cal.getTime();

	}

	public static String formatDate(Date dt) {
		if (dt == null) {
			return "";
		}
		return new SimpleDateFormat("dd-MMM-yyyy").format(dt);
	}

	public static String format(Date dt, String format) {
		if (dt == null) {
			return "";
		}
		return new SimpleDateFormat(format).format(dt);
	}

	public static String formatTime(Date dt) {
		if (dt == null) {
			return "";
		}
		return new SimpleDateFormat("HH:mm a").format(dt);
	}

	public static long getFV(double principal, double rate, int year) {
		if (principal > 0 && rate > 0 && year > 0) {
			double p1 = (Math.pow(1 + (rate / 100), year));
			return new BigDecimal(principal).multiply(new BigDecimal(p1))
					.setScale(2, BigDecimal.ROUND_HALF_DOWN).longValue();
		}
		return (long) principal;
	}
	
	public static long getLumpsum(double fv, double rate, int year) {
		if (fv > 0 && rate > 0 && year > 0) {
			double p1 = (Math.pow(1 + (rate / 100), year));
			return new BigDecimal(fv).divide(new BigDecimal(p1),BigDecimal.ROUND_HALF_DOWN)
					.setScale(2, BigDecimal.ROUND_HALF_DOWN).longValue();
		}
		return 0;
	}

	public static void main(String[] args){
		Long fv = getFV(1000, 12, 5);
		Long lumpsum = getLumpsum(fv, 12, 5);
		System.out.println(fv + "   "+lumpsum);
	}

	public static double multiply(double v1, double v2) {
		return new BigDecimal(v1).multiply(new BigDecimal(v2))
				.setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
	}

	public static BigDecimal multiply(BigDecimal v1, BigDecimal v2) {
		return v1.multiply(v2).setScale(2, BigDecimal.ROUND_HALF_DOWN);
	}

	public static BigDecimal divide(BigDecimal v1, BigDecimal v2) {
		return v1.divide(v2, 2, RoundingMode.HALF_DOWN);
	}

	public static double divide(double v1, double v2) {
		if (v2 > 0) {
			return new BigDecimal(v1).divide(new BigDecimal(v2), 2,
					RoundingMode.HALF_DOWN).doubleValue();
		}
		return 0;

	}

	public static int getAge(Date dobDate) {
		if (dobDate == null) {
			return 0;
		}
		Calendar dob = Calendar.getInstance();
		dob.setTime(dobDate);

		Calendar today = Calendar.getInstance();

		int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
		return Math.abs(age);

	}

	public static int compare(Calendar c1, Calendar c2, int field) {
		Integer i1 = c1.get(field);
		Integer i2 = c2.get(field);
		return i1.compareTo(i2);
	}

	public static int compare(Calendar c1, Calendar c2) {

		int result = compare(c1, c2, Calendar.YEAR);
		if (result == 0) {
			result = compare(c1, c2, Calendar.DAY_OF_YEAR);
		}
		return result;
	}

	public static String toUserFriendlyDate(Date d) {
		if (d == null) {
			return "";
		}
		Calendar c = Calendar.getInstance();

		Calendar c1 = Calendar.getInstance();
		c1.setTime(d);

		SimpleDateFormat format;
		if (compare(c, c1) == 0) {
			format = new SimpleDateFormat("HH:mm a", Locale.getDefault());
			return format.format(d);
		}
		// c.add(Calendar.DAY_OF_YEAR, 1);
		// if (compare(c, c1) == 0) {
		// return "Tomorrow";
		// }
		// c.add(Calendar.DAY_OF_YEAR, -2);
		// if ( compare(c, c1) == 0) {
		// return "Yesterday";
		// }

		if (c.get(Calendar.YEAR) == c1.get(Calendar.YEAR)) {
			format = new SimpleDateFormat("d MMM HH:mm a", Locale.getDefault());
		} else if (c.get(Calendar.YEAR) <= 2000) {
			format = new SimpleDateFormat("d MMM yyyy HH:mm a",
					Locale.getDefault());
		} else {
			format = new SimpleDateFormat("d MMM yy HH:mm a",
					Locale.getDefault());
		}
		return format.format(d);
	}

	public static String escape(String s) {
		if (s != null) {
			if (s.contains(QUOTE)) {
				s = s.replace(QUOTE, ESCAPED_QUOTE);
			}

			if (s.indexOf(CHARACTERS_THAT_MUST_BE_QUOTED.toString()) > 0) {
				s = QUOTE + s + QUOTE;
			}

			/*
			 * if (StringUtils.indexOfAny(s, CHARACTERS_THAT_MUST_BE_QUOTED) >
			 * 0) { s = QUOTE + s + QUOTE; }
			 */

			return s;
		} else {
			return "";
		}
	}

	public static double getPercentage(double min, double max, double value) {
		return multiply(divide(value - min, max - min), 100);
	}

	private static final String QUOTE = "\"";
	private static final String ESCAPED_QUOTE = "\"\"";
	private static final char[] CHARACTERS_THAT_MUST_BE_QUOTED = { ';', '"',
			'\n' };

	public static int getGapInDays(Date dt) {
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		end.setTime(dt);
		return (int) (Math.abs(start.getTimeInMillis() - end.getTimeInMillis()) / DAY_IN_MILLI);

	}

	public static int getActualGapInDays(Date dt) {
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		end.setTime(dt);
		return (int) ((end.getTimeInMillis() - start.getTimeInMillis()) / DAY_IN_MILLI);

	}

}
