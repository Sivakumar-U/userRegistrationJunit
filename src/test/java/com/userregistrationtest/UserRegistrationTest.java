package com.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateEmail("abc.xyz@gmail.com.in");
		Assert.assertEquals(true, result);
	}
}
