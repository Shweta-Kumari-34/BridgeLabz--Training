package virtualpetcareapp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet pet = null;

        System.out.println("=== Welcome to PetPal ===");
        System.out.print("Enter Pet Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Pet Age: ");
        int age = sc.nextInt();
        System.out.println("Choose Pet Type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                pet = new Dog(name, age);
                break;
            case 2:
                pet = new Cat(name, age);
                break;
            case 3:
                pet = new Bird(name, age);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        int option;
        do {
            System.out.println("\n--- Pet Interaction Menu ---");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Make Sound");
            System.out.println("5. Show Status");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.play();
                    break;
                case 3:
                    pet.sleep();
                    break;
                case 4:
                    pet.makeSound();
                    break;
                case 5:
                    pet.showStatus();
                    break;
                case 6:
                    System.out.println("Goodbye! Take care of your pet.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (option != 6);

        sc.close();
    }
}
