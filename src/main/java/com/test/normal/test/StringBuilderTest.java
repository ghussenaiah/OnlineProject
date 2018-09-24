package com.test.normal.test;

public class StringBuilderTest {
	
	static StringBuilder a=null;
	
	public static void main(String args[])
	{
	/*	a=new StringBuilder();
	a.append("Student_1").append("DTO");
	a.append(".").append("address").append(".").append("street");
	//int idx = a.toString().lastIndexOf('.');
	//String[] attributeValue = a.toString().substring(0, idx).split("\\.");
	
	
	//a.toString().substring(idx,idx + 1);
	
	//a.delete(idx,idx+1);
	String def = a.toString().substring(0, a.toString().lastIndexOf(".")) + "";
	
	//a.toString().replace("","street");
	
	 a = new StringBuilder(def);*/
		
		String test="City_3";
		String cona="Student.id";
		String testing[]=cona.split("\\.");
		String rrr=	test.split("\\_")[0];
		System.out.println(rrr);
	
		for(String singlea:testing)
		{
			if(singlea.equalsIgnoreCase(rrr))
			{
				System.out.println("tesing");
			}
		}
	
	
	
	
	}

}
