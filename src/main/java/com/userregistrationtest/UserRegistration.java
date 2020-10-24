package com.userregistrationtest;

import java.util.regex.Pattern;

public class UserRegistration {
	private static final String MOBILENUMBER_PATTERN = "^[1-9]{2}-[1-9]{1}[\\d]{9}";

	public boolean validateMobileNumber(String mobileNumber) {
		return Pattern.matches(MOBILENUMBER_PATTERN, mobileNumber);
	}

}
