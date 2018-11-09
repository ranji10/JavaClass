package com.java.oops3;

public abstract class Person {
	
	private String name;
	private String gender;
	
	
	public Person(String num, String gen) {
	this.name = nam;
	this.gender = gen;

}
//abstract method
public abstract void work();

public String toString() {
	return "Name=" +this.name + "::Gender=" +this.Gender()
}
public void changeName(String newName) {
	this.name =newName;
}
}



