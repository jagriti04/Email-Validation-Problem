package com.bridgelabz.emailValid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationProblem {
	
	public static final String[] emailArray =  {"abc", "abc@yahoo.com", "abc-100@yahoo.com", "cdf@g.com",
											"abc@.com.my"}; 
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the email validation system");
		
		for(String matchString : emailArray) {
			String patternString = "^(abc)";
			System.out.println("match email: " + matchString);
			
			Pattern pattern = Pattern.compile(patternString);
		    Matcher matcher = pattern.matcher(matchString);
		    boolean isMatch = matcher.find();
		    
			System.out.println(isMatch);
			if (isMatch) {
				System.out.println("The email given is valid");
			} else {
				System.out.println("The email given is invalid");
			}			
		}
		
	}
}
