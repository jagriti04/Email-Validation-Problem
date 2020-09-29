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
//			
			String patternString = "^[a-zA-z]{1}([.]{0,1}[a-zA-z0-9+-]{1,}){0,}[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-z]{2,3}([.]{1}[a-z]{2}){0,1}$";
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
