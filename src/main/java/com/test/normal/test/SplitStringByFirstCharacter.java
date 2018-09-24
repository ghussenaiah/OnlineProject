package com.test.normal.test;

public class SplitStringByFirstCharacter {
	
	public static void main(String args[]){
		String str ="abc$cdf$789$  99976";
		String kept = str.trim().substring( 0, str.trim().indexOf("$"));
		String remainder = str.trim().substring(str.trim().indexOf("$")+1, str.trim().length());
		System.out.println(kept);
		System.out.println(remainder);
		
		
	}
}
