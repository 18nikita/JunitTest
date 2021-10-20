package com.bridgelabz.junit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidate {

	private final String NAME_VALIDATOR = "^[A-Z]{1}[a-z]{2,}$";
	private final String LAST_NAME_VALIDATOR = "^[A-Z]{1}[a-z]{2,}$";
	private final String EMAIL_VALIDATOR = "^([a][b][c])([\\.][a-z]+)[@][b][l][\\.][c][o]([\\.][i][n])";
	private final String MOBILE_NUM_VALIDATOR = "(0/91)?[7-9][0-9]{9}";
	private final String PASSWORD_RULE1_VALIDATOR = "[a-z]{8,}";
	private final String PASSWORD_RULE2_VALIDATOR = "[A-Z]{1,}[a-z]{8,}";
	private final String PASSWORD_RULE3_VALIDATOR = "[a-z A-z 0-9]{8,}";
	private final String PASSWORD_RULE4_VALIDATOR = "^(?=.*[A-Z a-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Z a-z\\d@$!%*#?&]{8,}$";

	static Scanner sc = new Scanner(System.in);

	public static boolean firstNameValidator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the first name: ");
		String fName = UserValidate.sc.nextLine();
		return Pattern.matches(uservalidate.NAME_VALIDATOR, fName);
	}

	public static boolean lastNameValidator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the Last name: ");
		String lName = UserValidate.sc.nextLine();
		return Pattern.matches(uservalidate.LAST_NAME_VALIDATOR, lName);
	}

	public static boolean emailValidator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the Email address: ");
		String email = UserValidate.sc.nextLine();
		return Pattern.matches(uservalidate.EMAIL_VALIDATOR, email);
	}

	public static boolean mobNumValidator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the Mobile number: ");
		String mobNum = UserValidate.sc.nextLine();
		return Pattern.matches(uservalidate.MOBILE_NUM_VALIDATOR, mobNum);
	}

	public static boolean password1Validator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the Password: ");
		String password1 = UserValidate.sc.nextLine();
		return Pattern.matches(uservalidate.PASSWORD_RULE1_VALIDATOR, password1);
	}

	public static boolean password2Validator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the Password 2: ");
		String password2 = UserValidate.sc.nextLine();
		return Pattern.matches(uservalidate.PASSWORD_RULE2_VALIDATOR, password2);
	}

	public static boolean password3Validator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the Password 3: ");
		String password3 = UserValidate.sc.nextLine();
		return Pattern.matches(uservalidate.PASSWORD_RULE3_VALIDATOR, password3);
	}

	public static boolean password4Validator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the Password 4: ");
		String password4 = UserValidate.sc.nextLine();
		return Pattern.matches(uservalidate.PASSWORD_RULE4_VALIDATOR, password4);
	}

	String[] validEmail = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com" };
	String[] invalidEmail = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com",
			"abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com",
			"abc@gmail.com.1a", "abc@gmail.com.aa.au" };
	{
		for (String value : validEmail) {
			System.out.println(value);
			System.out.println(Pattern.matches(
					"^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",
					value));
		}
		for (String s : invalidEmail) {
			System.out.println(s);
			System.out.println(Pattern.matches(
					"^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",
					s));
		}
	}
}