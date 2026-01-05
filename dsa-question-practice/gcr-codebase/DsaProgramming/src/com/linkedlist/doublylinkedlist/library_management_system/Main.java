package com.linkedlist.doublylinkedlist.library_management_system;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

        LibraryManagement lib = new LibraryManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Add Book at Position");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Search by Title");
            System.out.println("6. Search by Author");
            System.out.println("7. Update Availability Status");
            System.out.println("8. Display Books (Forward)");
            System.out.println("9. Display Books (Reverse)");
            System.out.println("10. Count Total Books");
            System.out.println("11. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();
                    System.out.print("Available (true/false): ");
                    boolean status = sc.nextBoolean();

                    if (choice == 1)
                        lib.addAtBeginning(id, title, author, genre, status);
                    else if (choice == 2)
                        lib.addAtEnd(id, title, author, genre, status);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        lib.addAtPosition(id, title, author, genre, status, pos);
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    lib.removeById(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Title: ");
                    lib.searchByTitle(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Enter Author: ");
                    lib.searchByAuthor(sc.nextLine());
                    break;

                case 7:
                    System.out.print("Book ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Available (true/false): ");
                    boolean st = sc.nextBoolean();
                    lib.updateStatus(bid, st);
                    break;

                case 8:
                    lib.displayForward();
                    break;

                case 9:
                    lib.displayReverse();
                    break;

                case 10:
                    lib.countBooks();
                    break;

                case 11:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 11);

        sc.close();
    }
}

