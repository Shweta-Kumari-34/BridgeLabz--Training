package junit.testingpasswordstrengthvalidator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PasswordValidatorTest {
	PasswordValidator validator = new PasswordValidator();

    // test a valid password
    @Test
    void testValidPassword() {
        String password = "Abcdef12";
        assertTrue(validator.isValid(password)); // should be valid
    }

    // test password too short
    @Test
    void testShortPassword() {
        String password = "Ab1";
        assertFalse(validator.isValid(password)); // too short
    }

    // test password without uppercase
    @Test
    void testNoUppercasePassword() {
        String password = "abcdef12";
        assertFalse(validator.isValid(password)); // no uppercase letter
    }
 // test password without digit
    @Test
    void testNoDigitPassword() {
        String password = "Abcdefgh";
        assertFalse(validator.isValid(password)); // no digit
    }

    // test null password
    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null)); // null should be invalid
    }

    // test password exactly 8 characters valid
    @Test
    void testExactLengthValidPassword() {
        String password = "A1bcdefg";
        assertTrue(validator.isValid(password)); // valid password with exactly 8 chars
    }
}
