package com.java.exceptions;

public class CustomExceptionClass {
	
	void productCheck(int weight) throws InvalidProductException{
		
		if(weight <100) {
			throw new InvalidProductException("Product is invalid");
			
		}
		
	}
public static void main(String[] args) {
	
	CustomExceptionClass obj = new CustomExceptionClass();
	try {
		obj.productCheck(160);
		System.out.println("product is valid");
	} catch (InvalidProdctException e) {
		
		System.out.println("found an exception");
		System.out.println(e.getMessage);
	}
	}
	
}


class InvalidProductException extends Exception{
	
	InvalidProductException(String s){
		super(s);
	}
	
}