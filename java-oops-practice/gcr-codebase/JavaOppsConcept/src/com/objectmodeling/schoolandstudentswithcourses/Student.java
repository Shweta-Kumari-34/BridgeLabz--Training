package com.objectmodeling.schoolandstudentswithcourses;
import java.util.ArrayList;
public class Student {
	private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Enroll in a course (many-to-many association)
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);  // Linking both ways
    }
    public void viewCourses() {
        System.out.println("\nCourses of Student: " + name);
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled!");
        } else {
            for (Course c : courses) {
                System.out.println("- " + c.getCourseName());
            }
        }
    }
}
