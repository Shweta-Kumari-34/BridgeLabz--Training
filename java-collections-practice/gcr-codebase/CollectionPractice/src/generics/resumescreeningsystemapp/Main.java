package generics.resumescreeningsystemapp;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean running = true;

		List<JobRole> pipeline = new ArrayList<>();

		System.out.println("Welcome To AI-Driven Resume Screening System");

		while (running) {

			System.out.println("\nSelect the choice");
			System.out.println("1: Add Resume");
			System.out.println("2: Screen All Resumes");
			System.out.println("3: Exit");

			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Select Job Role");
				System.out.println("1: Software Engineer");
				System.out.println("2: Data Scientist");
				System.out.println("3: Product Manager");

				int role = input.nextInt();

				System.out.println("Enter candidate name");
				String name = input.next();

				System.out.println("Enter years of experience");
				int exp = input.nextInt();

				if (role == 1) {
					pipeline.add(new SoftwareEngineer(name, exp));
				} else if (role == 2) {
					pipeline.add(new DataScientist(name, exp));
				} else {
					pipeline.add(new ProductManager(name, exp));
				}

				System.out.println("Resume added to screening pipeline");
				break;

			case 2:
				if (pipeline.isEmpty()) {
					System.out.println("No resumes to screen");
				} else {
					ResumeUtil.screenAll(pipeline);
				}
				break;

			case 3:
				running = false;
				System.out.println("Exiting system");
				break;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
