package com.java.oop2;

public class SmallestNumber{
	
	public static void main(String[] args) {
		System.out.println(findTheSmallest(23,46,75));
		
	}
	
	public static double findTheSmallest(double a, double b, double c) {
		
		return Math.min(Math.min(a, b),c);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(findTheGreatest(45,74,43));
	}
	
	public static double findTheGreatest( int a , int b , int c) {
		return Math.max(Math.max(a, b),c);
	}
}