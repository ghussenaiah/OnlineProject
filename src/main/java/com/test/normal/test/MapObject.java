package com.test.normal.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapObject {

	
	
	public static void main(String args[])
	
	{
		List<String> mm=new ArrayList<String>();
		Map<String,String> tt=new HashMap<String,String>();
		tt.put("tt", "\'jj\'");
		System.out.println(tt.toString().replace('=', ':'));
		mm.add(tt.toString().replace('=', ':'));

		System.out.println(mm);
		
	}
}
