package streams.serialization;

import java.io.*;
import java.util.*;

public class EmployeeManager {

    // Serialize list of employees to a file
    public static void saveEmployees(List<Employee> employees, String filename) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(employees);
            oos.close();
            System.out.println("Employees saved to " + filename+ "file");
        } catch (IOException e) {
            System.out.println("Error while saving employees: " + e.getMessage());
        }
    }

    // Deserialize and return list of employees
    public static List<Employee> loadEmployees(String filename) {
        List<Employee> employees = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            employees = (List<Employee>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println("Error occur while reading file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
        return employees;
    }

    // Displaying list of employees
    public static void displayEmployees(List<Employee> employees) {
        if (employees != null) {
            for (Employee e : employees) {
                System.out.println(e);
            }
        } else {
            System.out.println("No employees to display.");
        }
    }
}

