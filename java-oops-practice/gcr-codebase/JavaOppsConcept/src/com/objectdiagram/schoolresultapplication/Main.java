package com.objectdiagram.schoolresultapplication;



public class Main {
	public static void main(String[] args) {

        // Creating Student Object
        Student student = new Student("John", 101);

        // Creating Subject Objects (Object Diagram example)
        Subject s1 = new Subject("Maths", 90);
        Subject s2 = new Subject("Science", 85);

        // Adding subjects to student
        student.addSubject(s1);
        student.addSubject(s2);

        // Creating Grade Calculator
        GradeCalculator calculator = new GradeCalculator();

        float percentage = calculator.calculatePercentage(student);
        String grade = calculator.generateGrade(percentage);

        // Output
        System.out.println("----- Student Result -----");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
