package regex.extractcurrencyvaluesfromtext;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {

	public static void extractCurrencyValues(String text) {
		// Condition:
		// 1. currency value may start with $ (optional)
		// 2. followed by digits
		// 3. optional decimal part

		String regex = "\\$?\\d+(\\.\\d{1,2})?";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		boolean found = false;
		while (matcher.find()) {
			System.out.print(matcher.group());
			System.out.print(", ");
			found = true;
		}

		if (!found) {
			System.out.println("No currency values found");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter text:");
		String text = input.nextLine();

		// Extracting currency values
		extractCurrencyValues(text);

		input.close();
	}
}
