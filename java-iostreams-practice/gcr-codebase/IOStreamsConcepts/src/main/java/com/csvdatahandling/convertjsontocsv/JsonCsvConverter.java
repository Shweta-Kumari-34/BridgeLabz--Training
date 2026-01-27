package com.csvdatahandling.convertjsontocsv;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;

public class JsonCsvConverter {

	// Convert JSON to CSV
	public static void jsonToCsv(String jsonFile, String csvFile) {
		try {
			// Read JSON file
			String content = new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(jsonFile)));
			JSONArray students = new JSONArray(content);

			FileWriter writer = new FileWriter(csvFile);

			// Write CSV header
			writer.append("ID,Name,Age,Course\n");

			// Write data rows
			for (int i = 0; i < students.length(); i++) {
				JSONObject student = students.getJSONObject(i);
				writer.append(student.getInt("id") + ",");
				writer.append(student.getString("name") + ",");
				writer.append(student.getInt("age") + ",");
				writer.append(student.getString("course") + "\n");
			}

			writer.flush();
			writer.close();
			System.out.println("CSV created successfully: " + csvFile);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Convert CSV back to JSON
	public static void csvToJson(String csvFile, String jsonFile) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			String line;
			JSONArray students = new JSONArray();

			// Read header
			String header = br.readLine();
			String[] columns = header.split(",");

			// Read data rows
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				JSONObject student = new JSONObject();
				student.put("id", Integer.parseInt(values[0]));
				student.put("name", values[1]);
				student.put("age", Integer.parseInt(values[2]));
				student.put("course", values[3]);
				students.put(student);
			}

			br.close();

			// Write JSON to file
			FileWriter writer = new FileWriter(jsonFile);
			writer.write(students.toString(4)); // pretty print with 4 spaces
			writer.flush();
			writer.close();

			System.out.println("JSON created successfully: " + jsonFile);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String jsonFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\StudentJSON.json";
		String csvFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\Student.csv";
		String newJsonFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\filehandling\\src\\main\\java\\com\\csvfile\\NewFileCSV.json";

		// Convert JSON -> CSV
		jsonToCsv(jsonFile, csvFile);

		// Convert CSV -> JSON
		csvToJson(csvFile, newJsonFile);
	}
}
