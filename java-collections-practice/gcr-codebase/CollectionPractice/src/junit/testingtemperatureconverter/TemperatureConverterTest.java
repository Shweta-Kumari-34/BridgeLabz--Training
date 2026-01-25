package junit.testingtemperatureconverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
	TemperatureConverter converter = new TemperatureConverter();

	// test Celsius to Fahrenheit conversion
	@Test
	void testCelsiusToFahrenheit() {
		assertEquals(32, converter.celsiusToFahrenheit(0), 0.001); // freezing point
		assertEquals(212, converter.celsiusToFahrenheit(100), 0.001); // boiling point
		assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.001); // body temperature
	}

	// test Fahrenheit to Celsius conversion
	@Test
	void testFahrenheitToCelsius() {
		assertEquals(0, converter.fahrenheitToCelsius(32), 0.001); // freezing point
		assertEquals(100, converter.fahrenheitToCelsius(212), 0.001); // boiling point
		assertEquals(37, converter.fahrenheitToCelsius(98.6), 0.001); // body temperature
	}

	// test negative temperatures
	@Test
	void testNegativeTemperatures() {
		assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.001); // same value in C and F
		assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.001); // same value in F and C
	}
}
