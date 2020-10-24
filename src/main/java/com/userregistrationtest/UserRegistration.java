package com.userregistrationtest;

import java.util.regex.Pattern;

public class UserRegistration {
	private static final String PASSWORD_PATTERN = "^(?=.*?[A-Z]).{8,}";

	public boolean validatePassword(String password) {
		return Pattern.matches(PASSWORD_PATTERN, password);
	}

}
