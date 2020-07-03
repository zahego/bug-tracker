package common.Ultilities;

import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Contains all static helper methods
 * @author Trung Nguyen
 *
 */
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
	
	public static JSONArray readFile(String s) throws Exception {
		JSONParser jsonParser = new JSONParser();
        try {
            FileReader reader = new FileReader("src/resources/database.json");
            JSONObject obj = (JSONObject) jsonParser.parse(reader);
            JSONArray arr = (JSONArray) obj.get(s);
            return arr;
        } catch (Exception e) {
        	throw e;
        }
	}
	
	public static int[] makeSequence(int begin, int end) {
		return java.util.stream.IntStream.rangeClosed(begin, end).toArray();
	}
	
	public static int compareWithTodayDate(Date d) {
		if(d==null) return 1;
		return d.toInstant().atZone(ZoneId.systemDefault())
			      .toLocalDate().compareTo(java.time.LocalDate.now());
	}
	
	public static Date getCurrentDate() {
		return Date.from(java.time.LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
}