package com.jsondata.studentjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Arrays;

public class CreateStudentJson {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();

			Student student = new Student("Rahul", 21, Arrays.asList("Java", "DBMS", "OS"));

			// pretty printed json
			String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);

			// print json
			System.out.println(json);

			// write json to file
			mapper.writeValue(new File("student.json"), student);

			System.out.println("json written to file");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
