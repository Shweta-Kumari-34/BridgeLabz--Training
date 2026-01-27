/*Validate an email field using JSON Schema.
 */

package com.jsondata.emailvalidate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class EmailArrayValidator {
	public static void main(String[] args) {
		String jsonFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\User1.json";
		String schemaFile = "D:\\java programming workspace\\java-iostreams-practice\\gcr-codebase\\IOStreamsConcepts\\src\\main\\java\\jsonfile\\email_schema.json";

		ObjectMapper mapper = new ObjectMapper();

		try {
			// Read JSON array of users
			JsonNode usersArray = mapper.readTree(new File(jsonFile));

			// Safety check: is it really an array?
			if (!usersArray.isArray()) {
				System.out.println("JSON file does not contain an array of users.");
				return;
			}

			// Read schema definition
			JsonNode schemaNode = mapper.readTree(new File(schemaFile));
			JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
			JsonSchema schema = factory.getSchema(schemaNode);

			// Loop through each user and validate
			for (int i = 0; i < usersArray.size(); i++) {
				JsonNode user = usersArray.get(i);

				// Safe access using path() instead of get()
				String email = user.path("email").asText(null); // null if missing

				if (email == null) {
					System.out.println("User " + (i + 1) + ": Missing email field!");
					continue;
				}

				Set<ValidationMessage> errors = schema.validate(user);

				System.out.println("User " + (i + 1) + ": " + email);
				if (errors.isEmpty()) {
					System.out.println(" Email is valid.");
				} else {
					System.out.println(" Validation errors:");
					for (ValidationMessage msg : errors) {
						System.out.println("     - " + msg.getMessage());
					}
				}
			}

		} catch (IOException e) {
			System.out.println("Error reading JSON or schema file.");
			e.printStackTrace();
		}
	}
}
