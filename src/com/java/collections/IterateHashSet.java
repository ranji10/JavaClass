package com.java.collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class IterateHashSet {
	
	public static void main(String[] args) {
		
		Set<String>hset = new HashSet<>();
		hset.add("Chaitanya");
		hset.add("Rahul");
		hset.add("dig");
		hset.add("mangol");
		hset.add("harry");
		
		
		Iterator<String>it= hset.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		for (String it2:hset) {
			System.out.println(it2);
		}
		
		Set<String>test = new TreeSet<>(hset);// arranging
		System.out.println("Sorted:" +hset);
		
		
		
		
	}

}
