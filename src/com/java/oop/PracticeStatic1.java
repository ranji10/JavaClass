package com.java.oop;

public class PracticeStatic1 {
	
	
	static int i = 120;
	static String book = "java class";
	
	
	static void display() {
		
		System.out.println(i);
		System.out.println(book);
	}
	
	void function() {
		display();
		
	}
	
	public static void main(String[] args) {
		PracticeStatic1 st = new PracticeStatic1();
		st.function();
		
		
	}

}
