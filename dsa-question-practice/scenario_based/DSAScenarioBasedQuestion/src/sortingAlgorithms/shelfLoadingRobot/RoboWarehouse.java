package sortingAlgorithms.shelfLoadingRobot;

import java.util.Scanner;

public class RoboWarehouse {

    public static void insertionSort(String[] books, int n) {

        for (int i = 1; i < n; i++) {
            String current = books[i];
            int prev = i - 1;

            while (prev >= 0 && books[prev].compareToIgnoreCase(current) > 0) {
                books[prev + 1] = books[prev];
                prev--;
            }

            books[prev + 1] = current;
        }
    }

    public static void printSortedBookList(String[] books) {
        System.out.println("\n📚 Sorted Book List (Alphabetical Order):");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("====Welcome to SmartShelf====");
        System.out.print("Enter the number of books: ");
        int number = input.nextInt();
        input.nextLine(); 

        String[] books = new String[number];

        System.out.println("Please enter the book titles:");
        for (int i = 0; i < number; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            books[i] = input.nextLine();  
        }

        insertionSort(books, number);
        printSortedBookList(books);
    }
}

