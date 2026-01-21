package generics.mealplangeneratorapp;


public class HighProteinMeal implements MealPlan {

    private int calories;

    public HighProteinMeal(int calories) {
        this.calories = calories;
    }

    @Override
    public String getMealType() {
        return "High Protein";
    }

    @Override
    public int getCalories() {
        return calories;
    }
}

