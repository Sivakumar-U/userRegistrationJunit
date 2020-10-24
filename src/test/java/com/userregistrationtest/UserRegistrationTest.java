package com.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testPassword8Chars_Should1UC1Numeric_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validatePassword("sivaKuma1");
		Assert.assertEquals(true, result);
	}
}
