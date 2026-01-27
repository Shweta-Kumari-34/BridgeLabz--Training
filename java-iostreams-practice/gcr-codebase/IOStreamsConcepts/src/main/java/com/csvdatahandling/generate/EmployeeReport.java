package com.csvdatahandling.generate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeReport {
	public static void main(String[] args) {
		// Database connection details
		String url = "jdbc:mysql://localhost:3306/company";

		// Change to your DB name
		String username = "root"; // DB username
		String password = "root"; // DB password

		String csvFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\csvfile\\EmployeeDetails.csv"; // CSV file to generate

		try {
			// Connect to database
			Connection conn = DriverManager.getConnection(url, username, password);

			// Create SQL statement
			Statement stmt = conn.createStatement();
			String query = "SELECT emp_id, name, department, salary FROM employees";

			// Execute query
			ResultSet rs = stmt.executeQuery(query);

			// Create CSV writer
			FileWriter writer = new FileWriter(csvFile);

			// Write CSV header
			writer.append("Employee ID,Name,Department,Salary\n");

			// Write data rows
			while (rs.next()) {
				writer.append(rs.getString("emp_id"));
				writer.append(",");
				writer.append(rs.getString("name"));
				writer.append(",");
				writer.append(rs.getString("department"));
				writer.append(",");
				writer.append(rs.getString("salary"));
				writer.append("\n");
			}

			// Close resources
			writer.flush();
			writer.close();
			rs.close();
			stmt.close();
			conn.close();

			System.out.println("CSV report generated successfully: " + csvFile);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
