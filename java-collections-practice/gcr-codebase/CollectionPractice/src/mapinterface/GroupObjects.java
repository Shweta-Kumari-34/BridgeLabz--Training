package mapinterface;

import java.util.*;

public class GroupObjects {

	// Employee class
	static class Employee {
		String name;
		String department;

		Employee(String name, String department) {
			this.name = name;
			this.department = department;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	public static void main(String[] args) {

		// Sample employees
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Ram", "HR"));
		employees.add(new Employee("Priya", "IT"));
		employees.add(new Employee("Riya", "HR"));

		// Map to group employees by department
		Map<String, List<Employee>> deptMap = new HashMap<>();

		for (Employee emp : employees) {
			String dept = emp.department;

			// If department not present, create a new list
			if (!deptMap.containsKey(dept)) {
				deptMap.put(dept, new ArrayList<>());
			}

			// Add employee to the list
			deptMap.get(dept).add(emp);
		}

		// Display grouped employees
		for (Map.Entry<String, List<Employee>> entry : deptMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
