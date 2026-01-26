package reflection.invokeprivatemethod;

import java.lang.reflect.Method;

public class InvokePrivateMethod {

	public static void main(String[] args) {

		try {
			// Create object
			Calculator c = new Calculator();

			// Get class object
			Class<?> cls = c.getClass();

			// Access private method
			Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

			// Allow access
			method.setAccessible(true);

			// Call method
			int result = (int) method.invoke(c, 3, 4);

			System.out.println("Result: " + result);

		} catch (Exception e) {
			System.out.println("Error occurred");
		}
	}
}
