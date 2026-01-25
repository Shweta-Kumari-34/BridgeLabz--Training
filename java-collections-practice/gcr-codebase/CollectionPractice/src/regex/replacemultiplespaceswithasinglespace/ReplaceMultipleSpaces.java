package regex.replacemultiplespaceswithasinglespace;

import java.util.Scanner;

public class ReplaceMultipleSpaces {

	public static String replaceSpaces(String text) {
		// Condition:
		// 1. replace two or more spaces with a single space

		String regex = "\\s+";
		return text.replaceAll(regex, " ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter text:");
		String text = input.nextLine();

		// Replacing multiple spaces with single space
		String result = replaceSpaces(text);
		System.out.println(result);

		input.close();
	}
}
