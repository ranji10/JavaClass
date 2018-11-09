package com.java.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexThree {
	
	public static void main(String[] args) {
		
		List<String> emails= new ArrayList<>();
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("user1@domain.com");
		emails.add("user.name@domain.com");
		emails.add("user#@domain.com.in");
		emails.add("user@domaincom");
		
		emails.add("user#domain.com");
		emails.add("@yahoo.com");
		
		String regex= "^(.+)@(.+)$";
		String reString= "^[A-Za-z0-9+_.-]+@(.+)$";
		
		Pattern pattern = Pattern.compile(regex);
		
		for(String email: emails) {
			Matcher matcher= pattern.matcher(email);
			System.out.println(email +" "+ matcher.matches());
			
		}
		
	}

}
