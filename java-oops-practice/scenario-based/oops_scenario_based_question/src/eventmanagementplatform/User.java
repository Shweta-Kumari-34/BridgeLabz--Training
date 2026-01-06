package eventmanagementplatform;

public class User {
	    private String name;
	    private String email;

	    User(String name, String email) {
	        this.name = name;
	        this.email = email;
	    }

	    public void displayUser() {
	        System.out.println("Organizer: " + name);
	        System.out.println("Email: " + email);
	    }
	}


