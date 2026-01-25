package regex.extractlinksfromwebpage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {

	public static void extractLinks(String text) {
		// Condition for valid links:
		// 1. must start with http:// or https://
		// 2. followed by domain name and optional path

		String regex = "https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}[^\\s]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		boolean found = false;
		while (matcher.find()) {
			System.out.print(matcher.group());
			System.out.print(", ");
			found = true;
		}

		if (!found) {
			System.out.println("No links found");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter text:");
		String text = input.nextLine();

		// Extracting links
		extractLinks(text);

		input.close();
	}
}
