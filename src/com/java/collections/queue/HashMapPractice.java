package com.java.collections.queue;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapPractice {
	
	public static void main(String[] args) {
		
		
		Hashtable<Integer,String> hashtable = new Hashtable();
	
		hashtable.put(1, "A");
		hashtable.put(2, "B");
		hashtable.put(3, "C");
		System.out.println(hashtable);
		
		
		Iterator<Integer> itr= hashtable.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value= hashtable.get(key);
			
			System.out.println(" key:: "+ key + " value::"+ value);
		
	}
		
		Iterator<Entry<Integer,String>> itr1= hashtable.entrySet().iterator();
		
		while(itr1.hasNext()) {
			Entry<Integer,String>en =itr1.next();
			System.out.println("This is key::"+ en.getKey()+"This is value::"+ en.getValue());
		}
		

}
}