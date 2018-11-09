package com.java.loops;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		
		int arr[] = { 1,3,4,5,6,8};
		for(int i = 0; i < arr.length; i ++) {
			
		System.out.println(arr[i] );
		}
	
		
		
		for (int i : arr) {
			System.out.println(i);
		}
		String str[] = {"test1", "test2","test3"};
		for (String s: str) {
			System.out.println(s);
		}
		
		
		
		//fabicconi num
		int count = 8;
		int num1 = 0;
		int num2 = 1;
		
for(int i = 1; i <= count; i++) {
	System.out.println(num1);
	int sum = num1 + num2;
	num1 = num2;
	num2 = sum;
			
			
		}
		



		
	}

}
