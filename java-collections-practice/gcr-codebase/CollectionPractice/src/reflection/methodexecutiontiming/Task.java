package reflection.methodexecutiontiming;

public class Task {
	// Method whose execution time we want to measure
    public void performTask() {

        // Dummy loop to consume time
        for (int i = 0; i < 1000000; i++) {
            // doing nothing
        }
    }
}
