package online_learning_portal;

import java.util.Arrays;
import java.util.List;

public abstract class Course implements ICertifiable {

    protected String title;
    protected Instructor instructor;
    protected double rating;
    protected String[] modules;

    private final List<String> reviews; // read-only externally

    // Default modules constructor
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Final Project"};
        this.reviews = List.of("Great course!", "Well structured");
    }

    // Custom modules constructor
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = List.of("Excellent content", "Very helpful");
    }

    protected void calculateRating(int stars, int users) {
        this.rating = (double) stars / users; // protected logic
    }

    public double getRating() {
        return rating;
    }

    public List<String> getReviews() {
        return reviews; // read-only (no setter)
    }
}

