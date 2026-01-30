package com.lambdaexpressions.nameuppercasing;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Aman"), new Employee("Neha"), new Employee("Ravi"),
				new Employee("Riya"));

		// convert names to uppercase using method reference
		employees.stream().map(Employee::getName).map(String::toUpperCase) // method reference
				.forEach(System.out::println);
	}
}
