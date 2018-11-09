package com.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListClasses {
	
	public static void main(String[] args) {
		
		List<Integer>listOne = new ArrayList<>();
		listOne.add(12);
		listOne.add(14);
		listOne.add(156);
		listOne.add(178);
		
		System.out.println(listOne);
		
		List<Integer>listTwo = new LinkedList<>(listOne);
		System.out.println(listTwo);
		listTwo.add(34);
		System.out.println(listTwo);
		
		
		List<Integer>listThree= new Vector<>(listTwo);
		System.out.println(listThree);
		
		
		
	}

}
