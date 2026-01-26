package reflection.dynamicallycreateobjects;

public class Main {

	public static void main(String[] args) {

		try {
			// Load Student class dynamically
			Class<?> cls = Class.forName("reflection.beginner.Student");

			// Create object without using 'new' keyword
			Object obj = cls.getDeclaredConstructor().newInstance();

			// Type cast Object to Student
			Student student = (Student) obj;

			// Call method
			student.display();

		} catch (Exception e) {
			System.out.println("Error while creating object");
		}
	}
}
