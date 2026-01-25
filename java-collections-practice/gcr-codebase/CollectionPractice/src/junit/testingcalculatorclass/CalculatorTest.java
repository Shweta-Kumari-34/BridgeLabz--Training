package junit.testingcalculatorclass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	// Creating object of Calculator class
	Calculator calculator = new Calculator();

	// Test case for add() method
	@Test
	public void testAdd() {
		assertEquals(10, calculator.add(5, 5));
	}

	// Test case for subtract() method
	@Test
	public void testSubtract() {
		assertEquals(2, calculator.subtract(5, 3));
	}

	// Test case for multiply() method
	@Test
	public void testMultiply() {
		assertEquals(15, calculator.multiply(5, 3));
	}

	// Test case for divide() method
	@Test
	public void testDivide() {
		assertEquals(5, calculator.divide(10, 2));
	}

	// Bonus: Test case for division by zero
	@Test
	public void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> {
			calculator.divide(10, 0);
		});
	}
}
