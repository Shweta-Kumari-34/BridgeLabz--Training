package online_learning_portal;

public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public String generateCertificate() {
        return "Certificate of Completion - Beginner Level\nCourse: " + title;
    }
}

