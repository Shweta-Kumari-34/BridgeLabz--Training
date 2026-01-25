package junit.testingexceptionhandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	// Creating object of Calculator class
	Calculator calculator = new Calculator();

	// Test case to verify ArithmeticException is thrown
	@Test
	public void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> {
			calculator.divide(10, 0);
		});
	}

	// Optional: Test case for valid division
	@Test
	public void testDivide() {
		assertEquals(5, calculator.divide(10, 2));
	}
}
