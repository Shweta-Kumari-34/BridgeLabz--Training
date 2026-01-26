package reflection.accessprivatefield;

import java.lang.reflect.Field;

public class AccessPrivateField {

	public static void main(String[] args) {

		try {
			// Create object
			Person p = new Person();

			// Get class object
			Class<?> cls = p.getClass();

			// Access private field
			Field field = cls.getDeclaredField("age");

			// Allow access to private field
			field.setAccessible(true);

			// Change value
			field.set(p, 25);

			// Get value
			System.out.println("Age: " + field.get(p));

		} catch (Exception e) {
			System.out.println("Error occurred");
		}
	}
}
