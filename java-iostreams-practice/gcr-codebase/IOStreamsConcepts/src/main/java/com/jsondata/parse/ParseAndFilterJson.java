/*
 * Parse JSON and filter only those records where age > 25
 */
package com.jsondata.parse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ParseAndFilterJson {

	public static void main(String[] args) {

		try {
			// sample json array
			String json = "[{\"name\":\"Aman\",\"age\":22}," + "{\"name\":\"Neha\",\"age\":28},"
					+ "{\"name\":\"Ravi\",\"age\":30}," + "{\"name\":\"Riya\",\"age\":21}]";

			// objectmapper for json operations
			ObjectMapper mapper = new ObjectMapper();

			// convert json array to list of student objects
			List<Student> students = mapper.readValue(json, new TypeReference<List<Student>>() {
			});

			System.out.println("students with age > 25:");

			// filter students whose age > 25
			for (Student s : students) {
				if (s.getAge() > 25) {
					System.out.println(s.getName() + " - " + s.getAge());
				}
			}

		} catch (Exception e) {
			// handle parsing error
			e.printStackTrace();
		}
	}
}
