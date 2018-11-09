package com.java.oops3;

public class Employee extends Person {
	
	
	private int empId;
	
	public Employee(String nm, String gen, int emoId, int empId) {
		super(nm,gen);
		this.empId = empId;
		
	}
public Employee(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
public void work() {
	
	if(empId==0) {
		System.out.println("Not working");
		
	}
	else {
		System.out.println("Employee working");
	}
	
}

public static void main(String[] args) {
	Person emp1= new Employee("Steve","m","o");
	Person emp2= new Employee("Bob","m","123");
	
	emp1.work();
	emp2.work();
	
	emp1.changeName("Josh");
	System.out.println(emp1.toString());
	
}

}
