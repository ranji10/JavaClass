package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PracticeLinkList {

	public static void main(String[] args) {
		
		//converting string to arrary 
		
		
		String[]str= {"A","B","C","D"};
		System.out.println(Arrays.toString(str));
		LinkedList<String>listOne = new LinkedList<>(Arrays.asList(str));
		System.out.println(listOne);
		
	}	
	
}
