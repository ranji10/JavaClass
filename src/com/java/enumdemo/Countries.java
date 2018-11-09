package com.java.enumdemo;

public enum Countries {
	
	USA ("US"),
	CANADA ("CN"),
	CHINA ("CH"),
	JAPAN ("JP");
	
	private final String shortCode;

	private Countries(String shortCode) {//constructor
		this.shortCode = shortCode;
	}
	
	public String getCountryCode() {
		return this.shortCode;
		
	}
	

}
