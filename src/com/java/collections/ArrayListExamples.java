package com.java.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		List<String>names= new ArrayList<>();
		
		
		System.out.println(names);
		names.add("Alex");
		names.add("Josh");
		names.add("mike");
		
		System.out.println("Names after adding"+names);
		names.remove("Alex");
		System.out.println("After remove method"+names);
		
		
		names.add("Brian");
		System.out.println(names);
		//set this name at first place
		names.set(0,"Brian");
		System.out.println(names);
		
		//printing 1,2,3,4 linewise
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		Iterator<Integer>it = numbers.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		List<String>newNames= new ArrayList<>();
		newNames.add("Steve");
		newNames.addAll(names);
		System.out.println(newNames);
		
		newNames.clear();
		System.out.println(newNames);
		
		ArrayList<String>arrayListObject = new ArrayList<>();
		
		arrayListObject.add("A");
				arrayListObject.add("B");	
						arrayListObject.add("C");	
								arrayListObject.add("D");
								
								System.out.println(arrayListObject);
								ArrayList<String>arrayListClone =(ArrayList<String>arrayListObjectclone());
								System.out.println(arrayListClone);
								
								System.out.println(arrayListObject.contains("A"));
								System.out.println(arrayListObject.contains("B"));
								
								System.out.println(arrayListClone.index("A")<=2);
								
		
		ArrayList<String>listOne = new ArrayList<>(Arrays.asList("a","b","c","d","f"));
		ArrayList<String>listTwo = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		
		Collections.sort(listOne);
		Collections.sort(listTwo);
		
		boolean isEqual = listOne.equals(listTwo);
		System.out.println(isEqual);
		
		
								//listOne.removeAll(listTwo);
								//System.out.println(listOne);
		
		listTwo.retainAll(listOne);
		System.out.println(listOne);
								
		
		//upper one is list
		
		//set
		
		ArrayList<Integer>numbersList= new ArrayList<>(Arrays.asList(1,1,2,3,3,3,4,5,5,6,6,7,8));
		ArrayList<Integer>subListOfBumbersList = new ArrayList<>(numbersList.subList(3,8));
		System.out.println(subListOfNumbersList);
		
		LinkedHashSet<Integer>hset= new LinkedHashSet<>(numbersList);
		System.out.println(hset);
		
		
		
	}

}
