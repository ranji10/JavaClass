package com.java.oops3;

public class FinalDemo {

	final int max_value = 99;
	//final method cannot be override
	final void fDemo() {
		System.out.println("this is final method");
}

	void myMethod() {
		
		
	}
	
	public static void main(String[] args) {
		FinalDemo obj = new FinalDemo() 
		obj.myMethod();
		
	}
}
//a constructor cannot be declared as final
//local final variable must be initilizing during decleration
//all variables declared is an interface are by default final
//we cannot change the value of final variable 
//a fianal method cannot be overridden
// a final class cannot be inherited
// if method parameters are declared final then the value of these parameters cannot be changed
