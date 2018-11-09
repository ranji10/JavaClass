package com.java.oops3;

public class CarModel extends CarDealer{

	@Override
	public void bodybuilding() {
		System.out.println("this is bodybuilding");
		
	}

	@Override
	public void color() {
		System.out.println("this is color");
		
		
	}

	@Override
	public void installEngine() {
		System.out.println("this is engine");
		
		
	}

	@Override
	public void verifyTheFunction() {
		System.out.println("this is the function");
		
		
	}

	public static void main(String[] args) {
		
		CarDealer obj = new CarModel();
		obj.bodybuilding();
		obj.color();
		obj.installEngine();
		obj.verifyTheFunction();
		
	}

	
	
}

abstract class CarDealer{
	
	public abstract void bodybuilding();
	public abstract void color();
	public abstract void installEngine();
	public abstract void verifyTheFunction();
	
public void getInfo(int num, int num2) {
		
		System.out.println(num + num2);
	}
	
	public static void getName(String name) {
		
	}
	
}

