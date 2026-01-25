package regex.validatesocialsecuritynumber;

import java.util.Scanner;

public class ValidateSSN {

	public static boolean isValidSSN(String ssn) {
		// Condition for valid SSN:
		// 1. Format must be XXX-XX-XXXX
		// 2. Only digits allowed
		// 3. Hyphens must be in correct positions

		String regex = "^\\d{3}-\\d{2}-\\d{4}$";
		return ssn.matches(regex);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter SSN:");
		String ssn = input.next();

		// Checking validation
		if (isValidSSN(ssn)) {
			System.out.println(ssn + " is valid");
		} else {
			System.out.println(ssn + " is invalid");
		}

		input.close();
	}
}
