package com.objectmodeling.universitymanagementsystem;

public class Professor {
	String name;

    public Professor(String name) {
        this.name = name;
    }

    // Professor teaches a course (communication)
    public void assignCourse(Course course) {
        course.assignProfessor(this);
    }
}
