package com.jsondata.report;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.*;

public class DatabaseJsonReport {
	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/testdb"; // replace with your DB
		String username = "root";
		String password = "root";
		String jsonFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\studen.json";

		ObjectMapper mapper = new ObjectMapper();
		ArrayNode jsonArray = mapper.createArrayNode();

		try (Connection conn = DriverManager.getConnection(jdbcURL, username, password)) {
			String sql = "SELECT id, name, age, email FROM users";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				ObjectNode userNode = mapper.createObjectNode();
				userNode.put("id", rs.getInt("id"));
				userNode.put("name", rs.getString("name"));
				userNode.put("age", rs.getInt("age"));
				userNode.put("email", rs.getString("email"));

				jsonArray.add(userNode);
			}

			// Print JSON report
			System.out.println("JSON Report:");
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray));

			// Save JSON report to file
			mapper.writerWithDefaultPrettyPrinter().writeValue(new java.io.File(jsonFile), jsonArray);
			System.out.println("Report saved to " + jsonFile);

		} catch (SQLException e) {
			System.out.println("Database connection or query failed.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
