package com.functionalinterfaces.passwordstrengthvalidator;

public class PasswordCheckApp {

	public static void main(String[] args) {

		String password1 = "Welcome@123";
		String password2 = "welcome123";

		System.out.println("Password 1 strong? " + SecurityUtils.isStrongPassword(password1));

		System.out.println("Password 2 strong? " + SecurityUtils.isStrongPassword(password2));
	}
}
