package regex.extractdates;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {

	public static void extractDates(String text) {
		// Condition for valid date format:
		// 1. day must be two digits (01–31)
		// 2. month must be two digits (01–12)
		// 3. year must be four digits

		String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		boolean found = false;
		while (matcher.find()) {
			System.out.print(matcher.group());
			System.out.print(", ");
			found = true;
		}

		if (!found) {
			System.out.println("No dates found");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter text:");
		String text = input.nextLine();

		// Extracting dates
		extractDates(text);

		input.close();
	}
}
