package com.test.normal.test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class UpdatingHashMap {

	
	public static <T> void main(String args[])
	{
	
		Collection collection=null;
		Collection collection1=null;
		
		
		//collection=new ArrayList<>();
		final List<T> result = new ArrayList<T>();
		final Map<String, Object> beans = new HashMap<>();
		beans.put("result", result);
		
		collection=result;
		
		Student_1DTO stu=new Student_1DTO();
		collection.add(stu); 
		beans.put("Student_1DTO", stu);
		                     					  //adding object to collection
		                                          //now it is in beans and result
		stu.setSname("ff");
		
		System.out.println("Hello");
		
		
		
		
		
		
		
	}
}
