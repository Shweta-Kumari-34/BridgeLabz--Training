package edumentorpersonalizedlearningplatform;

class User {
    protected String name;
    protected String email;
    protected int userId;

    User(String name, String email, int userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    void displayUser() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("User ID: " + userId);
    }
}


