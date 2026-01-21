package generics.mealplangeneratorapp;


public class VeganMeal implements MealPlan {

    private int calories;

    public VeganMeal(int calories) {
        this.calories = calories;
    }

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public int getCalories() {
        return calories;
    }
}

