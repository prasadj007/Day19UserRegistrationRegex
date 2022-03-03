package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationRegex {
	
	static UserDetails user1 = new UserDetails();
	static Scanner sc = new Scanner(System.in);

	public static void getFirstName() {
		System.out.println("Enter First Name");
		String firstName = sc.next();
		boolean check = Pattern.matches("[A-Z]{1}+[a-z]{2,}", firstName);
		if (check) {
			user1.setFirstName(firstName); // if check become true
											// user first name will get added in user1 object
		} else {
			// else user get instruction to type first name as per pattern
			System.out.println("First name start with Cap and has minimum 3 characters");
		}
	}


	public static void getLastName() {
		System.out.println("Enter Last Name");
		String lastName = sc.next();
		boolean check = Pattern.matches("[A-Z]{1}+[a-z]{2,}", lastName);
		if (check) {
			user1.setFirstName(lastName); 	
		} else { 
			
			System.out.println("Last name start with Cap and has minimum 3 characters");
		}
	}

	public static void main(String[] args) {
		getFirstName();
		getLastName();
	}

}
