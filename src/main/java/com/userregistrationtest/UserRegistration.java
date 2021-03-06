package com.userregistrationtest;

import java.util.regex.Pattern;

public class UserRegistration {

	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-z]{3,}[.\\w]*@[\\w]{3,}.[\\w]{2,3}[.a-z]*$";
	private static final String MOBILENUMBER_PATTERN = "^[1-9]{2}-[1-9]{1}[\\d]{9}";
	private static final String PASSWORD_PATTERN = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*[@$!%*#?&]).{8,}";

	// Using Lambda Function To Validate User Entry
	static UserRegistrationInterface myObj = (detailsPattern, details) -> {
		return (Pattern.matches(detailsPattern, details));
	};

	public boolean validateFirstName(String firstName) throws InvalidUserDetailsException {
		if (myObj.validate(FIRST_NAME_PATTERN, firstName)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter a valid first name");
		}

	}

	public boolean validateLastName(String lastName) throws InvalidUserDetailsException {
		if (myObj.validate(LAST_NAME_PATTERN, lastName)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter a valid last name");
		}

	}

	public boolean validateEmail(String email) throws InvalidUserDetailsException {

		if (myObj.validate(EMAIL_PATTERN, email)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter a valid email");
		}

	}

	public boolean validateMobileNumber(String number) throws InvalidUserDetailsException {

		if (myObj.validate(MOBILENUMBER_PATTERN, number)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter a valid mobile number");
		}

	}

	public boolean validatePassword(String password) throws InvalidUserDetailsException {

		if (myObj.validate(PASSWORD_PATTERN, password)) {
			return true;
		} else {
			throw new InvalidUserDetailsException("Enter a valid password");
		}

	}
}