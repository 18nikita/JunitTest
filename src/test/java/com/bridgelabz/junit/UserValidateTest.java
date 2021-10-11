package com.bridgelabz.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserValidateTest {
	@Test
	public void firstNameTestValidator() {
		assertEquals(true, UserValidate.firstNameValidator());
	}
	
	@Test
	public void lastNameTestValidator() {
		assertEquals(true, UserValidate.lastNameValidator());
	}
	
	@Test
	public void emailTestValidator() {
		assertEquals(true, UserValidate.emailValidator());
	}
}
