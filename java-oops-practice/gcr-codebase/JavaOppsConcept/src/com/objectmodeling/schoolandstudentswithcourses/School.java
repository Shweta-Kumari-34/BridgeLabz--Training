package com.objectmodeling.schoolandstudentswithcourses;
import java.util.ArrayList;
public class School {
	private String schoolName;
    private ArrayList<Student> students = new ArrayList<>();  // School aggregates students

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        students.add(student); // School has students but does not own lifetime
    }

    public void showStudents() {
        System.out.println("\nSchool: " + schoolName + " Student List:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}
