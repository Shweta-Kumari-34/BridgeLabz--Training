package generics.universitycoursemanagementsystem;

import java.util.*;

public class Course<T extends CourseType> {

	private List<T> courses = new ArrayList<>();

	public void addCourse(T course) {
		courses.add(course);
	}

	public List<T> getAllCourses() {
		return courses;
	}

	public void evaluateAllCourses() {
		for (T course : courses) {
			course.evaluate();
		}
	}
}
