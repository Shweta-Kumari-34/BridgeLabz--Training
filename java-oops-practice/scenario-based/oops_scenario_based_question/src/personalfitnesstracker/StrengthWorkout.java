package personalfitnesstracker;

public class StrengthWorkout extends Workout {

	public StrengthWorkout(int duration) {
		super("Strength", duration);
	}

	public int calculateCalories() {
		caloriesBurned = duration * 5;
		return caloriesBurned;
	}
}
