package com.jsondata.carobject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateCarJson {

	public static void main(String[] args) {

		try {
			// objectmapper is used to convert java object to json
			ObjectMapper mapper = new ObjectMapper();

			// creating car object
			Car car = new Car("Toyota", "Fortuner", 2022);

			// converting car object to json string
			String json = mapper.writeValueAsString(car);

			// printing json output
			System.out.println("generated json:");
			System.out.println(json);

		} catch (Exception e) {
			// handle any exception
			e.printStackTrace();
		}
	}
}
