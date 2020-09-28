package com.bridgelabz.emailValid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidationProblem {
	
	public static final String[] emailArray =  {"abc", "abc@yahoo.com", "abc-100@yahoo.com", 
			"abc111@abc.com","abc.100@yahoo.com","abc-100@abc.net", "abc.100@abc.com.au","abc@1.com", 
			"abc@gmail.com.com", "abc+100@gmail.com", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
			"abc()*@gmail.com", "abc@%*.com","abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", 
			"abc@gmail.com.aa.au", "abc@.com.my",  }; 
	
	public void checkValidEmail() {
		for(String matchString : emailArray) {
			String patternString = "^(abc)(.[a-zA-Z0-9+_-]{1})[a-zA-Z0-9+_-]*(@[a-zA-Z0-9]{1,})*([.][a-zA-Z]{2,4})";
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
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the email validation system");
		EmailValidationProblem emailValidation = new EmailValidationProblem();
		emailValidation.checkValidEmail();
		
	}
}
