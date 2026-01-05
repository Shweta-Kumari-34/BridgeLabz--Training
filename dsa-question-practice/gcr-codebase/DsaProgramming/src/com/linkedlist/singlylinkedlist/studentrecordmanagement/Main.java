package com.linkedlist.singlylinkedlist.studentrecordmanagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        StudentRecord list = new StudentRecord();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Roll Number: ");
                    int r1 = input.nextInt();
                    input.nextLine();
                    System.out.print("Name: ");
                    String n1 = input.nextLine();
                    System.out.print("Age: ");
                    int a1 = input.nextInt();
                    System.out.print("Grade: ");
                    char g1 = input.next().charAt(0);
                    list.addAtBeginning(r1, n1, a1, g1);
                    break;

                case 2:
                    System.out.print("Roll Number: ");
                    int r2 = input.nextInt();
                    input.nextLine();
                    System.out.print("Name: ");
                    String n2 = input.nextLine();
                    System.out.print("Age: ");
                    int a2 = input.nextInt();
                    System.out.print("Grade: ");
                    char g2 = input.next().charAt(0);
                    list.addAtEnd(r2, n2, a2, g2);
                    break;

                case 3:
                    System.out.print("Roll Number: ");
                    int r3 = input.nextInt();
                    input.nextLine();
                    System.out.print("Name: ");
                    String n3 = input.nextLine();
                    System.out.print("Age: ");
                    int a3 = input.nextInt();
                    System.out.print("Grade: ");
                    char g3 = input.next().charAt(0);
                    System.out.print("Position: ");
                    int pos = input.nextInt();
                    list.addAtPosition(r3, n3, a3, g3, pos);
                    break;

                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    list.deleteByRollNumber(input.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Roll Number to search: ");
                    list.searchByRollNumber(input.nextInt());
                    break;

                case 6:
                    System.out.print("Enter Roll Number: ");
                    int r = input.nextInt();
                    System.out.print("Enter new Grade: ");
                    char g = input.next().charAt(0);
                    list.updateGrade(r, g);
                    break;

                case 7:
                    list.displayAll();
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 8);

        input.close();
    }
}


