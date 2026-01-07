package personalfitnesstracker;

public class CardioWorkout extends Workout {

	public CardioWorkout(int duration) {
		super("Cardio", duration);
	}

	public int calculateCalories() {
		caloriesBurned = duration * 8;
		return caloriesBurned;
	}
}
