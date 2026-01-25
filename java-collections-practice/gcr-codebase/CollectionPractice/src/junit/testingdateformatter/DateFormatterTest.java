package junit.testingdateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class DateFormatterTest {
	DateFormatter formatter = new DateFormatter();

	// test valid date formatting
	@Test
	void testValidDate() throws ParseException {
		String input = "2026-01-25";
		String expected = "25-01-2026";
		assertEquals(expected, formatter.formatDate(input));
	}

	// test another valid date
	@Test
	void testAnotherValidDate() throws ParseException {
		String input = "1999-12-31";
		String expected = "31-12-1999";
		assertEquals(expected, formatter.formatDate(input));
	}

	// test invalid date format
	@Test
	void testInvalidDateFormat() {
		String input = "25-01-2026"; // wrong format

		assertThrows(ParseException.class, () -> {
			formatter.formatDate(input);
		});
	}

	// test null input
	@Test
	void testNullDate() {
		assertThrows(IllegalArgumentException.class, () -> {
			formatter.formatDate(null);
		});
	}

	// test invalid date value
	@Test
	void testInvalidDateValue() {
		String input = "2026-13-01"; // invalid month

		assertThrows(ParseException.class, () -> {
			formatter.formatDate(input);
		});
	}
}
