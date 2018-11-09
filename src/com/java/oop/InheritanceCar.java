package com.java.oop;

public class InheritanceCar {
 System.out.println("Class InheritanceCar");
	
}
public void vehicleType() {
	System.out.println("vehicle Type: InheritanceCar");
}

Class Honda extends InheritanceCar{
	public Honda() {
		System.out.println("class honda");
	}
	public void brand() {
		
		System.out.println("Brand: Accord");
	}
	public void color() {
		System.out.println("color: white");
	}
	public void wheel() {
		System.out.println("wheel: four wheel");
	}
	
public static void main(String[] args) {
	
	InheritanceCar obj = new InheritanceCar();
	obj.vehicleType();
	obj.brand();
	obj.color();
	obj.wheel();
	
}
	
}
