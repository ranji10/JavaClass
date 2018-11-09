package com.java.oops3;

public class GCexample {
	
	public static void main(String[] args) {
		GCexamole obj = new GCexample();
		obj = null;
		
		GCexample a = new GCexample();
		GCexample b = new GCexample();
		a = b;
		System.gc();
		
	}
protected void finalize()throws Throwable{
	System.out.println("System GC the object");
	
}
}
