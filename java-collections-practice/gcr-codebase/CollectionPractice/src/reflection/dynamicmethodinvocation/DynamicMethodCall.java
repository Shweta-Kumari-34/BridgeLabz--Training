package reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodCall {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			// Create object
			MathOperations obj = new MathOperations();

			// Get class object
			Class<?> cls = obj.getClass();

			// Take method name from user
			System.out.println("Enter method name (add / subtract / multiply):");
			String methodName = input.next();

			// Take numbers
			System.out.println("Enter first number:");
			int a = input.nextInt();

			System.out.println("Enter second number:");
			int b = input.nextInt();

			// Get method dynamically
			Method method = cls.getDeclaredMethod(methodName, int.class, int.class);

			// Call method
			int result = (int) method.invoke(obj, a, b);

			System.out.println("Result: " + result);

		} catch (Exception e) {
			System.out.println("Invalid method name or error occurred");
		}

		input.close();
	}
}
