package com.java.exceptions;

public class ThrowDemo {
	
	public static void main(String[] args) {
		System.out.println("welcome to registrationn process");
		checkEligibility(10,20);
		
	}
	static void checkEligibility(int stuAge, int stuWeight) {
		
		if(stuAge<12&&stuWeight<40) {
			
			throw new ArithmeticException("Student is not eligible");
		}
		else {
			System.out.println("student is eligible");
		}
	}
}
