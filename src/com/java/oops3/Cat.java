package com.java.oops3;

public class Cat extends Animal{

	@Override
	public void sound() {
		System.out.println("dog sound");
		
	}

	@Override
	public void move() {
		System.out.println("dog move");
		
	}

	@Override
	public void eat() {
		System.out.println("dog eat");
		
	}

	
	public static void main(String[] args) {
		Animal obj = new cat();
		obj.eat();
		obj.move();
	}
	
	
	
}

class cat extends Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}



abstract class Animal{
	
	//we cannot create an instance of an abstract class.
	//you cannot provide body of the method in abstract class
	//in abstract class you can declare method as abstract method as well
	//you can create normal method with the body in abstract class
	//abstract method are always public
	
	public abstract void sound();
	public abstract void move();
	public abstract void eat();
	
	
	
	public void getInfo(int num, int num2) {
		
		System.out.println(num + num2);
	}
	
	public static void getName(String name) {
		
	}
	
}
