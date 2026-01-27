/*
 * Convert CSV data into JSON.

 */
package com.jsondata.csvtojson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvToJsonConverter {
	public static void main(String[] args) {
		String csvFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\Student.csv";
		String jsonFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\output.json";

		ObjectMapper mapper = new ObjectMapper();
		ArrayNode jsonArray = mapper.createArrayNode();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			String line;
			String[] headers = null;

			int lineNumber = 0;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(","); // split CSV by comma

				if (lineNumber == 0) {
					// First line contains headers
					headers = values;
				} else {
					ObjectNode obj = mapper.createObjectNode();
					for (int i = 0; i < headers.length; i++) {
						obj.put(headers[i], values[i]);
					}
					jsonArray.add(obj);
				}
				lineNumber++;
			}

			// Print JSON array
			System.out.println("Converted JSON:");
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonArray));

			// Save JSON to file
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonFile), jsonArray);
			System.out.println("JSON saved to " + jsonFile);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
