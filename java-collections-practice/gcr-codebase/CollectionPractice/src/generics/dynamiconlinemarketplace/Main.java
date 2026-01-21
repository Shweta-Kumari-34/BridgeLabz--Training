/*
 * Build a generic product catalog for an online marketplace that supports various product types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.

 */
package generics.dynamiconlinemarketplace;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Categories<BookCategory> bookCategories = new Categories<>();
		Categories<ClothingCategory> clothingCategories = new Categories<>();
		Categories<GadgetsCategory> gadgetsCategories = new Categories<>();
		boolean running = true;
		System.out.println("Welcome To 3"
				+ "Dynamic Online MarketplaceApp");
		while (running) {
			System.out.println("Select the choice");
			System.out.println("1: AddItem");
			System.out.println("2: ApplyDiscounts");
			System.out.println("3: DisplayItem");

			System.out.println("4: Exit");
			System.out.println("Enter the choice");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Select the categories");
				System.out.println("1: BookCategories");
				System.out.println("2: ClothingCategories");
				System.out.println("3: GadggetsCategories");
				int whichCategory = input.nextInt();
				if (whichCategory == 1) {
					System.out.println("please enter category name");
					String bname = input.next();
					System.out.println("please enter price");
					int bprice = input.nextInt();
					System.out.println("please enter book title");
					String title = input.next();
					bookCategories.addItem(new BookCategory(bname, bprice, title));
				} else if (whichCategory == 2) {
					System.out.println("please enter category name");
					String cname = input.next();
					System.out.println("please enter price");
					int cprice = input.nextInt();
					System.out.println("please enter cloth fabric");
					String fabric = input.next();
					clothingCategories.addItem(new ClothingCategory(cname, cprice, fabric));
				} else {
					System.out.println("please enter category name");
					String cname = input.next();
					System.out.println("please enter price");
					int cprice = input.nextInt();
					System.out.println("please enter brand name");
					String brandName = input.next();
					gadgetsCategories.addItem(new GadgetsCategory(cname, cprice, brandName));
				}
				break;

			case 2:
				System.out.println("Select the categories");
				System.out.println("1: BookCategories");
				System.out.println("2: ClothingCategories");
				System.out.println("3: GadggetsCategories");
				int category = input.nextInt();
				if (category == 1) {
					System.out.println("Enter the discount %");
					int discount = input.nextInt();

					bookCategories.applyDiscount(discount);

				} else if (category == 2) {
					System.out.println("Enter the discount %");
					int discount = input.nextInt();
					bookCategories.applyDiscount(discount);
				}

				else {
					System.out.println("Enter the discount %");
					int discount = input.nextInt();
					bookCategories.applyDiscount(discount);
				}
				break;

			case 3:
				System.out.println("Select the categories");
				System.out.println("1: BookCategories");
				System.out.println("2: ClothingCategories");
				System.out.println("3: GadggetsCategories");
				System.out.println("Enter the choice");
				int display = input.nextInt();
				if (display == 1) {

					ProductUtil.displayItems(bookCategories.getAllItems());

				} else if (display == 2) {
					ProductUtil.displayItems(clothingCategories.getAllItems());
				}

				else {
					ProductUtil.displayItems(gadgetsCategories.getAllItems());
				}
				break;

			case 4:
				running = false;
				break;
			default:
				System.out.println("invalid input");

			}

		}
	}
}
