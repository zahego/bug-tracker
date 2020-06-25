package common.Ultilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utilities {
	static Calendar cal = new GregorianCalendar();
	static DateFormat dfm = new SimpleDateFormat("MM-dd-yyyy");
	
	public static Date getDate(int year, int month, int date) {
		cal.set(year, month, date);
		return cal.getTime();
	}
	
	public static Date stringToDate(String string) throws ParseException {
		return dfm.parse(string);
	}
	
	public static String getDateString(Date date) {
		return  dfm.format(date);
	}
}
