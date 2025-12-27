package com.constructors.level1;

public class Course {
	 String courseName;
	    int duration;      // duration in months
	    double fee;

	    // Class variable (common for all courses)
	    static String instituteName = "Aakash";

	    // Constructor
	    Course(String courseName, int duration, double fee){
	        this.courseName = courseName;
	        this.duration = duration;
	        this.fee = fee;
	    }

	    // Instance method
	    void displayCourseDetails() {
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Duration: " + duration + " months");
	        System.out.println("Fee: " + fee);
	        System.out.println("Institute: " + instituteName);
	    }

	    // Class (static) method
	    static void updateInstituteName(String newInstituteName) {
	        instituteName = newInstituteName;
	    }

	    public static void main(String[] args) {
	        Course course1 = new Course("Java Full Stack", 6, 45000);
	        Course course2 = new Course("Data Structures", 4, 30000);

	        course1.displayCourseDetails();
	        System.out.println();

	        course2.displayCourseDetails();
	        System.out.println();

	        // Update institute name for all courses
	        Course.updateInstituteName("Unacademy");

	        System.out.println("After updating institute name:");
	        System.out.println();

	        course1.displayCourseDetails();
	        System.out.println();

	        course2.displayCourseDetails();
	    }
}
