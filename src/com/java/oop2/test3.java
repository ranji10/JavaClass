package com.java.oop2;

public class test3 {

	public static void main(String[] args) {
		System.out.println(findTheSmallest(33, 43, 54));
		System.out.println(findTheMiddle("anynumber"));
		
		
	}
	
	public static double findTheSmallest( double a , double b, double c) {
		return Math.min(Math.min(a, b ),c);
	}
	
	public static String findTheMiddle(String str) {
		int position;
		int length;
		
		if (str.length()%2==0) {
			position= str.length()/2-1;
			length = 2;
			
		}
		else {
			position = str.length()/2;
			length = 1;
		}
		return str.substring(position, position + length);
	}
	
}
