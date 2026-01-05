package campusconnect;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean running = true;

		Student student = null;
		Faculty faculty = null;
		Course course = null;

		while (running) {

			System.out.println("\n------------------------------------");
			System.out.println(" CampusConnect Academic Module ");
			System.out.println("1. Create Faculty");
			System.out.println("2. Create Student");
			System.out.println("3. Create Course");
			System.out.println("4. Enroll Student");
			System.out.println("5. Show Student Details");
			System.out.println("6. Show Faculty Details");
			System.out.println("7. Show Course Details");
			System.out.println("8. Exit");
			System.out.println("------------------------------------");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter Faculty ID: ");
				int fid = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Faculty Name: ");
				String fname = sc.nextLine();
				System.out.print("Enter Faculty Email: ");
				String femail = sc.nextLine();
				faculty = new Faculty(fid, fname, femail);
				System.out.println("Faculty created successfully");
				break;

			case 2:
				System.out.print("Enter Student ID: ");
				int sid = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Student Name: ");
				String sname = sc.nextLine();
				System.out.print("Enter Student Email: ");
				String semail = sc.nextLine();

				System.out.print("Enter number of subjects: ");
				int n = sc.nextInt();
				int[] grades = new int[n];

				System.out.println("Enter grades:");
				for (int i = 0; i < n; i++) {
					grades[i] = sc.nextInt();
				}

				student = new Student(sid, sname, semail, grades);
				System.out.println("Student created successfully");
				break;

			case 3:
				if (faculty == null) {
					System.out.println("Create Faculty first");
					break;
				}
				System.out.print("Enter Course Name: ");
				String cname = sc.nextLine();
				course = new Course(cname, faculty);
				System.out.println("Course created successfully");
				break;

			case 4:
				if (student != null && course != null) {
					student.enrollCourse(course);
				} else {
					System.out.println("Create Student and Course first");
				}
				break;

			case 5:
				if (student != null) {
					student.printDetails();
				} else {
					System.out.println("No Student available");
				}
				break;

			case 6:
				if (faculty != null) {
					faculty.printDetails();
				} else {
					System.out.println("No Faculty available");
				}
				break;

			case 7:
				if (course != null) {
					course.showCourseDetails();
				} else {
					System.out.println("No Course available");
				}
				break;

			case 8:
				running = false;
				System.out.println("CampusConnect Closed");
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}

		sc.close();
	}

}
