package com.userregistrationtest;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {

	static UserRegistration user;

	@BeforeClass
	public static void userRegistrationObj() {
		user = new UserRegistration();
		System.out.println("In Before Class");
	}

	@AfterClass
	public static void nullObj() {
		user = null;
		System.out.println("In After Class");
	}

	@Test
	public void testFirstName_WhenProper_ShouldReturnTrue() {
		try {
			boolean result = user.validateFirstName("Sivakumar");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void testFirstName_WhenNotProper_ShouldReturnFalse() {
		try {
			boolean result = user.validateFirstName("sivakumar");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void testLastName_WhenProper_ShouldReturnTrue() {
		try {
			boolean result = user.validateLastName("Upparapalli");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void testLastName_WhenNotProper_ShouldReturnFalse() {
		try {
			boolean result = user.validateLastName("upparapalli");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void testEmail_WhenProper_ShouldReturnTrue() {
		try {
			boolean result = user.validateEmail("abc.xyz@gmail.co.in");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void testEmail_WhenNotProper_ShouldReturnFalse() {
		try {
			boolean result = user.validateEmail("ab@gmail.com");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}

	}

	@Test
	public void testMobileNumber_WhenProper_ShouldReturnTrue() {
		try {
			boolean result = user.validateMobileNumber("91-9786541230");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}

	}

	@Test
	public void testMobileNumber_WhenNotProper_ShouldReturnFalse() {
		try {
			boolean result = user.validateMobileNumber("9137845620");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}

	}

	@Test
	public void testPassword_WhenProper_ShouldReturnTrue() {
		try {
			boolean result = user.validatePassword("Sivaku@1");
			Assert.assertTrue(result);
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}

	}

	@Test
	public void testPassword_WhenNotProper_ShouldReturnFalse() {
		try {
			boolean result = user.validatePassword("sivaka1");
			Assert.assertFalse(result);
		} catch (InvalidUserDetailsException ex) {
			System.out.println(ex.getMessage());
		}
	}

}