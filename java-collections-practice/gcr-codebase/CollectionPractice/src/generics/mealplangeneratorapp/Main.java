package generics.mealplangeneratorapp;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean running = true;

		System.out.println("Welcome To Personalized Meal Plan Generator");

		while (running) {

			System.out.println("\nSelect the choice");
			System.out.println("1: Generate Meal Plan");
			System.out.println("2: Display Meal Plan");
			System.out.println("3: Exit");

			int choice = input.nextInt();

			Meal<? extends MealPlan> generatedMeal = null;

			switch (choice) {

			case 1:
				System.out.println("Select Meal Category");
				System.out.println("1: Vegetarian");
				System.out.println("2: Vegan");
				System.out.println("3: Keto");
				System.out.println("4: High Protein");

				int type = input.nextInt();

				System.out.println("Enter daily calories");
				int calories = input.nextInt();

				if (type == 1) {
					generatedMeal = MealGenerator.generateMeal(new VegetarianMeal(calories));
				} else if (type == 2) {
					generatedMeal = MealGenerator.generateMeal(new VeganMeal(calories));
				} else if (type == 3) {
					generatedMeal = MealGenerator.generateMeal(new KetoMeal(calories));
				} else {
					generatedMeal = MealGenerator.generateMeal(new HighProteinMeal(calories));
				}

				System.out.println("Meal plan generated successfully");
				break;

			case 2:
				if (generatedMeal != null) {
					generatedMeal.displayMeal();
				} else {
					System.out.println("No meal plan generated yet");
				}
				break;

			case 3:
				running = false;
				System.out.println("Thank you for using Meal Plan Generator");
				break;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
