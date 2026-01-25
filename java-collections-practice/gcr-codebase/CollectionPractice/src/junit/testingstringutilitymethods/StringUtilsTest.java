package junit.testingstringutilitymethods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	// Creating object of StringUtils class
	StringUtils stringUtils = new StringUtils();

	// Test case for reverse() method
	@Test
	public void testReverse() {
		assertEquals("avaJ", stringUtils.reverse("Java"));
	}

	// Test case for isPalindrome() method
	@Test
	public void testIsPalindrome() {
		assertTrue(stringUtils.isPalindrome("madam"));
		assertFalse(stringUtils.isPalindrome("java"));
	}

	// Test case for toUpperCase() method
	@Test
	public void testToUpperCase() {
		assertEquals("HELLO", stringUtils.toUpperCase("hello"));
	}
}
