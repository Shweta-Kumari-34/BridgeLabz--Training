package online_learning_portal;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    @Override
    public String generateCertificate() {
        return "Professional Certificate - Advanced Level\nCourse: " + title;
    }
}

