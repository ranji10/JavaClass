package com.java.collections;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ArraysExamples {
	
	public static void main(String[] args) {
		
		String array[]= new String[] {"First","Second","third","fourth"};
		System.out.println(Arrays.toString(array));
		
		String[]arr1= new String[] {"fifth","sixth"};
		String[]arr2 = new String[] {"Seventh","Eighth"};
		
		String[][]arrayOfArray = new String[][] {arr1,arr2};
		
		System.out.println(Arrays.deepToString(arrayOfArray));
		
		String[] names = {"Alex","Brian","Charkes","David"};
		
		String[] cloneOfnames =names.clone();
		System.out.println(Arrays.toString(cloneOfnames));
		String[]copyOfNames = Arrays.copyOf(names, names.length);
		
		//copy some of arrays
		String[]partialNames = Arrays.copyOfRange(names,0,2);
		System.out.println(Arrays.toString(partialNames));
	
		String str= "How to code in java";
		String[]words = null;
		words= str.split("");
		Pattern pattern = Pattern.compile("");
		words = pattern.split(str);
		System.out.println(Arrays.toString(words));
		
		//to remove ,
		String newStr = String.join("", words);
		System.out.println(newStr);
				
		//convert into arrays
		
		String strOne ="alex,brian,chares,david";
		String[]nameOfArray= null;
		Pattern pattern2= Pattern.compile(",");
		nameOfArray = pattern2.split(strOne);
		System.out.println(Arrays.toString(nameOfArray));
		
		
	}

}
