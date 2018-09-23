package cse.cs;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
public class JodaTime {

	
	
	public static void main(String args[]){
	String dateFormatString = "dd-MM-yyyy HH:mm:ss";
	String value="30-10-2018 18:30:00";
	//String canonicalId="Asia/Kolkata";
	String canonicalId="Asia/Kolkata";
	
	//Asia/Kolkata
	//America/New_York
	
	
	/*DateTimeFormatter dfm = DateTimeFormat.forPattern(dateFormatString).withZone(DateTimeZone.forID(canonicalId));
	DateTime dateVlaue = dfm.parseDateTime(value.trim());
	System.out.println(dateVlaue);*/
	
	
	 SimpleDateFormat finaldate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	//2018-10-31T00:00:00.000+05:30
	//2018-10-30T14:30:00.000-04:00
	DateTimeFormatter dfm = DateTimeFormat.forPattern(dateFormatString);
	DateTime dateVlaue = dfm.parseDateTime(value.trim());
	
	  //Convert date into UTC
  /*  Date dt = new Date(value);*/

    SimpleDateFormat dateFormatter = new SimpleDateFormat(
            "yyyy-MM-dd'T'HH:mm:ss'Z'");

    String strUTCDate = dateFormatter.format(dateVlaue.toDate());
    System.out.println(strUTCDate);

    DateTime jodaTime = new DateTime(strUTCDate, DateTimeZone.forID(canonicalId));
  //  DateTimeFormatter finaldate = DateTimeFormat.forPattern(jodaTime.toString());
 //System.out.println("final date"+finaldate);
    System.out.println(jodaTime);
		Calendar gc1 = jodaTime.toGregorianCalendar(); 
	long yyy=	gc1.getTimeInMillis();
		 System.out.println(gc1);
		 System.out.println(gc1.get(Calendar.YEAR));
		 System.out.println(gc1.get(Calendar.MONTH)+1);
		 System.out.println(gc1.get(Calendar.DATE));
		 System.out.println(gc1.get(Calendar.HOUR_OF_DAY));
		 System.out.println(gc1.get(Calendar.MINUTE));
		 System.out.println(gc1.get(Calendar.SECOND));
		/* System.out.println(gc1.get(Calendar.YEAR)+""+gc1.get(Calendar.MONTH)+1+""+gc1.get(Calendar.DATE)+""+gc1.get(Calendar.HOUR_OF_DAY)+""+
		 gc1.get(Calendar.MINUTE)+""+gc1.get(Calendar.SECOND));*/
		
    //Convert UTC String to date
    //String input = "2015-01-04T19:50:26Z";
    String input = "2018-09-02T15:00:00Z";
   TimeZone utc = TimeZone.getTimeZone("UTC");
    //TimeZone utc = TimeZone.getTimeZone(canonicalId);
    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    f.setTimeZone(utc);
    GregorianCalendar cal = new GregorianCalendar(utc);

    try {
		cal.setTime(f.parse(strUTCDate));
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println(cal.getTime());
	
	/*DateTimeFormatter dfm = DateTimeFormat.forPattern(dateFormatString);

	DateTime dateVlaue = dfm.parseDateTime(value);
	
	dfm.withZoneUTC();
	TimeZone tz = TimeZone.getTimeZone("330");
	
	
	Calendar gc1 = new GregorianCalendar();
    
    
    TimeZone tz1 = TimeZone.getTimeZone(zoneid);
    
    
		gc1.setTimeZone(tz1);
		//gc1.setTime(dateVlaue.toDate());
		
		
    gc1.setTime(new Date(dateVlaue.getMillisOfDay()));
    long timmmm=gc1.getTimeInMillis();
    Date nn=new Date(timmmm);
    System.out.println(nn);
	long offsetValue = tz.getOffset(dateVlaue.getMillis());
	long dateLong = dateVlaue.getMillis();*/
	
	/*Date nn=new Date(dateLong);
		System.out.println(nn);
		System.out.println(nn);*/
	}
}






   
