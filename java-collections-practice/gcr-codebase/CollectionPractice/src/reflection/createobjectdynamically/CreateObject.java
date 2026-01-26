package reflection.createobjectdynamically;

public class CreateObject {

	public static void main(String[] args) {

		try {
			// Load class
			Class<?> cls = Class.forName("reflection.beginner.Student");

			// Create object dynamically
			Object obj = cls.getDeclaredConstructor().newInstance();

			// Type cast
			Student s = (Student) obj;

			// Call method
			s.show();

		} catch (Exception e) {
			System.out.println("Error occurred");
		}
	}
}
