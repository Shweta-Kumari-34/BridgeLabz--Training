package junit.testingpasswordstrengthvalidator;

public class PasswordValidator {
	 // checks if a password is valid
    public boolean isValid(String password) {
        if (password == null) return false;

        // check minimum length
        if (password.length() < 8) return false;

        boolean hasUppercase = false;
        boolean hasDigit = false;

        // check for at least one uppercase letter and one digit
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUppercase = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        return hasUppercase && hasDigit;
    }
}
