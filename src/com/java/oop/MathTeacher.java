package com.java.oop;

public class MathTeacher extends Teacher{
public static void main(String[] args) {
	MathTeacher obj = new MathTeacher();
	obj.designarion  = "math Teacher";
	obj.nemeOfSchool = "abc";
	obj.does();
}
	
	
}

class Teacher{
	
	String designarion = "teacher";
	String nemeOfSchool = "xyz";
	
	void does() {
		System.out.println("teaching");
	}

	public Teacher(String designarion, String nemeOfSchool) {
		super();
		this.designarion = designarion;
		this.nemeOfSchool = nemeOfSchool;
	}
	
	
	
	
}

