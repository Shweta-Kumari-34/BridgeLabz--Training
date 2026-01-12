
package restaurant_ordering_system;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Order order = new Order();

		boolean running = true;
		while (running) {
			System.out.println("\n==================================");
			System.out.println(" Welcome to FoodLoop ");
			System.out.println("1. Place Order");
			System.out.println("2. Cancel Order");
			System.out.println("3. Exit");
			System.out.println("===================================");
			System.out.print("Enter choice: ");
			int status = input.nextInt();

			switch (status) {
			case 1:
				System.out.println("Select Food Type:");
				System.out.println("1. Veg");
				System.out.println("2. Non-Veg");
				int choice = input.nextInt();

				if (choice == 1) {
					VegItem veg = new VegItem("dummy", 0);
					veg.printVegDish();
					System.out.print("Enter dish number: ");
					int dish = input.nextInt();
					System.out.print("Enter quantity: ");
					int qty = input.nextInt();

					order.addItem(new VegItem(VegItem.getDishName(dish), VegItem.getPrice(dish)), qty);
					System.out.println("Total bill generated after discount  is "+VegItem.getBill(qty));

				} else if (choice == 2) {
					NonVegItem nonVeg = new NonVegItem("dummy", 0);
					nonVeg.printNonVegDish();
					System.out.print("Enter dish number: ");
					int dish = input.nextInt();
					System.out.print("Enter quantity: ");
					int qty = input.nextInt();

					order.addItem(new NonVegItem(NonVegItem.getDishName(dish), NonVegItem.getPrice(dish)), qty);
					System.out.println("Total bill generated after discount  is "+NonVegItem.getBill(qty));
				}
				break;

			case 2:
				order.cancelOrder();
				break;

			case 3:
				running = false;
				System.out.println("Thanks for visiting FoodLoop!");
				break;

			default:
				System.out.println("Invalid choice, try again.");
			}
		}
		input.close();
	}
}
