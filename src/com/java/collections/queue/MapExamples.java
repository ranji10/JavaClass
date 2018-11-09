package com.java.collections.queue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExamples {
	
	public static void main(String[] args) {
		
		Map<Integer,String>hmap= new HashMap<>();
		
		hmap.put(120, "Test");
		hmap.put(134, "Man");
		hmap.put(154, "tree");
		hmap.put(187, "house");
		
		System.out.println(hmap);
		System.out.println(hmap.get(768));
	hmap.remove(768);
	System.out.println(hmap);
		
	Iterator<Integer> itr= hmap.keySet().iterator();
	while(itr.hasNext()) {
		Integer key = itr.next();
		String value= hmap.get(key);
		
		System.out.println("This is key " + key + "This is value" + value);
		
		
	}
	
	Iterator<Entry<Integer,String>> itr1= hmap.entrySet().iterator();
	
	while(itr1.hasNext()) {
		Entry<Integer,String>en =itr1.next();
		System.out.println("TAhis is key::"+ en.getKey()+"This is value::"+ en.getValue());
	}
	
	}

}
