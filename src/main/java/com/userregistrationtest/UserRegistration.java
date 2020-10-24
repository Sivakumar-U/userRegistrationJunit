package com.userregistrationtest;

import java.util.regex.Pattern;

public class UserRegistration {
	String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

	public boolean validateFirstName(String fname) {
		return Pattern.matches(FIRST_NAME_PATTERN, fname);
	}

}
