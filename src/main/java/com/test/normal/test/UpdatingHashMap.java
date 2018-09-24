package com.test.normal.test;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.poi.ss.formula.functions.T;

import com.bcv.kagami.modules.dto.Address_2DTO;
import com.bcv.kagami.modules.dto.Student_1DTO;
import com.bcv.kagami.runtime.context.utils.xlsreader.ReaderBuilder;
import com.bcv.kagami.runtime.context.utils.xlsreader.XLSReader;

public class UpdatingHashMap {

	
	public static void main(String args[])
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
		stu.setSage("gg");
		//-----------------------------------------------------------------------------------------------
		Set<Address_2DTO> Address_2 = new HashSet<>();
	     Address_2DTO obj = new Address_2DTO();
	  //String abc="com.bcv.kagami.modules.dto.Address_2DTO";
	 
		//collection=(Collection)Address_2;
		
		Address_2DTO bcv=new Address_2DTO();
	     try {
			PropertyUtils.setProperty(stu, "village", "hye");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//collection.add(obj);
		//collection.add(bcv);
		//beans.put("Address_2", obj);
		
		//obj.setStreet("jj");
		//obj.setVillage("JJJ");
		
		//Address_2.add(bcv);
		
		System.out.println("Hello");
		
		
		
		
		
		
		
	}
}
