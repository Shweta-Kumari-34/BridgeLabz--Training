package com.objectmodeling.universitywithfacultiesanddepartments;

public class Main {
	public static void main(String[] args) {

        University uni = new University("National Institute of Technology");

        // Departments (Part of University - Composition)
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mechanical Engineering");
        Department d3 = new Department("Electrical Engineering");

        uni.addDepartment(d1);
        uni.addDepartment(d2);
        uni.addDepartment(d3);

        // Faculties (Independent - Aggregation)
        Faculty f1 = new Faculty("Dr. Sharma", "Data Structures");
        Faculty f2 = new Faculty("Prof. Gupta", "Thermodynamics");
        Faculty f3 = new Faculty("Dr. Mehta", "Power Systems");

        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.addFaculty(f3);
        uni.showDetails();

        // Close university (Composition effect)
        uni.closeUniversity();

        // Faculty still exists after university deletion
        System.out.println("\nFaculties still exist independently:");
        f1.showFaculty();
        f2.showFaculty();
        f3.showFaculty();
    }
}
