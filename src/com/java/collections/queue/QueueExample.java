package com.java.collections.queue;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		PriorityQueue<Employee>queue= new PriorityQueue<>();
		queue.add(new Employee(12L,"Steve",LocalDate.now()));
		queue.add(new Employee(11L,"Mike",LocalDate.now()));
		queue.add(new Employee(123L,"John",LocalDate.now()));
		queue.add(new Employee(154L,"Paul",LocalDate.now()));
		queue.add(new Employee(126L,"Ram",LocalDate.now()));
		
		while(true) {
			Employee e = queue.poll();//link to previous employee 
			System.out.println(e);
			if(e==null)
				break;
			
			
		}
		
		
	}

}
