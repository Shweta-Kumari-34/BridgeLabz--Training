package swiftcart;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();
		boolean running = true;

		while (running) {

			System.out.println("\n--------------------------------");
			System.out.println(" SwiftCart Grocery App ");
			System.out.println("1. Add Perishable Product");
			System.out.println("2. Add Non-Perishable Product");
			System.out.println("3. Checkout");
			System.out.println("4. Exit");
			System.out.println("--------------------------------");

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter Product Name: ");
				String pname1 = sc.nextLine();
				System.out.print("Enter Price: ");
				double price1 = sc.nextDouble();
				System.out.print("Enter Quantity: ");
				int qty1 = sc.nextInt();

				Product p1 = new PerishableProduct(pname1, price1);
				cart.addProduct(p1, qty1);
				System.out.println("Perishable product added");
				break;

			case 2:
				System.out.print("Enter Product Name: ");
				String pname2 = sc.nextLine();
				System.out.print("Enter Price: ");
				double price2 = sc.nextDouble();
				System.out.print("Enter Quantity: ");
				int qty2 = sc.nextInt();

				Product p2 = new NonPerishableProduct(pname2, price2);
				cart.addProduct(p2, qty2);
				System.out.println("Non-perishable product added");
				break;

			case 3:
				cart.applyDiscount();
				cart.generateBill();
				break;

			case 4:
				running = false;
				System.out.println("Thank you for using SwiftCart!");
				break;

			default:
				System.out.println("Invalid choice");
			}
		}

		sc.close();
	}
}
