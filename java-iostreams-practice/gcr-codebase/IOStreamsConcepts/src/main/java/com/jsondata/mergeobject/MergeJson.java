package com.jsondata.mergeobject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJson {

	public static void main(String[] args) {

		try {
			// objectmapper to work with json
			ObjectMapper mapper = new ObjectMapper();

			// read both json files
			JsonNode json1 = mapper.readTree(new File("D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\User1.json"));
			JsonNode json2 = mapper.readTree(new File("D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\User2.json"));

			// create a new json object
			ObjectNode mergedJson = mapper.createObjectNode();

			// add all fields from first json
			mergedJson.setAll((ObjectNode) json1);

			// add all fields from second json
			mergedJson.setAll((ObjectNode) json2);

			// print merged json
			System.out.println("merged json:");
			System.out.println(mergedJson.toPrettyString());

		} catch (Exception e) {
			// handle exception
			e.printStackTrace();
		}
	}
}
