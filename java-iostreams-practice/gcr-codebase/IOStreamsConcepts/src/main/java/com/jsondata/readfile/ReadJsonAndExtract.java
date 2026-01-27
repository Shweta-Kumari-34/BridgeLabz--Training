package com.jsondata.readfile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJsonAndExtract {

	public static void main(String[] args) {

		try {
			// objectmapper to read json
			ObjectMapper mapper = new ObjectMapper();

			// read json file
			JsonNode rootNode = mapper.readTree(new File(
					"D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\studen.json"));

			// extract specific fields
			String name = rootNode.get("name").asText();
			String email = rootNode.get("email").asText();

			// print extracted values
			System.out.println("name: " + name);
			System.out.println("email: " + email);

		} catch (Exception e) {
			// handle exception
			e.printStackTrace();
		}
	}
}
