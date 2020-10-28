package com.userregistrationtest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration user;

	@Before
	public void UserRegistrationObjectCreation() {
		user = new UserRegistration();
	}

	@After
	public void nullObject() {
		user = null;
	}

	@Test
	public void testFirstName_WhenProper_ShouldReturnTrue() {
		try {
			assertEquals(true, user.validateFirstName("Sivakumar"));
		} catch (InvalidUserDetailsException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void testFirstName_WhenProper_ShouldReturnFalse() {
		try {
			assertEquals(true, user.validateFirstName("sivakumar"));
		} catch (InvalidUserDetailsException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void testLastName_WhenProper_ShouldReturnTrue() {
		try {
			assertEquals(true, user.validateLastName("Upparapalli"));
		} catch (InvalidUserDetailsException ex) {
			ex.printStackTrace();
		}

	}

	@Test
	public void testLastName_WhenProper_ShouldReturnFalse() {
		try {
			assertEquals(true, user.validateLastName("upparapalli"));
		} catch (InvalidUserDetailsException ex) {
			ex.printStackTrace();
		}

	}

	@Test
	public void testEmail_WhenProper_ShouldReturnTrue() {
		try {
			assertEquals(true, user.validateEmail("abc@gmail.com"));
		} catch (InvalidUserDetailsException ex) {
			ex.printStackTrace();
		}

	}

	@Test
	public void testEmail_WhenProper_ShouldReturnFalse() {
		try {
			assertEquals(true, user.validateEmail("abc.123.oi@gmail.com"));
		} catch (InvalidUserDetailsException ex) {
			ex.printStackTrace();
		}

	}

	@Test
	public void testMobileNumber_WhenProper_ShouldReturnTrue() {
		try {
			assertEquals(true, user.validateMobileNumber("91-9177258790"));
		} catch (InvalidUserDetailsException ex) {
			ex.printStackTrace();
		}

	}

	@Test
	public void testMobileNumber_WhenProper_ShouldReturnFalse() {
		try {
			assertEquals(true, user.validateMobileNumber("91 7995840125"));
		} catch (InvalidUserDetailsException ex) {
			ex.printStackTrace();
		}

	}

	@Test
	public void testPassword_WhenProper_ShouldReturnTrue() {
		try {
			assertEquals(true, user.validatePassword("Sivakum@1"));
		} catch (InvalidUserDetailsException ex) {
			ex.printStackTrace();
		}

	}

	@Test
	public void testPassword_WhenProper_ShouldReturnFalse() {
		try {
			assertEquals(true, user.validatePassword("sivakum1"));
		} catch (InvalidUserDetailsException ex) {
			ex.printStackTrace();
		}

	}

}