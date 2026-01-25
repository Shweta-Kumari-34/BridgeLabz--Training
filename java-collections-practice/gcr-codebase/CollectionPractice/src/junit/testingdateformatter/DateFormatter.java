package junit.testingdateformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	// converts a date from "yyyy-MM-dd" to "dd-MM-yyyy"
	public String formatDate(String inputDate) throws ParseException {
		if (inputDate == null) {
			throw new IllegalArgumentException("Input date cannot be null");
		}

		// define input and output date formats
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

		// parse the input date
		Date date = inputFormat.parse(inputDate);

		// return formatted date
		return outputFormat.format(date);
	}
}
