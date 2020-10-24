package com.userregistrationtest;

import java.util.regex.Pattern;

public class UserRegistration {
	private static final String EMAIL_PATTERN = "^[a-z]{3,}[.\\w]*@[\\w]{3,}.[\\w]{2,3}[.a-z]*$";

	public boolean validateEmail(String email) {
		return Pattern.matches(EMAIL_PATTERN, email);
	}

}
