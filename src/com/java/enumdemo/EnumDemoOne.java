package com.java.enumdemo;

public class EnumDemoOne {

	public static void main(String[] args) {
		
		Countries code= Countries.CANADA;// link to countries class
		System.out.println(code.getCountryCode());
		
		Countries code1= Countries.USA;
		System.out.println(code1.getCountryCode());
		
	}
}
