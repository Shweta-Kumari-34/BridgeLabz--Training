package junit.testinguserregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    // regex pattern for validating email
    private static final String EMAIL_REGEX = "^[\\w.-]+@[\\w.-]+\\.\\w+$";

    /**
     * Registers a user after validating username, email, and password.
     * Throws IllegalArgumentException if any validation fails.
     */
    public void registerUser(String username, String email, String password) {

        // check for null inputs
        if (username == null || email == null || password == null) {
            throw new IllegalArgumentException("Inputs cannot be null");
        }

        // username validation: at least 3 characters
        if (username.length() < 3) {
            throw new IllegalArgumentException("Username must be at least 3 characters");
        }

        // email validation using regex
        if (!Pattern.matches(EMAIL_REGEX, email)) {
            throw new IllegalArgumentException("Invalid email format");
        }

        // password validation: at least 8 characters
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }

        // password must contain at least one uppercase letter
        if (!password.chars().anyMatch(Character::isUpperCase)) {
            throw new IllegalArgumentException("Password must contain at least one uppercase letter");
        }

        // password must contain at least one digit
        if (!password.chars().anyMatch(Character::isDigit)) {
            throw new IllegalArgumentException("Password must contain at least one digit");
        }

        // if all validations pass, user is registered successfully (logic can be extended)
    }
}

