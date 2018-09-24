package com.test.normal.test;



	
	public class LongToDouble
	{
	  public static void main(String args[]){
		  String testing="?";
	  String arr[]=testing.split("\\,");
	  String totalNofDaysInTime="20";
	  String totalNofDays="35";
	  Double empStatus=((Double.parseDouble(totalNofDaysInTime)/Double.parseDouble(totalNofDays))*100);
	 
	  String check=empStatus.toString().split("\\.")[0];
	  System.out.println(check);
	//  boolean test=allCharactersSame(arr);
	//  System.out.println(test);
	  }
		 /* public static boolean  allCharactersSame(String[] s)
		  {
			  for (int i = 0; i < s.length; i++)
			  {  if (!s[i].equalsIgnoreCase("?")){
		              return false;
		              }
			  }
		      return true;
		  }*/
	    /*long l1 = 10;            
	    double d1 = l1;  
	    
	    System.out.println("long value: " + l1);                // prints 10
	    System.out.println("Converted double value: " + d1);    // prints 10.0
*/	  }
	

