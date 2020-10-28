package com.userregistrationtest;

import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-z]{3,}[.\\w]*@[\\w]{3,}.[\\w]{2,3}[.a-z]*$";
	private static final String MOBILENUMBER_PATTERN = "^[1-9]{2}-[1-9]{1}[\\d]{9}";
	private static final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*[@$!%*#?&]).{8,}";

	public boolean validateFirstName(String firstName) throws InvalidUserDetailsException {
		boolean firstName1 = Pattern.matches(FIRST_NAME_PATTERN, firstName);
		if (firstName1)
			return Pattern.matches(FIRST_NAME_PATTERN, firstName);
		throw new InvalidUserDetailsException("Please enter proper First name");

	}

	public boolean validateLastName(String lastName) throws InvalidUserDetailsException {
		boolean lastname = Pattern.matches(LAST_NAME_PATTERN, lastName);
		if (lastname)
			return Pattern.matches(LAST_NAME_PATTERN, lastName);
		throw new InvalidUserDetailsException("Please enter proper Last name");
	}

	public boolean validateEmail(String email) throws InvalidUserDetailsException {
		boolean email1 = Pattern.matches(EMAIL_PATTERN, email);
		if (email1)
			return Pattern.matches(EMAIL_PATTERN, email);
		throw new InvalidUserDetailsException("Please enter proper Email");
	}

	public boolean validateMobileNumber(String number) throws InvalidUserDetailsException {
		boolean number1 = Pattern.matches(MOBILENUMBER_PATTERN, number);
		if (number1)
			return Pattern.matches(MOBILENUMBER_PATTERN, number);
		throw new InvalidUserDetailsException("Please enter proper Number");
	}

	public boolean validatePassword(String password) throws InvalidUserDetailsException {
		boolean password1 = Pattern.matches(PASSWORD_PATTERN, password);
		if (password1)
			return Pattern.matches(PASSWORD_PATTERN, password);
		throw new InvalidUserDetailsException("Please enter proper Password");
	}
}