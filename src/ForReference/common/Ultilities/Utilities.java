package ForReference.common.Ultilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Utilities {
	static Calendar cal = new GregorianCalendar();
	static DateFormat dfm = new SimpleDateFormat("yyyy.MM.dd");
	
	public static Date getDate(int year, int month, int date) {
		cal.set(year, month, date);
		return cal.getTime();
	}
	
	public static String getDateString(Date date) {
		return  dfm.format(date);
	}
}
