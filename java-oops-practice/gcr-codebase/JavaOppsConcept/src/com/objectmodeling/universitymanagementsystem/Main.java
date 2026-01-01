package com.objectmodeling.universitymanagementsystem;

public class Main {
	public static void main(String[] args) {

        // Creating Students
        Student s1 = new Student("Aarav");
        Student s2 = new Student("Riya");

        // Creating Professor
        Professor p1 = new Professor("Dr. Sharma");

        // Creating Courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        // Relationships demonstrated:
        p1.assignCourse(c1);         // professor assigned to course
        s1.enrollCourse(c1);         // student enrolled
        s2.enrollCourse(c1);
        p1.assignCourse(c2);
        s1.enrollCourse(c2);

        // Show course details
        c1.showCourseDetails();
        c2.showCourseDetails();
}
}
