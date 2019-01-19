package com.test.concept;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;


public class DateValue {

	
	public static void main(String args[])
	{
		//long dat=1507314600000l;
	/*	long dat = Long.parseLong("1507314600000");
		  Date date=new Date(dat);
		
	        System.out.println("Sum of x+y = " + date);
	        
	        Student_2DTO student=new Student_2DTO();*/
		
		
		   /* double a = 0.0;
		    double b = 0.0;
		    
		   
		    if (Double.parseDouble("0.0")!=0.0) {
		        System.out.println("a == b");
		    }
		    if (Double.compare(a, b) == 0) {
		        System.out.println("Double.compare(a, b) == 0");
		    }*/
		
	     /*   List<String> test=new ArrayList<>();
	        test.add("test");
            test.add("hello");
           // test.add("?");
            System.out.println(test);
            if(test.contains("?")){
            test.remove("?");
            }
            System.out.println(Integer.MAX_VALUE);
            System.out.println(Integer.MIN_VALUE);*/
		//HRMS_GROUP_kagamierp
		String userdomain="kagami-generated_HRMS_GROUP";
		StringBuilder db=new StringBuilder();
		//String sehemaName[]=userdomain.split("\\_");
		
		//String nickname = userdomain.substring(0, userdomain.indexOf('_'));
		String content = userdomain.substring(userdomain.indexOf('_') + 1);
		//System.out.println(content);
		System.out.println(db.append(content).append("_kagamierp"));
		
		/*LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String,String>();
		 Populate 
		linkedHashMap.put("key0","value0");
		linkedHashMap.put("key1","value1");
		linkedHashMap.put("key2","value2");
		 Get by position 
		int pos = 1;
		String value = (new ArrayList<String>(linkedHashMap.keySet()).get(pos));
		System.out.println(value);*/
	        
	}
}
