package com.java.oop2;

public class TestThree {

	public static void main(String[] args) {
		System.out.println("javadeveloper");
		
		
	}
	
	public static int count vowels(String str) {
		
		int count = 0;
		for (int i = 0; i<str.length(); i++ ) {
			
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'||) {
				count++;
				
			}
		}
		return count;
	}
	
	
}
