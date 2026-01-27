/*
 *  Convert a list of Java objects into a JSON array.

 */

package com.jsondata.convertjava;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class ConvertListToJson {

	public static void main(String[] args) {

		try {
			// objectmapper to convert java to json
			ObjectMapper mapper = new ObjectMapper();

			// create list of student objects
			List<Student> students = new ArrayList<>();
			students.add(new Student("Aman", 22));
			students.add(new Student("Riya", 21));
			students.add(new Student("Neha", 23));

			// convert list to json array
			String jsonArray = mapper.writeValueAsString(students);

			// print json output
			System.out.println("json array:");
			System.out.println(jsonArray);

		} catch (Exception e) {
			// handle exception
			e.printStackTrace();
		}
	}
}
