package reflection.dependencyinjectionusingreflection;

public class Main {
	public static void main(String[] args) {

		// Create Car object using DI container
		Car car = SimpleDIContainer.createObject(Car.class);

		// Use injected dependency
		if (car != null) {
			car.drive();
		}
	}
}
