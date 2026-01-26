package reflection.generateJSONrepresentation;

public class Main {
	public static void main(String[] args) {

        // Create Student object
        Student student = new Student("Shweta", 23);

        // Convert object to JSON
        String json = JsonUtil.toJson(student);

        // Print JSON-like output
        System.out.println(json);
    }
}
