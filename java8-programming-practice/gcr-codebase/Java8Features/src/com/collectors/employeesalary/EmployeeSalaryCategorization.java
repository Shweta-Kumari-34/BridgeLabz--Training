package com.collectors.employeesalary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {

	public static void main(String[] args) {

		// list of employees
		List<Employee> employees = Arrays.asList(new Employee("Aman", "IT", 50000), new Employee("Neha", "HR", 40000),
				new Employee("Ravi", "IT", 60000), new Employee("Priya", "HR", 45000),
				new Employee("Rohan", "Finance", 55000));

		// group employees by department and calculate average salary
		Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				// group by department

				Collectors.averagingDouble(Employee::getSalary // average salary
				)));

		// print average salary for each department
		avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " -> Average Salary: " + avgSalary));
	}
}
