package streams.serialization;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // creating employees object
        employees.add(new Employee(101, "Surbhi", "HR", 50000));
        employees.add(new Employee(102, "Ankita", "IT", 60000));
        employees.add(new Employee(103, "Sriyam", "Finance", 55000));

        String filename = "\"D:\\java file\\LargestSecondLargest.java\"";

        // Serialize employees
        EmployeeManager.saveEmployees(employees, filename);

        // Deserialize employees
        List<Employee> loadedEmployees = EmployeeManager.loadEmployees(filename);

        // Display loaded employees
        System.out.println("\nEmployees  loaded from file:");
        EmployeeManager.displayEmployees(loadedEmployees);
    }
}

