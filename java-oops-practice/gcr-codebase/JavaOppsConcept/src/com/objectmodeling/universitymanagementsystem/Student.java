package com.objectmodeling.universitymanagementsystem;
import java.util.List;
import java.util.ArrayList;
public class Student {
	String name;
    List<Course> courses = new ArrayList<>(); // A student can enroll in multiple courses

    public Student(String name) {
        this.name = name;
    }

    // Student enrolls in a course (communication)
    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }
}
