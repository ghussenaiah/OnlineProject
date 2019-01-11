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
		
		
		 Date localTime = new Date(); 
		    
	     //creating DateFormat for converting time from local timezone to GMT
	     DateFormat converter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	     System.out.println("local time : " + converter.format(localTime));;
	     //getting GMT timezone, you can get any timezone e.g. UTC
	     converter.setTimeZone(TimeZone.getTimeZone("GMT"));
	    
	  
	     System.out.println("time in GMT : " + converter.format(localTime));

	
	}
}