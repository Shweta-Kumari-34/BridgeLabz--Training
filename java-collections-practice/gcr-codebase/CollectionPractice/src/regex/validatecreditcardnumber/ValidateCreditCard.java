package regex.validatecreditcardnumber;

import java.util.Scanner;

public class ValidateCreditCard {

	public static boolean isValidCreditCard(String cardNumber) {
		// Condition for valid Credit Card Number:
		// 1. Visa card starts with 4 and has 16 digits
		// 2. MasterCard starts with 5 and has 16 digits

		String regex = "^(4[0-9]{15}|5[0-9]{15})$";
		return cardNumber.matches(regex);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter credit card number:");
		String cardNumber = input.next();

		// Checking validation
		if (isValidCreditCard(cardNumber)) {
			System.out.println("Valid Credit Card Number");
		} else {
			System.out.println("Invalid Credit Card Number");
		}

		input.close();
	}
}
