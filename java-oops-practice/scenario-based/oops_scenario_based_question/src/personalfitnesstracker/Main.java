package personalfitnesstracker;
import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        boolean running = true;
	        UserProfile user = null;

	        while (running) {
	            System.out.println("\n--------------------------------");
	            System.out.println(" FitTrack - Fitness Tracker ");
	            System.out.println("1. Create User Profile");
	            System.out.println("2. Start Cardio Workout");
	            System.out.println("3. Start Strength Workout");
	            System.out.println("4. Show User Profile");
	            System.out.println("5. Show Daily Progress");
	            System.out.println("6. Exit");
	            System.out.println("--------------------------------");

	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            switch (choice) {

	                case 1:
	                    sc.nextLine();
	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter Age: ");
	                    int age = sc.nextInt();
	                    System.out.print("Enter Weight: ");
	                    double weight = sc.nextDouble();
	                    sc.nextLine();
	                    System.out.print("Enter Fitness Goal: ");
	                    String goal = sc.nextLine();

	                    user = new UserProfile(name, age, weight, goal);
	                    System.out.println("User profile created successfully.");
	                    break;

	                case 2:
	                    if (user == null) {
	                        System.out.println("Create user profile first.");
	                        break;
	                    }
	                    System.out.print("Enter Cardio Duration (minutes): ");
	                    int cd = sc.nextInt();

	                    Workout cardio = new CardioWorkout(cd);
	                    cardio.startWorkout();
	                    int cCalories = cardio.calculateCalories();
	                    cardio.stopWorkout();

	                    user.addCalories(cCalories);
	                    System.out.println("Calories Burned: " + cCalories);
	                    break;

	                case 3:
	                    if (user == null) {
	                        System.out.println("Create user profile first.");
	                        break;
	                    }
	                    System.out.print("Enter Strength Duration (minutes): ");
	                    int sd = sc.nextInt();

	                    Workout strength = new StrengthWorkout(sd);
	                    strength.startWorkout();
	                    int sCalories = strength.calculateCalories();
	                    strength.stopWorkout();

	                    user.addCalories(sCalories);
	                    System.out.println("Calories Burned: " + sCalories);
	                    break;

	                case 4:
	                    if (user != null)
	                        user.printProfile();
	                    else
	                        System.out.println("No user profile found.");
	                    break;

	                case 5:
	                    if (user != null)
	                        user.showProgress();
	                    else
	                        System.out.println("No user profile found.");
	                    break;

	                case 6:
	                    running = false;
	                    System.out.println("FitTrack Closed. Stay Healthy! 💪");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }

	        sc.close();
	    }
	}


