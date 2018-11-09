package com.java.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class IterateHashPractice {
	
	public static void main(String[] args) {
		
		LinkedList<String>c1 = new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Orange")
		c1.add("Pink");
		
		System.out.println("Original linked list:" +c1);
		
		if(c1.contains("Green")) {
			System.out.println("Color green is present");
			
			
		}else {
			System.out.println("Color green is not present");
		}
		
		//checks weather orange is present or not
		if(c1.contains("orange")) {
			System.out.println("Color orange is present");
			
		}else {
			System.out.println("orange not present");
		}
		
	}

}


//queue