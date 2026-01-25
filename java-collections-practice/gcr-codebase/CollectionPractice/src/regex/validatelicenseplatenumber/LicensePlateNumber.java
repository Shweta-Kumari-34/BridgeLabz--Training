package regex.validatelicenseplatenumber;
import java.util.Scanner;
public class LicensePlateNumber {


		public static boolean isValidLicensePlate(String plateNumber) {
			// Condition for valid License Plate:
			// 1. must start with two uppercase letters (A-Z)
			// 2. followed by four digits (0-9)

			String regex = "^[A-Z]{2}[0-9]{4}$";
			return plateNumber.matches(regex);
		}

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

	        // Taking user input
			System.out.println("Enter license plate number:");
			String plateNumber = input.next();

	        // Checking validation
			if (isValidLicensePlate(plateNumber)) {
				System.out.println("Valid License Plate");
			} else {
				System.out.println("Invalid License Plate");
			}

			input.close();
		}
	}

