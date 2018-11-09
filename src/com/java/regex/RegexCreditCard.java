package com.java.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCreditCard {

	public static void main(String[] args) {
		
		String regex = 
				"^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|\n" + 
				"		(?<mastercard>5[1-5][0-9]{14})|\n" + 
				"		(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|\n" + 
				"		(?<amex>3[47][0-9]{13})|\n" + 
				"		(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|\n" + 
				"		(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$";
						
	
	List<String>cards= new ArrayList<>();
		cards.add("2345-654-64667-5467");
		cards.add("8580-7476847-3355");
		
		Pattern pattern = Pattern.compile(regex);
		for (String card : cards) {
			card= card.replaceAll("-","");
			Matcher matcher= pattern.matcher(card);
			System.out.println(card+""+matcher.matches());
		}
		
		
	}
	
}
