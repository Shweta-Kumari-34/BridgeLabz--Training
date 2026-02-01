package com.functionalinterfaces.dateformat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// interface with static utility method
public interface DateUtils {

	// static method to format date
	static String formatDate(LocalDate date, String pattern) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

		return date.format(formatter);
	}
}
