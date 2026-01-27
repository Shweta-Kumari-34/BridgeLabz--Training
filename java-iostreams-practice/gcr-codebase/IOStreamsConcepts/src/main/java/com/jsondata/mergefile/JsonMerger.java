/*
 * Merge two JSON files into a single JSON object.

 */
package com.jsondata.mergefile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JsonMerger {
	public static void main(String[] args) {
		String file1 = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\User2.json";
		String file2 = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\User1.json";
		String outputFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\merge.json";

		ObjectMapper mapper = new ObjectMapper();

		try {
			// Read both JSON files
			JsonNode json1 = mapper.readTree(new File(file1));
			JsonNode json2 = mapper.readTree(new File(file2));

			// Make sure we are working with objects
			if (!json1.isObject() || !json2.isObject()) {
				System.out.println("Both JSON files must contain JSON objects (not arrays).");
				return;
			}

			// Merge json2 into json1
			ObjectNode merged = ((ObjectNode) json1);
			json2.fields().forEachRemaining(entry -> merged.set(entry.getKey(), entry.getValue()));

			// Print merged JSON
			System.out.println("Merged JSON:");
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged));

			// Optional: Write merged JSON to a file
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), merged);
			System.out.println("Merged JSON saved to " + outputFile);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
