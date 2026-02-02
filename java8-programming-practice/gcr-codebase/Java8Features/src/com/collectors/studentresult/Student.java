package com.collectors.studentresult;

//Student class to store student data
public class Student {

	private String name;
	private String grade;

	// constructor
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	// getter for name
	public String getName() {
		return name;
	}

	// getter for grade
	public String getGrade() {
		return grade;
	}
}
