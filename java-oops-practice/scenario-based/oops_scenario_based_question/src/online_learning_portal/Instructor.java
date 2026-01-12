package online_learning_portal;

public class Instructor extends User {

    public Instructor(String name, String email) {
        super(name, email);
    }

    public void uploadCourse(String courseTitle) {
        System.out.println("Instructor uploaded course: " + courseTitle);
    }
}
