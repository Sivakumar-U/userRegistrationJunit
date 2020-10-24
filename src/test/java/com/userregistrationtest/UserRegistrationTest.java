package com.userregistrationtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
	private String arg;
	private boolean expectedValidation;

	public UserRegistrationTest(String arg, boolean expectedValidation) {
		this.arg = arg;
		this.expectedValidation = expectedValidation;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> email() {
		Object[][] data1 = new Object[][] { { "abc@yahoo.com", true, }, { "abc.100@yahoo.com", true, },
				{ "abc.100@abc.com.au", true }, { "abc.abc@gmail.co.in", true }, { "abc100@gmail.com", true },
				{ "abc@gmail.com.com", true }, { "abc+100", false }, { "abc", false }, { "abc@.com.my", false },
				{ "abc123@gmail.a", false }, { ".abc@abc.com", false }, { "abc()*@gmail.com", false },
				{ "abc@%.com", false }, { "abc.@g.com", false }, { "abc@a.com.21a", false },
				{ "abc@g.cim.au.au", false } };

		return Arrays.asList(data1);
	}

	@Test
	public void testEmails_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		Boolean result = userRegistration.validateEmail(arg);
		Assert.assertEquals(result, expectedValidation);
	}
}
