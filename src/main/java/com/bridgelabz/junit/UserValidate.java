package com.bridgelabz.junit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidate {

	private final String NAME_VALIDATOR = "^[A-Z]{1}[a-z]{2,}$";
	private final String EMAIL_VALIDATOR = "^([a][b][c])([\\.][a-z]+)[@][b][l][\\.][c][o]([\\.][i][n])";
	private final String MOBILE_NUM_VALIDATOR = "(0/91)?[7-9][0-9]{9}";
	static Scanner sc = new Scanner(System.in);

	public static boolean firstNameValidator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the first name: ");
		String fName = uservalidate.sc.nextLine();
		return Pattern.matches(uservalidate.NAME_VALIDATOR, fName);
	}
	

	public static boolean lastNameValidator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the Last name: ");
		String lName = uservalidate.sc.nextLine();
		return Pattern.matches(uservalidate.NAME_VALIDATOR, lName);
	}
	
	public static boolean emailValidator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the Email address: ");
		String email = uservalidate.sc.nextLine();
		return Pattern.matches(uservalidate.EMAIL_VALIDATOR, email);
	}
	
	public static boolean mobNumValidator() {
		UserValidate uservalidate = new UserValidate();
		System.out.println("Enter the Mobile number: ");
		String mobNum = uservalidate.sc.nextLine();
		return Pattern.matches(uservalidate.MOBILE_NUM_VALIDATOR, mobNum);
	}


	
}