package junit.testinguserregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * UserRegistrationTest
 * -------------------
 * JUnit tests for UserRegistration using sample names.
 */
public class UserRegistrationTest {

    private final UserRegistration registration = new UserRegistration();

    /* ===== VALID USER REGISTRATION ===== */
    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> {
            registration.registerUser("Dipali", "dipali.ranjan@stu.com", "Password123");
        });
    }

    /* ===== INVALID USERNAME ===== */
    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("Di", "priya.kumari@stu.com", "Password123");
        });
    }

    /* ===== INVALID EMAIL ===== */
    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("PriyaKumari", "priya.kumari.com", "Password123");
        });
    }

    /* ===== PASSWORD TOO SHORT ===== */
    @Test
    void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("ShwetaKumari", "shweta.kumari@stu.com", "Ab1");
        });
    }

    /* ===== PASSWORD WITHOUT UPPERCASE ===== */
    @Test
    void testPasswordWithoutUppercase() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("Dipali", "dipali@example.com", "password1");
        });
    }

    /* ===== PASSWORD WITHOUT DIGIT ===== */
    @Test
    void testPasswordWithoutDigit() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("PriyaKumari", "priya.kumari@stu.com", "Password");
        });
    }

    /* ===== NULL INPUTS ===== */
    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, null, null);
        });
    }
}
