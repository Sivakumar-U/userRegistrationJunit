package com.userregistrationtest;

@FunctionalInterface
public interface UserRegistrationInterface {
	public boolean validate(String pattern, String userDetails);

}
