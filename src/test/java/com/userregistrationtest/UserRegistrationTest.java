package com.userregistrationtest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();
		boolean result = validator.validateFirstName("Siva");
		Assert.assertEquals(true, result);
	}
}
