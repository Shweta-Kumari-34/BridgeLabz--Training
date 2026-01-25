package regex.validatehexcolorcode;

import java.util.Scanner;

public class HexColorCodeValidatation {

	public static boolean isValidHexColor(String colorCode) {
		// Condition for valid Hex Color Code:
		// 1. must start with #
		// 2. followed by exactly 6 hexadecimal characters (0-9, A-F, a-f)

		String regex = "^#[a-fA-F0-9]{6}$";
		return colorCode.matches(regex);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter hex color code:");
		String colorCode = input.next();

		// Checking validation
		if (isValidHexColor(colorCode)) {
			System.out.println("Valid Hex Color Code");
		} else {
			System.out.println("Invalid Hex Color Code");
		}

		input.close();
	}
}
