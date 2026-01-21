package generics.universitycoursemanagementsystem;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Course<ExamCourse> examCourses = new Course<>();
		Course<AssignmentCourse> assignmentCourses = new Course<>();
		Course<ResearchCourse> researchCourses = new Course<>();

		boolean running = true;

		System.out.println("Welcome To University Course Management System");

		while (running) {

			System.out.println("\nSelect the choice");
			System.out.println("1: Add Course");
			System.out.println("2: Evaluate Courses");
			System.out.println("3: Display Courses");
			System.out.println("4: Exit");

			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Select Course Type");
				System.out.println("1: Exam Course");
				System.out.println("2: Assignment Course");
				System.out.println("3: Research Course");

				int type = input.nextInt();

				System.out.println("Enter course name");
				String name = input.next();

				System.out.println("Enter credits");
				int credits = input.nextInt();

				if (type == 1) {
					examCourses.addCourse(new ExamCourse(name, credits));
				} else if (type == 2) {
					assignmentCourses.addCourse(new AssignmentCourse(name, credits));
				} else {
					researchCourses.addCourse(new ResearchCourse(name, credits));
				}
				break;

			case 2:
				System.out.println("Select Course Type");
				System.out.println("1: Exam Course");
				System.out.println("2: Assignment Course");
				System.out.println("3: Research Course");

				int eval = input.nextInt();

				if (eval == 1) {
					examCourses.evaluateAllCourses();
				} else if (eval == 2) {
					assignmentCourses.evaluateAllCourses();
				} else {
					researchCourses.evaluateAllCourses();
				}
				break;

			case 3:
				System.out.println("Select Course Type");
				System.out.println("1: Exam Course");
				System.out.println("2: Assignment Course");
				System.out.println("3: Research Course");

				int display = input.nextInt();

				if (display == 1) {
					CourseUtil.displayCourses(examCourses.getAllCourses());
				} else if (display == 2) {
					CourseUtil.displayCourses(assignmentCourses.getAllCourses());
				} else {
					CourseUtil.displayCourses(researchCourses.getAllCourses());
				}
				break;

			case 4:
				running = false;
				break;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
