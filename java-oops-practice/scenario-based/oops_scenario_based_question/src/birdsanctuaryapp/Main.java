package birdsanctuaryapp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sanctuary sanctuary = new Sanctuary();
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Delete Bird by ID");
            System.out.println("6. Sanctuary Report");
            System.out.println("7. Show Developer Info");
            System.out.println("8. Exit");
            System.out.print("Choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Eagle  2. Duck  3. Penguin  4. Kiwi");
                    int type = input.nextInt();
                    System.out.print("Enter ID: ");
                    int id = input.nextInt();
                    System.out.print("Enter Name: ");
                    String name = input.next();

                    switch (type) {
                        case 1 -> sanctuary.addBird(new Eagle(id, name));
                        case 2 -> sanctuary.addBird(new Duck(id, name));
                        case 3 -> sanctuary.addBird(new Penguin(id, name));
                        case 4 -> sanctuary.addBird(new Kiwi(id, name));
                    }
                    break;

                case 2: sanctuary.displayAllBirds();
                case 3:sanctuary.displayFlyingBirds();
                case 4:sanctuary.displaySwimmingBirds();
                case 5: {
                    System.out.print("Enter Bird ID: ");
                    sanctuary.removeBirdById(input.nextInt());
                }
                case 6: sanctuary.sanctuaryReport();
                case 7: sanctuary.showDeveloperInfo();
                case 8:running = false;
                default: System.out.println("Invalid choice");
            }
        }
       input.close();
    }
}
