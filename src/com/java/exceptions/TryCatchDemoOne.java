package com.java.exceptions;

public class TryCatchDemoOne {

	public static void main(String[] args) {
	demoOne();
	demoTwo();
	
	}
	public static void demoOne() {
		
		int num1;
		int num2;
		
		
		
		try {
			
			String str = null;
			num1 = 0;
			num2 = 50/num1;
			
			
		} catch (ArithmeticException e) {
			
			System.out.println("something is wrong");
		}
		catch(NullPointException e) {
			System.out.println("its null pointer exceptions");
		}
		
		System.out.println("this is try-catch block ");
		
	}
	
	
	public static void demoTwo() {
		try {
			int a[]=new int[5];
			a[4] = 30/0;
			
		} 
		catch (Arithmetic Exception e) {
			System.out.println("this is arithmetic exception");
		}
		
		catch(ArrayIndexOutBoundsException e) {
			System.out.println("the value is out side of an array");
		}
		catch(Exception e) {
			System.out.println("something went wrong");
		}
		System.out.println("out of try catch block");
	}
	
	public static void demoThree() {
		
		try {
			int sum = 120/3;
			System.out.println(num);
			
		} catch (ArithmeticException e) {
			System.out.println("math exceptions");
		}
		finally {
			System.out.println("this is finally block");
		}
		
	}
	
	
}
