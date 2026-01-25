package regex.findrepeatingwordsinsentence;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {

	public static void findRepeatingWords(String sentence) {
		// Condition:
		// 1. find words that are repeated consecutively
		// 2. case-insensitive

		String regex = "\\b(\\w+)\\s+\\1\\b";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(sentence);

		boolean found = false;
		while (matcher.find()) {
			System.out.print(matcher.group(1));
			System.out.print(", ");
			found = true;
		}

		if (!found) {
			System.out.println("No repeating words found");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter sentence:");
		String sentence = input.nextLine();

		// Finding repeating words
		findRepeatingWords(sentence);

		input.close();
	}
}
