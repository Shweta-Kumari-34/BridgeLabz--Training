package com.linkedlist.singlylinkedlist.inventory_management_system;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

        InventoryManagement inv = new InventoryManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Position");
            System.out.println("4. Remove Item by ID");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search by ID");
            System.out.println("7. Search by Name");
            System.out.println("8. Display All Items");
            System.out.println("9. Total Inventory Value");
            System.out.println("10. Sort by Name");
            System.out.println("11. Sort by Price");
            System.out.println("12. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.print("Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    if (choice == 1)
                        inv.addAtBeginning(id, name, qty, price);
                    else if (choice == 2)
                        inv.addAtEnd(id, name, qty, price);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        inv.addAtPosition(id, name, qty, price, pos);
                    }
                    break;

                case 4:
                    System.out.print("Enter Item ID: ");
                    inv.removeById(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Item ID: ");
                    int uid = sc.nextInt();
                    System.out.print("New Quantity: ");
                    int nq = sc.nextInt();
                    inv.updateQuantity(uid, nq);
                    break;

                case 6:
                    System.out.print("Item ID: ");
                    inv.searchById(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Item Name: ");
                    inv.searchByName(sc.nextLine());
                    break;

                case 8:
                    inv.displayAll();
                    break;

                case 9:
                    inv.calculateTotalValue();
                    break;

                case 10:
                    System.out.print("1-Ascending 2-Descending: ");
                    inv.sortByName(sc.nextInt() == 1);
                    break;

                case 11:
                    System.out.print("1-Ascending 2-Descending: ");
                    inv.sortByPrice(sc.nextInt() == 1);
                    break;

                case 12:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 12);

        sc.close();
    }
}

