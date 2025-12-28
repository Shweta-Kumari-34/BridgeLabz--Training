package com.constructors.level1;

public class Student {
public String rollNumber;
protected String name;
private double CGPA;

Student(String rollNumber, String name, double CGPA){
	this.rollNumber= rollNumber;
	this.name = name;
	this.CGPA = CGPA;
}
public  void  modifyCGPA( double CGPA) {
	this.CGPA =CGPA;
}
public double getCGPA() {
	return CGPA;
}
public void display() {
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Name: " + name);
    System.out.println("CGPA: " + CGPA);
}
} 

