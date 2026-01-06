package edumentorpersonalizedlearningplatform;
import java.util.Scanner;

public class Main {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("=== EduMentor Platform ===");
	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Email: ");
	        String email = sc.nextLine();
	        System.out.print("Enter User ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Course Type (short/fulltime): ");
	        String courseType = sc.nextLine();
	        Learner learner = new Learner(name, email, id, courseType);

	        int choice;
	        do {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1. Take Quiz");
	            System.out.println("2. View Profile");
	            System.out.println("3. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("Select Difficulty (easy/hard): ");
	                    String level = sc.nextLine();

	                    Quiz quiz = new Quiz(level);
	                    System.out.println("\nQuiz Started...");
	                    quiz.startQuiz(sc);

	                    double percentage = quiz.calculatePercentage();
	                    learner.generateCertificate(percentage);
	                    break;

	                case 2:
	                    learner.displayUser();
	                    break;

	                case 3:
	                    System.out.println("Thank you for using EduMentor!");
	                    break;

	                default:
	                    System.out.println("Invalid choice");
	            }
	        } while (choice != 3);

	        sc.close();
	    }
	}

	  