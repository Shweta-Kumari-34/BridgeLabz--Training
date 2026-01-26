package reflection.generateJSONrepresentation;

import java.lang.reflect.Field;

public class JsonUtil {
	// Method to convert object to JSON-like string
	public static String toJson(Object obj) {

		// StringBuilder to build JSON
		StringBuilder json = new StringBuilder();

		// Get class object
		Class<?> cls = obj.getClass();

		json.append("{");

		// Get all fields of class
		Field[] fields = cls.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {

			Field field = fields[i];

			// Allow access to private fields
			field.setAccessible(true);
			try {
				// Append field name
				json.append("\"").append(field.getName()).append("\":");

				// Append field value
				json.append("\"").append(field.get(obj)).append("\"");

				// Add comma except for last field
				if (i < fields.length - 1) {
					json.append(", ");
				}

			} catch (Exception e) {
				System.out.println("Error reading field");
			}
		}
		json.append("}");
		return json.toString();
	}
}
