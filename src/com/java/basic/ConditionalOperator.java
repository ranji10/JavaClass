package com.java.basic;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		
		int num1; 
		int num2; 
		int num3; 
		
		int temp = (num1 > num2) ? num1 : num2;
		int temp2 = (num3 > temp) ? num3 : temp;
		
		System.out.println(temp2);
		
	}
}
