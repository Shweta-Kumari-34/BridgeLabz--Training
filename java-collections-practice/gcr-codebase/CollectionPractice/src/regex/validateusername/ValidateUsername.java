package regex.validateusername;

import java.util.Scanner;

public class ValidateUsername {

	public static boolean isValidUsername(String username) {
		// Condition for valid Username is:
		// 1. must start with a letter
		// 2. allowed characters (a-z, A-Z),(0-9) and (_)
		// 3. must be 5 to 15 characters long

		String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		return username.matches(regex);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        //Taking user input
		System.out.println("Enter username:");
		String username = input.next();

        //Checking Validation
		if (isValidUsername(username)) {
			System.out.println("Valid Username");
		} else {
			System.out.println("Invalid Username");
		}

		input.close();
	}
}
