/*
 * "D:\java programming workspace\java-iostreams-practice\gcr-codebase\IOStreamsConcepts\src\main\java\jsonfile\output.xml"
 */
package com.jsondata.xml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class JsonToXmlConverter {
	public static void main(String[] args) {
		String jsonFile = "D:\\\\java programming workspace\\\\java-iostreams-practice\\\\gcr-codebase\\\\IOStreamsConcepts\\\\src\\\\main\\\\java\\\\jsonfile\\\\studen.json";
		String xmlFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\output.xml";

		ObjectMapper jsonMapper = new ObjectMapper();
		XmlMapper xmlMapper = new XmlMapper();

		try {
			// 1. Read JSON file into JsonNode
			JsonNode jsonNode = jsonMapper.readTree(new File(jsonFile));

			// 2. Convert JsonNode to XML string
			String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

			// 3. Print XML
			System.out.println("Converted XML:");
			System.out.println(xml);

			// 4. Save XML to a file
			xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File(xmlFile), jsonNode);
			System.out.println("XML saved to " + xmlFile);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
