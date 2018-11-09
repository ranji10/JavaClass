package com.java.oop;

public class CarDemo {
	
	public char color;
	public char model;
	public int wheel;
	
public CarDemo(char color, char model, int wheel) {
	this.color = color;
	this.model = model;
	this.wheel = wheel;
}
public void applyBrake (int decrement)
{
	speed -= decrement;
}
public void speedUp(int increment) {
	speed += increment;
	
}

public String toString()
{
	return("no of gears are" +gear
			+"\n"
			+"speed of bicycle is " +speed);
	
}

}

class BikeDemo extends CarDemo
{
	
}
