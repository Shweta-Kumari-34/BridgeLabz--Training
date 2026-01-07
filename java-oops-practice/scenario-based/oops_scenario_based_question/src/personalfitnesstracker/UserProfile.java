package personalfitnesstracker;

public class UserProfile {

	private String name;
	private int age;
	private double weight;
	private String goal;

	private int dailyTarget;
	private int totalCaloriesBurned;

	public UserProfile(String name, int age, double weight) {
		this(name, age, weight, "Stay Fit");
	}

	public UserProfile(String name, int age, double weight, String goal) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.goal = goal;
		this.dailyTarget = (int) (weight * 30); // operator usage
		this.totalCaloriesBurned = 0;
	}

	public void addCalories(int calories) {
		totalCaloriesBurned += calories;
	}

	public void showProgress() {
		System.out.println("\n--- Daily Progress ---");
		System.out.println("Goal: " + goal);
		System.out.println("Daily Target: " + dailyTarget);
		System.out.println("Calories Burned: " + totalCaloriesBurned);
		System.out.println("Remaining Calories: " + (dailyTarget - totalCaloriesBurned));
	}

	public void printProfile() {
		System.out.println("\n--- User Profile ---");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Goal: " + goal);
	}
}
