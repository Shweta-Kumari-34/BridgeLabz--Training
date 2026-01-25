package regex.extractallcapitalizedwordsfromsentence;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {

	public static void extractCapitalWords(String sentence) {
		// Condition for capitalized words:
		// 1. word must start with a capital letter (A-Z)
		// 2. remaining characters must be lowercase letters (a-z)

		String regex = "\\b[A-Z][a-z]*\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sentence);

		boolean found = false;
		while (matcher.find()) {
			System.out.print(matcher.group());
			System.out.print(", ");
			found = true;
		}

		if (!found) {
			System.out.println("No capitalized words found");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter sentence:");
		String sentence = input.nextLine();

		// Extracting capitalized words
		extractCapitalWords(sentence);

		input.close();
	}
}
