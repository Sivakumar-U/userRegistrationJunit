package com.userregistrationtest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testFirstName_WhenProper_ShouldReturnTrue() {
		try {
			UserRegistration validate = new UserRegistration();
			assertTrue(validate.validateFirstName("Siva"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void testFirstName_WhenProper_ShouldReturnFalse() {
		try {
			UserRegistration validate = new UserRegistration();
			assertTrue(validate.validateFirstName("siva"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void testLastName_WhenProper_ShouldReturnTrue() {
		try {
			UserRegistration validate = new UserRegistration();
			assertTrue(validate.validateLastName("Upparapalli"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}

	}

	@Test
	public void testLastName_WhenProper_ShouldReturnFalse() {
		try {
			UserRegistration validate = new UserRegistration();
			assertTrue(validate.validateLastName("upparapalli"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void testEmail_WhenProper_ShouldReturnTrue() {
		try {
			UserRegistration validate = new UserRegistration();
			assertTrue(validate.validateEmail("abc.xyz@gmail.co.in"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void testEmail_WhenProper_ShouldReturnFalse() {
		try {
			UserRegistration validate = new UserRegistration();
			assertTrue(validate.validateEmail("abc@gmail.com"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}

	}

	@Test
	public void testMobileNumber_WhenProper_ShouldReturnTrue() {
		try {
			UserRegistration validate = new UserRegistration();
			assertTrue(validate.validateMobileNumber("91-7896541230"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}

	}

	@Test
	public void testMobileNumber_WhenProper_ShouldReturnFalse() {
		try {
			UserRegistration validate = new UserRegistration();
			assertTrue(validate.validateMobileNumber("7896541230"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}

	}

	@Test
	public void testPassword_WhenProper_ShouldReturnTrue() {
		try {
			UserRegistration validate = new UserRegistration();
			assertTrue(validate.validatePassword("Sivakum@1"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}

	}

	@Test
	public void testPassword_WhenProper_ShouldReturnFalse() {
		try {
			UserRegistration validate = new UserRegistration();
			assertTrue(validate.validatePassword("sivakuma1"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

}