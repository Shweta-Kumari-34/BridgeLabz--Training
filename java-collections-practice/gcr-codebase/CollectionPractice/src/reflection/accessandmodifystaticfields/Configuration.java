package reflection.accessandmodifystaticfields;

// Configuration class
public class Configuration {

	// Private static field
	private static String API_KEY = "OLD_KEY";

	// Method to display key
	public static void showKey() {
		System.out.println("API KEY: " + API_KEY);
	}
}