package com.test.concept;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class previusdate {

	
	public static void main(String args[])
	{
		/*select columns
		  from table
		 where datetimecol >= '2007-07-01' 
		   and datetimecol  < '2007-08-01'
		   and (
		       extract(hour from datetimecol) >= 22
		    or extract(hour_minute from datetimecol) <= '06:00'
		       )*/
		
		
		 final Calendar cal = Calendar.getInstance();
		    cal.add(Calendar.DATE, -1);
		   System.out.println(cal.DATE);
		   
		 Date testing =  new Date(System.currentTimeMillis()+30*24*60*60*1000);
		 
		 Date ttt=new Date();
		 
		 //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 
		 System.out.println(ttt+""+testing);
		 
		String dateFormatString = "dd/MM/yyyy";
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 String tt =dateFormat.format(ttt);
		 System.out.println(tt);
		 
		 DateFormat testing6 = new SimpleDateFormat("yyyy-MM-dd");
		 String pr =dateFormat.format(testing);
		 System.out.println(pr);
		 
		 String append="where cast(intime as time) > '09:00:00' and cast(intime as time) < '11:00:00' && intime between "+tt+" and "+pr+"";
		 
		 String QURY="select * from attendance where intime between "+tt+" and "+pr+"";
		// cast(updateDateTime as time) > '17:00:00'
		 
/*		 select count(*) as noofdays 
		 from  tabreport_kagamierp.student_1 where cast(sjoindate as time) > '09:00:00'
		 and cast(sjoindate as time) < '11:00:00' && sjoindate between '2018-03-02' and '2018-03-19'*/
		 
		//String append="where cast(intime as time) > '09:00:00' and cast(intime as time) < '11:00:00' && intime between "+tt+" and "+pr+"";
		
		System.out.println(append);
		 
	}

	

	}

