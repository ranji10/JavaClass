package com.java.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLlist {
	
	public static void main(String[] args) {
		
		LinkedList<String> linkedList= new LinkedList<>();
		
		//add elements
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		
		System.out.println(linkedList);
		
		//add elements at spepificed position
		linkedList.add(4,"A");
		linkedList.add(5,"A");
		
		System.out.println(linkedList);
		
		//remove element
		linkedList.remove("A");//removes a
		
		linkedList.remove(0);//removes b
		
		System.out.println(linkedList);
		
		
		//iterate
		ListIterator<String>itrator= linkedList.listIterator();
		
		while (itrator.hasNext()) {
			System.out.println(itrator.next());
		}
		
		
		
		
	}
	
	

}
