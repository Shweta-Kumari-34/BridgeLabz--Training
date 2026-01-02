package com.inheritance.schoolsystem;

public class Main {
	public static void main(String[] args) {

        Teacher t1 = new Teacher("Rahul Verma", 35, "Mathematics");
        Student s1 = new Student("Ayesha Khan", 16, "10th Grade");
        Staff st1 = new Staff("Rohit Sharma", 40, "Administration");

        t1.showDetails();
        t1.displayRole();

        s1.showDetails();
        s1.displayRole();

        st1.showDetails();
        st1.displayRole();
    }
}
