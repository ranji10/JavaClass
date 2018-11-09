package com.java.collections.map;

import java.util.TreeMap;

public class TreeMapPractice {
	
	public static void main(String[] args) {
		treemapInfo();
		getTheColor();
	}
		
		
		public static void treemapInfo() {
			
			TreeMap<String,String>tree_map1= new TreeMap<String,String>();
			
			tree_map1.put("C1", "Red");
			tree_map1.put("C2", "Green");
			tree_map1.put("C3", "Black");
			tree_map1.put("C4", "White");
			
			
			if(tree_map1.containsValue("Green")) {
				System.out.println("Map has color green");
			}else {
				System.out.println("Map doesnot have color green");
			}
			if(tree_map1.containsValue("Pink")) {
				System.out.println("Map has color Pink");
			}else {
				System.out.println("Map doesnot have color Pink");
			}
			
			System.out.println("Greatest key"+ tree_map1.firstEntry());
			System.out.println("Last key"+ tree_map1.lastEntry());
			System.out.println("Highest key"+ tree_map1.higherKey(""));
			
			
			
			
			
			//System.out.println("Original linked list:" + tree_map1);
			
			//if(tree_map1.containsValue("Green")) {
				//System.out.println("Color green is present");
				
				
			//}else {
				//System.out.println("Color green is not present");
			//}
				
			//if(tree_map1.containsValue("Pink")) {
				//System.out.println("Color pink");
			//}
			
			
			
			
	}

}
