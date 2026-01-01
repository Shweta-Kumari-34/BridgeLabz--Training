package com.objectmodeling.universitymanagementsystem;
import java.util.ArrayList;
import java.util.List;
public class Course {
	String courseName;
    Professor professor;                // Association (Course -> Professor)
    List<Student> students = new ArrayList<>(); // Aggregation (Course has Students)

    public Course(String courseName) {
        this.courseName = courseName;
    }


	// Professor assigned to course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.name + " assigned to course " + courseName);
    }
    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println(student.name + " enrolled in " + courseName);
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.name : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for(Student s : students){
            System.out.println("- " + s.name);
        }
    }
}
