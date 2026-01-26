package reflection.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class ModifyStaticField {
	public static void main(String[] args) {

		try {
			// Get class object
			Class<?> cls = Configuration.class;

			// Access private static field
			Field field = cls.getDeclaredField("API_KEY");

			// Allow access
			field.setAccessible(true);

			// Modify static field (null because static)
			field.set(null, "NEW_SECRET_KEY");

			// Display updated value
			Configuration.showKey();
		} catch (Exception e) {
			System.out.println("Error occurred");
		}
	}
}