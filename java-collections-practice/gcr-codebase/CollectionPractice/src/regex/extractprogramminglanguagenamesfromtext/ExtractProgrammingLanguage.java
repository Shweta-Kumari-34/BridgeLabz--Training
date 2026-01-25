package regex.extractprogramminglanguagenamesfromtext;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {

	public static void extractLanguages(String text) {
		// Condition:
		// 1. extract common programming language names from text

		String regex = "\\b(Java|Python|JavaScript|Go|C|C\\+\\+|C#|Ruby|PHP|Swift|Kotlin)\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		boolean found = false;
		while (matcher.find()) {
			System.out.print(matcher.group());
			System.out.print(", ");
			found = true;
		}

		if (!found) {
			System.out.println("No programming languages found");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter text:");
		String text = input.nextLine();

		// Extracting programming language names
		extractLanguages(text);

		input.close();
	}
}
