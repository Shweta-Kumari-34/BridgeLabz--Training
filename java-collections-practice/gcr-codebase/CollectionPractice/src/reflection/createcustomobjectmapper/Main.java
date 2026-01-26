package reflection.createcustomobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

		// Create Map with field names and values
		Map<String, Object> data = new HashMap<>();
		data.put("name", "Shweta");
		data.put("age", 23);

		// Convert Map to Student object
		Student student = ObjectMapperUtil.toObject(Student.class, data);

		// Display object data
		if (student != null) {
			student.display();
		}
	}
}
