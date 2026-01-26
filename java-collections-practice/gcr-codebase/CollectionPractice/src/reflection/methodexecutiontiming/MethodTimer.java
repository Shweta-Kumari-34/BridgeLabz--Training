package reflection.methodexecutiontiming;

import java.lang.reflect.Method;

public class MethodTimer {
	public static void main(String[] args) {

		try {
			// Create object normally
			Task task = new Task();

			// Get Class object
			Class<?> cls = task.getClass();

			// Get method using Reflection
			Method method = cls.getDeclaredMethod("performTask");

			// Record start time
			long startTime = System.nanoTime();

			// Invoke method dynamically
			method.invoke(task);
			// Step 6: Record end time
			long endTime = System.nanoTime();

			// Calculate execution time
			long executionTime = endTime - startTime;

			System.out.println("Execution Time: " + executionTime + " nanoseconds");

		} catch (Exception e) {
			System.out.println("Error while measuring execution time");
		}
	}
}
