package com.test.normal.test;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class SetValuesAsDynamic {

	
	public static void main(String args[])
	{
		int a=11;
		int b=a;
		System.out.println(b);
		ObjectMapper oMapper = new ObjectMapper();
		
		List<Map<String,String>> result=new ArrayList<Map<String,String>>();
		Map<String, String> myList1 = new HashMap<String, String>();
		myList1.put("a", "g");
		myList1.put("b", "k");
		myList1.put("c", "l");
		
		try {
			System.out.println(oMapper.writeValueAsString(myList1));
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		result.add(myList1);
     Map<String, String> myList2 = new HashMap<String, String>();
		
     	myList2.put("a", "g");
		myList2.put("b", "k");
		myList2.put("c", "90");
	
		result.add(myList2);
		try {
			String json = oMapper.writeValueAsString(result);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 // create multimap to store key and values
      /*  Multimap<String, String> multiMap = ArrayListMultimap.create();
        // put values into map for A
        multiMap.put("A", "Apple");
        multiMap.put("A", "Aeroplane");
        // put values into map for B
        multiMap.put("B", "Bat");
        multiMap.put("B", "Banana");
        // put values into map for C
        multiMap.put("C", "Cat");
        multiMap.put("C", "Car");
        // retrieve and display values
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        // get all the set of keys
        Set<String> keys = multiMap.keySet();
        // iterate through the key set and display key and values
        for (String key : keys) {
            System.out.println("Key = " + key);
            System.out.println("Values = " + multiMap.get(key) + "n");
        }*/
		
		
		
		
	}
}
