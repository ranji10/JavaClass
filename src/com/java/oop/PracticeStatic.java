package com.java.oop;

public class PracticeStatic {
	
	static int num;
	static string str;
	
	
	static {
		System.out.println"static block 1);
		
		num = 12;
		str = "some value"
				PracticeStatic demo = new PracticeStatic();
	}
	
	static {
		System.out.println("static block 2");
		
		num = 98;
		str = "block2"
	}
	public static void oneMethod() {
		
		System.out.println("this is static method");
	}
	 public void secondMethod() {
		 System.out.println("this is non static method");
	 }
	
public static void main(String[] args) {
	
	System.out.println(num);
	System.out.println(str);
	PracticeStatic demo = new PracticeStatic();
	
}
	 
	 
}
