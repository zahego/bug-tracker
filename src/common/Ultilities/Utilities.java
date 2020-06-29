package common.Ultilities;

import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

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
	
	/////////////////////////////////////Wait for merge/////////////////////////////
	public static List<Integer> readSprintID(){
		List<Integer> ret = new ArrayList<>();
		try {
			JSONArray sprints = readFile("sprint");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
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
}
