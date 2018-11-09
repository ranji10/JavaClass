package com.java.oop;

public class SimpleStaticDemo {

	static int num;
	static string str;
	
	static {
		
		num = 95;
		str = "this is static class";
	}
	
	
	public static void oneMethod(){
		System.out.println("this is static method");
		
	}
	
	public void secondMethod() {
		System.out.println("this is nonstatic method ");
	}
	
	public static void main(String[] args) {
		
	oneMethod();
	SimpleStaticDemo demo = new SimpleStaticDemo();
	demo.secondMethod();
	System.out.println(num);
	System.out.println(str);
	
		
	}
	static {
		
		num=95;
		str ="this is static";
	
		
		
	}
}
