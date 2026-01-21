package generics.mealplangeneratorapp;

public class MealGenerator {

	public static <T extends MealPlan> Meal<T> generateMeal(T meal) {

		if (meal.getCalories() <= 0) {
			throw new IllegalArgumentException("Calories must be greater than zero");
		}

		return new Meal<>(meal);
	}
}
