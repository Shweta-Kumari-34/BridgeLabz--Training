package com.collectors.studentresult;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentGroupingApp {

	public static void main(String[] args) {

		// list of students
		List<Student> students = Arrays.asList(new Student("Aman", "A"), new Student("Neha", "B"),
				new Student("Ravi", "A"), new Student("Priya", "C"), new Student("Riya", "B"));

		// grouping students by grade and collecting names
		// group by grade
		Map<String, List<String>> result = students.stream().collect(Collectors.groupingBy(Student::getGrade,

				Collectors.mapping(Student::getName, // take only name
						Collectors.toList())));

		// print the grouped result
		result.forEach((grade, names) -> System.out.println("Grade " + grade + " : " + names));
	}
}
