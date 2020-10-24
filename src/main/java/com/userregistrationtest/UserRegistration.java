package com.userregistrationtest;

import java.util.regex.Pattern;

public class UserRegistration {
	String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

	public boolean validateLastName(String lname) {
		return Pattern.matches(LAST_NAME_PATTERN, lname);
	}

}
