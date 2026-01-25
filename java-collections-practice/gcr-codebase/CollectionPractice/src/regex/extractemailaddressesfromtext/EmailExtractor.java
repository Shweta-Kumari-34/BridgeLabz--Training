package regex.extractemailaddressesfromtext;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {

	public static void extractEmails(String text) {
		// Condition for valid Email Address:
		// 1. username can contain letters, numbers, dots, underscores
		// 2. must contain @
		// 3. domain name followed by . and domain extension

		String regex = "[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		boolean found = false;
		while (matcher.find()) {
			System.out.println(matcher.group());
			found = true;
		}

		if (!found) {
			System.out.println("No email addresses found");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter text:");
		String text = input.nextLine();

		// Extracting email addresses
		extractEmails(text);

		input.close();
	}
}
