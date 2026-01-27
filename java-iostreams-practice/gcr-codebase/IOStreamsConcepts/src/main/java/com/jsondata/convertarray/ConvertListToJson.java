/*
 * Convert a list of Java objects into a JSON array.

 */
package com.jsondata.convertarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class ConvertListToJson {

	public static void main(String[] args) {

		try {
			// objectmapper for json conversion
			ObjectMapper mapper = new ObjectMapper();

			// create list of java objects
			List<Student> list = new ArrayList<>();
			list.add(new Student("Aman", 22));
			list.add(new Student("Neha", 28));
			list.add(new Student("Ravi", 25));

			// convert list to json array
			String jsonArray = mapper.writeValueAsString(list);

			// print json array
			System.out.println(jsonArray);

		} catch (Exception e) {
			// handle exception
			e.printStackTrace();
		}
	}
}
