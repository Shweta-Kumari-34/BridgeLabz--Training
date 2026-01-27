package com.jsondata.validate;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateJson {

	public static void main(String[] args) {

		try {
			// objectmapper reads json
			ObjectMapper mapper = new ObjectMapper();

			// try to read json file
			mapper.readTree(new File("D:\\\\java programming workspace\\\\java-iostreams-practice\\\\gcr-codebase\\\\IOStreamsConcepts\\\\src\\\\main\\\\java\\\\jsonfile\\\\User1.json"));

			// if no exception, json is valid
			System.out.println("json structure is valid");

		} catch (Exception e) {
			// exception means invalid json
			System.out.println("invalid json structure");
		}
	}
}
