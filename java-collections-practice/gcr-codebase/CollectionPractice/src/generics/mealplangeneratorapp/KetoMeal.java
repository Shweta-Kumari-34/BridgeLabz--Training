package generics.mealplangeneratorapp;


public class KetoMeal implements MealPlan {

    private int calories;

    public KetoMeal(int calories) {
        this.calories = calories;
    }

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public int getCalories() {
        return calories;
    }
}

