package regex.validateipaddress;

import java.util.Scanner;

public class ValidateIPAddress {

	public static boolean isValidIPAddress(String ipAddress) {
		// Condition for valid IPv4 Address:
		// 1. consists of four groups separated by dots
		// 2. each group must be between 0 and 255

		String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}"
				+ "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

		return ipAddress.matches(regex);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Taking user input
		System.out.println("Enter IP address:");
		String ipAddress = input.next();

		// Checking validation
		if (isValidIPAddress(ipAddress)) {
			System.out.println("Valid IP Address");
		} else {
			System.out.println("Invalid IP Address");
		}

		input.close();
	}
}
