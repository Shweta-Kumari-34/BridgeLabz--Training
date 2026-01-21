package generics.mealplangeneratorapp;

public class VegetarianMeal implements MealPlan {

	private int calories;

	public VegetarianMeal(int calories) {
		this.calories = calories;
	}

	@Override
	public String getMealType() {
		return "Vegetarian";
	}

	@Override
	public int getCalories() {
		return calories;
	}
}
