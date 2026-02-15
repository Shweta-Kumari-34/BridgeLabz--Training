package resources.com.dbmsjdbc.sql.crudapplication;

import java.sql.*;
import java.util.Scanner;

public class EmployeeManagementSystem {

    static final String URL = "jdbc:mysql://localhost:3306/practice_db";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            while (true) {
                System.out.println("\n===== Employee Management System =====");
                System.out.println("1. Add Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Update Employee Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Search Employee by Name");
                System.out.println("6. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {

                    case 1:
                        addEmployee(con, sc);
                        break;

                    case 2:
                        viewEmployees(con);
                        break;

                    case 3:
                        updateSalary(con, sc);
                        break;

                    case 4:
                        deleteEmployee(con, sc);
                        break;

                    case 5:
                        searchEmployee(con, sc);
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //  Add Employee
    public static void addEmployee(Connection con, Scanner sc) throws SQLException {

        String sql = "INSERT INTO employee (name, department, salary) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        ps.setString(1, name);
        ps.setString(2, dept);
        ps.setDouble(3, salary);

        int rows = ps.executeUpdate();
        System.out.println(rows + " employee added successfully!");
    }

    //  View All Employees
    public static void viewEmployees(Connection con) throws SQLException {

        String sql = "SELECT * FROM employee";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("\n--- Employee List ---");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("employee_id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("department") + " | " +
                    rs.getDouble("salary")
            );
        }
    }

    //  Update Salary
    public static void updateSalary(Connection con, Scanner sc) throws SQLException {

        String sql = "UPDATE employee SET salary = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter New Salary: ");
        double salary = sc.nextDouble();

        ps.setDouble(1, salary);
        ps.setInt(2, id);

        int rows = ps.executeUpdate();
        System.out.println(rows + " employee updated!");
    }

    //  Delete Employee
    public static void deleteEmployee(Connection con, Scanner sc) throws SQLException {

        String sql = "DELETE FROM employee WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        ps.setInt(1, id);

        int rows = ps.executeUpdate();
        System.out.println(rows + " employee deleted!");
    }

    // Search Employee by Name
    public static void searchEmployee(Connection con, Scanner sc) throws SQLException {

        String sql = "SELECT * FROM employee WHERE name LIKE ?";
        PreparedStatement ps = con.prepareStatement(sql);

        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        ps.setString(1, "%" + name + "%");

        ResultSet rs = ps.executeQuery();

        System.out.println("\n--- Search Result ---");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("department") + " | " +
                    rs.getDouble("salary")
            );
        }
    }
}

