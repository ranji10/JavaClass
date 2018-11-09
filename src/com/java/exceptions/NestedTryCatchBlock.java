package com.java.exceptions;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		//parent try block
		try {
			//child try block1
			try {
				System.out.println("inside block1");
				int b = 45/0;
				System.out.println(b);
			} catch ( ArithmeticException e1) {
				
			}
			//child try block2
		try {
			System.out.println("inside block2");
			int b= 45/0;
			System.out.println(b);
			
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println();
		}
		System.out.println("just other sttatement");
		}
		
		catch(ArithmeticException e3) {
			System.out.println("Arithmetic exception");
			System.out.println("inside parent try catch block");
		}catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("arrayindexoutofboundsexception");
			System.out.println("inside parent try catch block");
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("inside parent try catch block");
		}
		System.out.println("Next Statement");
			
			
		}
	}
	
	

