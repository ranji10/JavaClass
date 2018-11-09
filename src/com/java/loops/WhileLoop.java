package com.java.loops;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 10;
		while(i >1) {
			System.out.println(i);
			i--;
		}
		
		
		int arr[] = {2,22,33,54};
		int x = 0;
		while (x < arr.length) {
		
		System.out.println(arr[x]);
		x++;
		
		}
		//fabonacci num 
		
		int count = 8;
		int a = 0;
		int b = 1;
		int j = 1;
		
		while( j <=count) {
			System.out.println(a + " ");
			
			int sum = a + b;
			a = b;
			b = sum;
			j++;
			
		}
		
		
		
	}

}
