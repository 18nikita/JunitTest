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

	@Test
	public void password1Validator() {
		assertEquals(true, UserValidate.password1Validator());
	}
	
	@Test
	public void password2Validator() {
		assertEquals(true, UserValidate.password2Validator());
	}
	
	@Test
	public void password3Validator() {
		assertEquals(true, UserValidate.password3Validator());
	}
	
	@Test
	public void password4Validator() {
		assertEquals(true, UserValidate.password4Validator());
	}
}
