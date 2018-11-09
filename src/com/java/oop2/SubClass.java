package com.java.oop2;

public class SubClass extends ParentClass{
//constructor without parameter
	public SubClass() {
		
		super();
		System.out.println("this is constructor of subclass");
	}
	//constructor with parameter
	public SubClass(int num) {
		System.out.println("sub class" + num);
	}
	
	void display() {
		super.display();
		System.out.println("this is method from sub class");
	}
	
	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		obj.display();
		SubClass obj2 = new SubClass(10);
		obj2.display();
		
	}
	
	
}

class ParentClass{
	ParentClass() {
		System.out.println("this is constructor of parent class");
	}
	
	ParentClass(int num) {
		System.out.println("super class" +num);
		
				
	}
	
	void display() {
		
		System.out.println("this method is from parent class");
	}
	
}

