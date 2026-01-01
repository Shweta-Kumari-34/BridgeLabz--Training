package com.objectmodeling.schoolandstudentswithcourses;
import java.util.ArrayList;
public class Course {
	private String courseName;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Add student to course list (association)
    public void enrollStudent(Student student) {
        students.add(student);
    }
    public void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        if (students.isEmpty()) {
            System.out.println("No students yet!");
        } else {
            for (Student s : students) {
                System.out.println("- " + s.getName());
            }
        }
    }
}
