package bagnballorganizer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Bag> bags = new ArrayList<>();

        boolean running = true;

        while (running) {
            System.out.println("\n========= Bag-n-Ball Organizer =========");
            System.out.println("1. Add Bag");
            System.out.println("2. Add Ball to Bag");
            System.out.println("3. Remove Ball from Bag");
            System.out.println("4. Display All Bags");
            System.out.println("5. Display Balls in a Bag");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Bag ID: ");
                    int bagId = input.nextInt();
                    System.out.print("Enter Bag Color: ");
                    String bagColor = input.next();
                    System.out.print("Enter Bag Capacity: ");
                    int capacity = input.nextInt();

                    bags.add(new Bag(bagId, bagColor, capacity));
                    System.out.println("Bag added successfully");
                    break;

                case 2:
                    System.out.print("Enter Bag ID: ");
                    int targetBagId = input.nextInt();

                    Bag targetBag = findBag(bags, targetBagId);
                    if (targetBag == null) {
                        System.out.println("Bag not found");
                        break;
                    }

                    System.out.print("Enter Ball ID: ");
                    int ballId = input.nextInt();
                    System.out.print("Enter Ball Color: ");
                    String ballColor = input.next();
                    System.out.print("Enter Ball Size (small/medium/large): ");
                    String size = input.next();

                    targetBag.addBall(new Ball(ballId, ballColor, size));
                    break;

                case 3:
                    System.out.print("Enter Bag ID: ");
                    int bId = input.nextInt();
                    Bag bag = findBag(bags, bId);

                    if (bag == null) {
                        System.out.println("Bag not found");
                        break;
                    }

                    System.out.print("Enter Ball ID to remove: ");
                    int removeBallId = input.nextInt();
                    bag.removeBall(removeBallId);
                    break;

                case 4:
                    System.out.println("All Bags:");
                    for (Bag b : bags) {
                        b.displayInfo();
                    }
                    break;

                case 5:
                    System.out.print("Enter Bag ID: ");
                    int displayBagId = input.nextInt();
                    Bag displayBag = findBag(bags, displayBagId);

                    if (displayBag != null) {
                        displayBag.displayBalls();
                    } else {
                        System.out.println("Bag not found");
                    }
                    break;

                case 6:
                    running = false;
                    System.out.println("Thank you for using Bag-n-Ball Organizer");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static Bag findBag(ArrayList<Bag> bags, int id) {
        for (Bag b : bags) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
}
