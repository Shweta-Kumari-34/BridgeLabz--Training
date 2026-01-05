package com.linkedlist.doublylinkedlist.movie_management_system;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

	    MovieManagement movieList = new MovieManagement();
	    Scanner sc = new Scanner(System.in);
	    int choice;

	    do {
	        System.out.println("\n--- Movie Management System ---");
	        System.out.println("1. Add Movie at Beginning");
	        System.out.println("2. Add Movie at End");
	        System.out.println("3. Add Movie at Position");
	        System.out.println("4. Remove Movie by Title");
	        System.out.println("5. Search Movie by Director");
	        System.out.println("6. Search Movie by Rating");
	        System.out.println("7. Update Movie Rating");
	        System.out.println("8. Display Movies (Forward)");
	        System.out.println("9. Display Movies (Reverse)");
	        System.out.println("10. Exit");

	        System.out.print("Enter your choice: ");
	        choice = sc.nextInt();
	        sc.nextLine(); 

	        switch (choice) {

	            case 1:
	                System.out.print("Enter Title: ");
	                String t1 = sc.nextLine();
	                System.out.print("Enter Director: ");
	                String d1 = sc.nextLine();
	                System.out.print("Enter Year: ");
	                int y1 = sc.nextInt();
	                System.out.print("Enter Rating: ");
	                double r1 = sc.nextDouble();
	                movieList.addAtBeginning(t1, d1, y1, r1);
	                break;

	            case 2:
	                System.out.print("Enter Title: ");
	                String t2 = sc.nextLine();
	                System.out.print("Enter Director: ");
	                String d2 = sc.nextLine();
	                System.out.print("Enter Year: ");
	                int y2 = sc.nextInt();
	                System.out.print("Enter Rating: ");
	                double r2 = sc.nextDouble();
	                movieList.addAtEnd(t2, d2, y2, r2);
	                break;

	            case 3:
	                System.out.print("Enter Title: ");
	                String t3 = sc.nextLine();
	                System.out.print("Enter Director: ");
	                String d3 = sc.nextLine();
	                System.out.print("Enter Year: ");
	                int y3 = sc.nextInt();
	                System.out.print("Enter Rating: ");
	                double r3 = sc.nextDouble();
	                System.out.print("Enter Position: ");
	                int pos = sc.nextInt();
	                movieList.addAtPosition(t3, d3, y3, r3, pos);
	                break;

	            case 4:
	                System.out.print("Enter Movie Title to Remove: ");
	                movieList.removeByTitle(sc.nextLine());
	                break;

	            case 5:
	                System.out.print("Enter Director Name: ");
	                movieList.searchByDirector(sc.nextLine());
	                break;

	            case 6:
	                System.out.print("Enter Minimum Rating: ");
	                movieList.searchByRating(sc.nextDouble());
	                break;

	            case 7:
	                System.out.print("Enter Movie Title: ");
	                String title = sc.nextLine();
	                System.out.print("Enter New Rating: ");
	                double rating = sc.nextDouble();
	                movieList.updateRating(title, rating);
	                break;

	            case 8:
	                movieList.displayForward();
	                break;

	            case 9:
	                movieList.displayReverse();
	                break;

	            case 10:
	                System.out.println("Program exited successfully");
	                break;

	            default:
	                System.out.println("Invalid choice!");
	        }

	    } while (choice != 10);

	    sc.close();
	}

}
