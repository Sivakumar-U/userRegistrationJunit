package com.userregistrationtest;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IUserRegistration {
	String validate();
}

public class UserRegistrationLambda {

	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		IUserRegistration firstName = () -> {
			System.out.println("First Name: ");
			String pattern = SC.next();
			if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", pattern) == true)
				return "Valid";
			return "Invalid";
		};

		IUserRegistration lastName = () -> {
			System.out.println("Last Name: ");
			String pattern = SC.next();
			if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", pattern) == true)
				return "Valid";
			return "Invalid";
		};

		IUserRegistration email = () -> {
			System.out.println("Email id: ");
			String pattern = SC.next();
			if (Pattern.matches("^[A-Za-z0-9]+([._%+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+([.]([a-zA-Z]{2,3})*)+$",
					pattern) == true)
				return "Valid";
			return "Invalid";

		};

		IUserRegistration mobileNumber = () -> {
			System.out.println("Mobile Number: ");
			String pattern = SC.next();
			if (Pattern.matches("^[1-9]{2}-[1-9]{1}[\\d]{9}", pattern) == true)
				return "Valid";
			return "Invalid";
		};

		IUserRegistration password = () -> {
			System.out.println("Password: ");
			String pattern = SC.next();
			if (Pattern.matches("^(?=.*?[A-Z])(?=.*?[0-9])(?=.*[@$!%*#?&]).{8,}", pattern) == true)
				return "Valid";
			return "Invalid";
		};

		System.out.println(firstName.validate());
		System.out.println(lastName.validate());
		System.out.println(email.validate());
		System.out.println(mobileNumber.validate());
		System.out.println(password.validate());

	}

}
