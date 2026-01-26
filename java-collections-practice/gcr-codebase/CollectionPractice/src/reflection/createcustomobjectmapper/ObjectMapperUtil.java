package reflection.createcustomobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapperUtil {
	// Generic method to convert Map to Object
	public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

		try {
			// Create object dynamically
			T obj = clazz.getDeclaredConstructor().newInstance();

			// Loop through map entries
			for (Map.Entry<String, Object> entry : properties.entrySet()) {

				// Field name from map key
				String fieldName = entry.getKey();

				// Field value from map value
				Object fieldValue = entry.getValue();

				// Access field using reflection
				Field field = clazz.getDeclaredField(fieldName);

				// Allow access to private field
				field.setAccessible(true);
				// Set value to field
				field.set(obj, fieldValue);
			}

			return obj;

		} catch (Exception e) {
			System.out.println("Object mapping failed");
			return null;
		}
	}
}
