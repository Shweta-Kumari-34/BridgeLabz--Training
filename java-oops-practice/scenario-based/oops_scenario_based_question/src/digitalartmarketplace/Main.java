package digitalartmarketplace;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IPurchasable art = null;

		double price;
		System.out.println("\n==================================");
		System.out.println(" Please Select The Art Type you wnat to sell ");
		System.out.println("1. DigitalArt");
		System.out.println("2. PrintArt");
		System.out.println("===================================");
		System.out.println(" Enter choice ");
		int choice = input.nextInt();
		if (choice == 1) {

			System.out.println("------------------------------------");
			System.out.println("please select the requirement");
			System.out.println("1. Purchase");
			System.out.println("2. License");
			System.out.println("3. Subscribe");
			System.out.println("------------------------------------");
			System.out.println(" Enter  requirement choice ");
			int requirement = input.nextInt();

			if (requirement == 1) {
				price = DigitalArt.getPrice();

				System.out.println("Succesfully purchased art of price " + price);

				User.updateBalance(price);

				System.out.println("The updated walletBalance is:" + User.getWalletBalance());
				System.out.println("Thank You Visit Again !!");
			} else if (requirement == 2) {
				price = DigitalArt.getLicenseAmt();

				System.out.println("the price is " + price);

				User.updateBalance(price);
				System.out.println("Thank You Visit Again !!");

			} else {
				price = DigitalArt.getSubscribePrice();

				System.out.println("the price is " + price);

				User.updateBalance(price);
				System.out.println("Thank You Visit Again !!");
			}

		}

		else {
			System.out.println("------------------------------------");
			System.out.println("please select the requirement");
			System.out.println("1. Purchase");
			System.out.println("2. License");
			System.out.println("3. Subscribe");
			System.out.println("------------------------------------");
			System.out.println(" Enter  requirement choice ");
			int requirement = input.nextInt();

			if (requirement == 1) {
				price = PrintArt.getPrice();
				System.out.println("the price is " + price);

				User.updateBalance(price);
				System.out.println("Thank You Visit Again !!");
			} else if (requirement == 2) {
				price = PrintArt.getLicenseAmt();

				System.out.println("the price is " + price);

				User.updateBalance(price);
				System.out.println("Thank You Visit Again !!");

			} else {
				price = PrintArt.getSubscribePrice();

				System.out.println("the price is " + price);

				User.updateBalance(price);
				System.out.println("Thank You Visit Again !!");
			}

		}

	}
}
