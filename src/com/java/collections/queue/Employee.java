package com.java.collections.queue;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{

	private Long id;
	private String name;
	private LocalDate dob;
	
	
	//constructor
	public Employee(Long id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.getID().compareTo(emp.id);
	}
	
	
	public String toString() {
		return "Employee [id=" +id +,"name="+name+",dob="+dob+"]"
	}
	
public Long getID() {
	return id;
	
}

public void setId(Long id) {
	this.id= id;
	
}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public LocalDate getdob() {
		return dob;
		
	}
	
	
	public int compareTo(Employee 0) {
		return this.getID().compareTo(0.id);
}
}
