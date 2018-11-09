package com.java.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
	
	public static void main(String[] args) {
		
LinkedList<String> linkedList= new LinkedList<>();
		
		//add elements
		linkedList.add("A");
		linkedList.add("C");
		linkedList.add("B");
		linkedList.add("D");
		
		System.out.println(linkedList);
		
		linkedList.add(1,"C");
		linkedList.add(2,"B");
		linkedList.remove(1);
		linkedList.remove(3);
		System.out.println(linkedList);
		
		
		List<String>strList= new LinkedList<>(Arrays.asList("A","B","C","D"));
		System.out.println(strList);
		
		Collections.sort(strList);
		System.out.println(strList);
		Collections.sort(strList, Collections.reverseOrder());//print reverse
		System.out.println(strList);
		
		
		
		
	}

}
