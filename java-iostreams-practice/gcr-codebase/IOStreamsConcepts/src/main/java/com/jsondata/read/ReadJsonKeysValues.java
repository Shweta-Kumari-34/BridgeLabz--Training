/*
 * Read a JSON file and print all keys and values.

 */
package com.jsondata.read;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class ReadJsonKeysValues {

	public static void main(String[] args) {

		try {
			// objectmapper for reading json
			ObjectMapper mapper = new ObjectMapper();

			// read json file
			JsonNode rootNode = mapper.readTree(new File("D:\\\\java programming workspace\\\\java-iostreams-practice\\\\gcr-codebase\\\\IOStreamsConcepts\\\\src\\\\main\\\\java\\\\jsonfile\\\\studen.json"));

			// iterate over all fields (key-value pairs)
			Iterator<Map.Entry<String, JsonNode>> fields = rootNode.fields();

			while (fields.hasNext()) {
				Map.Entry<String, JsonNode> field = fields.next();

				// print key and value
				System.out.println(field.getKey() + " : " + field.getValue());
			}

		} catch (Exception e) {
			// handle file / parsing error
			e.printStackTrace();
		}
	}
}
