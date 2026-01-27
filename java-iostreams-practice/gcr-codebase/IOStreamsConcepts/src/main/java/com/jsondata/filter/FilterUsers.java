/*
 * Filter JSON data: Print only users older than 25 years.
 */
package com.jsondata.filter;

import org.json.JSONArray;
import org.json.JSONObject;

public class FilterUsers {
	public static void main(String[] args) {
		String jsonData = "[{\"name\":\"Alice\",\"age\":22}," + "{\"name\":\"Bob\",\"age\":30},"
				+ "{\"name\":\"Charlie\",\"age\":27}]";

		// Convert string to JSON array
		JSONArray users = new JSONArray(jsonData);

		// Loop through each user
		for (int i = 0; i < users.length(); i++) {
			JSONObject user = users.getJSONObject(i);
			int age = user.getInt("age");

			// Print only users older than 25
			if (age > 25) {
				System.out.println(user);
			}
		}
	}
}
