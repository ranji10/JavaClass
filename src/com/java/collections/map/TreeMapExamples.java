package com.java.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExamples {
	
	public static void main(String[] args) {
		treemapInfo();
		
		
	}
	
	public static void treemapInfo() {
		
		TreeMap<Integer,String>tmap= new TreeMap<>();
		
		tmap.put(23,"Data23");
		tmap.put(3,"Data3");
		tmap.put(2,"Data2");
		tmap.put(65,"Data65");
		tmap.put(67,"Data67");
		tmap.put(87,"Data87");
		
		//Set.set = tmap.entrySet();
		//Iterator it = set.iterator();
		//while(it,hasNext()) {
			//Map.Entry entry= (Entry)it.next();
			//System.out.println("Key is "+entry.getKey()+""+"Value is " +entry.getValue());
		//}
		
		
		
		
	
		System.out.println(tmap);
		
		Iterator<Integer> itr= tmap.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value= tmap.get(key);
			
			System.out.println(" key:: "+ key + " value::"+ value);
		
	}
		
		
	}
	
}
