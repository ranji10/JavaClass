package com.java.oop2;

public class MethodOverRiding extends ABC{
	
	//method overriding only happens in another class
	//overrided method cannot be more limited then super class.

	public void getInfo{
		System.out.println("this is get info method from Sub class");
	}
	void newMethod() {
		super.getInfo();
		System.out.println("this is new method");
	}
	public static void main(String[] args) {
		MethodOverRiding obj = new MethodOverRiding();
		obj.getInfo();
		obj.newMethod();
		
		ABC obj2 = new MethodOverRiding();
		obj2.getInfo();
		
		ABC obj3 = new MethodOverRiding();
		obj3.getInfo();
			
		
	}
	
}


class ABC{
	public void getInfo() {
		
		System.out.println("this is get info method from super class");
	}
	
	
}