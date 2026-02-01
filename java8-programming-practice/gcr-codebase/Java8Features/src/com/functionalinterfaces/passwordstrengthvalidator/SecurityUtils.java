package com.functionalinterfaces.passwordstrengthvalidator;

public interface SecurityUtils {

	// static method to validate password strength
	static boolean isStrongPassword(String password) {

		if (password == null) {
			return false;
		}

		// minimum length 8
		boolean hasMinLength = password.length() >= 8;

		// at least one digit
		boolean hasDigit = password.matches(".*\\d.*");

		// at least one uppercase letter
		boolean hasUpperCase = password.matches(".*[A-Z].*");

		// at least one special character
		boolean hasSpecialChar = password.matches(".*[@#$%!].*");

		return hasMinLength && hasDigit && hasUpperCase && hasSpecialChar;
	}
}
