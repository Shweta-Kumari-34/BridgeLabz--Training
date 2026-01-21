package generics.mealplangeneratorapp;

public class Meal<T extends MealPlan> {

	private T meal;

	public Meal(T meal) {
		this.meal = meal;
	}

	public T getMeal() {
		return meal;
	}

	public void displayMeal() {
		System.out.println("Meal Type: " + meal.getMealType() + ", Calories: " + meal.getCalories());
	}
}
