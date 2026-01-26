package annotations.maxlengthannotation;

public class Main {
	public static void main(String[] args) {

		// valid username
		User user1 = new User("shweta");
		System.out.println("username: " + user1.getUsername());

		// invalid username (more than 10 characters)
		User user2 = new User("verylongusername");
	}
}
