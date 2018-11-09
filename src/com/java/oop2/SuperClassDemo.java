package com.java.oop2;

public class SuperClassDemo extends A{

	//when you have super class and sub class and both the class has same name of variable 
	//if so when you use super key word it will refer to super class variable
	//when you want to call explicity super class constructor you need use super word.
	//to access method from super class when child class has overridden the method.
	

	int num = 111;
	void printNumber() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		SuperClassDemo obj = new SuperClassDemo();
		obj.printNumber();
	}
	
	
}

class A {
	int num = 100;
	
}

