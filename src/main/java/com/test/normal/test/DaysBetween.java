package com.test.normal.test;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DaysBetween {
	public static void main()
	{
			Date testing =  new Date(System.currentTimeMillis()+30*24*60*60*1000);
		 
		 Date ttt=new Date();
		 
		String dateFormatString = "dd/MM/yyyy";
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 String tt =dateFormat.format(ttt);
	
		System.out.println("hello");
		System.out.println("hello1");
		 String pr =dateFormat.format(testing);
		
		int count =getWorkingDaysBetweenTwoDates(ttt,testing);
		System.out.println(count);
	}


	
	public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {
	    Calendar startCal = Calendar.getInstance();
	    startCal.setTime(startDate);        

	    Calendar endCal = Calendar.getInstance();
	    endCal.setTime(endDate);

	    int workDays = 0;

	    //Return 0 if start and end are the same
	    if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
	        return 0;
	    }

	    if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
	        startCal.setTime(endDate);
	        endCal.setTime(startDate);
	    }

	    do {
	       //excluding start date
	        startCal.add(Calendar.DAY_OF_MONTH, 1);
	        if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
	            ++workDays;
	        }
	    } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

	    return workDays;
	}
	}

