package generics.universitycoursemanagementsystem;

import java.util.*;

public class CourseUtil {

	public static void displayCourses(List<? extends CourseType> courses) {
		if (courses.isEmpty()) {
			System.out.println("  (No items in storage)");
			return;
		}
		System.out.println("  Stored items:");
		for (CourseType course : courses) {
			System.out.println("Course: " + course.getCourseName() + ", Credits: " + course.getCredits());
		}
	}
}
