package com.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testPassword8Chars_Should1UC_1Numeric_1SpecialChar_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validatePassword("sivaKuma@1");
		Assert.assertEquals(true, result);
	}
}
