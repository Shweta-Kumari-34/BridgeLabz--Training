package reflection.dependencyinjectionusingreflection;

public class Car {
	// Mark field for injection
    @Inject
    private Engine engine;

    public void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}
