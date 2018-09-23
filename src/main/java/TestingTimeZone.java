import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class TestingTimeZone {

	
	public static void main(String args[])
	{
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		/*Date today121212=new Date();
		Calendar now1 = Calendar.getInstance();
		TimeZone tz = TimeZone.getTimeZone("GMT");
		now1.setTimeZone(tz);
		now1.setTime(new Date());
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date todayDateInMill = new Date(now1.getTimeInMillis());
		String today = dateFormat.format(todayDateInMill);
		//now1.add(Calendar.MONTH, -1);
		//now1.set(Calendar.DATE, 1);
		Date firstdayInMill = new Date(now1.getTimeInMillis());
		String firstdate = dateFormat.format(todayDateInMill);
		String actualdate = dateFormat.format(today121212);
		System.out.println(today);
		System.out.println(actualdate);
		
		
		DateTime jodaTime = new DateTime(actualdate, DateTimeZone.UTC);
		String hjdgfsdhf= dateFormat.format(jodaTime.toDate());
		System.out.println(hjdgfsdhf);*/
		
		
		 Date localTime = new Date(); 
		    
	     //creating DateFormat for converting time from local timezone to GMT
	     DateFormat converter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    
	     //getting GMT timezone, you can get any timezone e.g. UTC
	     converter.setTimeZone(TimeZone.getTimeZone("GMT"));
	    
	     System.out.println("local time : " + dateFormat.format(localTime));;
	     System.out.println("time in GMT : " + converter.format(localTime));

	
	}
}