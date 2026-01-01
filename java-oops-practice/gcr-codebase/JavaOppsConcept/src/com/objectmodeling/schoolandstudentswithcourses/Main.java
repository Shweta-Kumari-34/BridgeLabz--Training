package com.objectmodeling.schoolandstudentswithcourses;

public class Main {
	 public static void main(String[] args) {

	        School school = new School("Green Valley Public School");

	        // Students (exist independently)
	        Student s1 = new Student("Rohan");
	        Student s2 = new Student("Priya");
	        Student s3 = new Student("Arjun");

	        // Adding students to school (Aggregation)
	        school.addStudent(s1);
	        school.addStudent(s2);
	        school.addStudent(s3);

	        // Courses (independent)
	        Course c1 = new Course("Mathematics");
	        Course c2 = new Course("Science");
	        Course c3 = new Course("Computer");
	        s1.enrollInCourse(c1);
	        s1.enrollInCourse(c3);

	        s2.enrollInCourse(c1);
	        s2.enrollInCourse(c2);

	        s3.enrollInCourse(c2);
	        s3.enrollInCourse(c3);

	        // Display info
	        school.showStudents();

	        s1.viewCourses();
	        s2.viewCourses();
	        s3.viewCourses();
	        c1.showEnrolledStudents();
	        c2.showEnrolledStudents();
	        c3.showEnrolledStudents();
}
}