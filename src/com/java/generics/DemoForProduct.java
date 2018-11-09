package com.java.generics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoForProduct {
	
	public static void main(String[] args, Products<String, String> listOfproducts) {
		
		Products<String,String> listOfproduct = new products<>();
		listOfproduct.setItemOne("some Products");
		listOfproducts.setItemTwo("Mobile Products");
		System.out.println(listOfproduct.getItemOne());
		System.out.println(listOfproduct.getItemTwo());
		
		Products<Integer,Integer>listOfProductNum = new Product<>();
		listOfproduct.setItemOne(23);
		listOfproducts.setItemTwo(50);
		System.out.println(listOfproduct.getItemOne());
		
		getUnionOfSetValues();
		
	}
	private static<E>Set<E> unionOfSets(Set<E> mySetOne,Set<E> mySetTwo){
		
		Set<E>resultSet= new TreeSet<>();
		resutlSet.addAll(mySetOne);
		resultSet.addAll(mySetTwo);
		
		return resultSet;
	}
	public static void getUnionOfSetValues() {
		Set<String>mySet1 = new HashSet<>();
		mySet1.add("DC");
		mySet1.add("VA");
		mySet1.add("MD");
		
		
		Set<String>mySet2 = new TreeSet<>();
		mySet2.add("DC");
		mySet2.add("VA");
		mySet2.add("MD");
		
		Set<String>reSet= unionOfSets(mySet1,mySet2);
		System.out.println(reSet);
		
		
	}	

}
