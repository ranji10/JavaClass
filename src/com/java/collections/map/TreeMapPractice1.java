package com.java.collections.map;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapPractice1 {
	
	public static void main(String[] args) {
		
		subMap();
		
		
	}

	//private static void treemapInfo() {
	
		//TreeMap<Integer,String>tree_map1= new TreeMap<Integer,String>();
		
		//tree_map1.put(10, "Red");
		//tree_map1.put(20, "Green");
		//tree_map1.put(30, "Black");
		//tree_map1.put(40, "White");
		//tree_map1.put(50, "Pink");
		
		
		//System.out.println(tree_map1);
	//}
		
		public static void subMap() {
			
			TreeMap<Integer,String>tree_map= new TreeMap<Integer,String>();
			SortedMap<Integer,String>sub_tree_map = new TreeMap<Integer,String>();
			
			tree_map.put(10, "Red");
			tree_map.put(20, "Green");
			tree_map.put(30, "Black");
			tree_map.put(40, "White");
			tree_map.put(50, "Pink");
			System.out.println("Original tree map content"+ tree_map);
			sub_tree_map= tree_map.subMap(20, true,40,true);
			System.out.println(sub_tree_map);
			
			//ceiling
			System.out.println("Keys greater or equal to 20:"+ tree_map.ceilingKey(20));
			System.out.println("Keys greater or equal to 30:"+ tree_map.ceilingKey(30));
			System.out.println("Keys greater or equal to 50:"+ tree_map.ceilingKey(50));
			
		}					

}
