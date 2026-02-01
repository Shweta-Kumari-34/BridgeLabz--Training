package com.functionalinterfaces.stringlengthchecker;

import java.util.function.Function;

public class StringLengthChecker {

	public static void main(String[] args) {

		// maximum allowed length
		int maxLength = 20;

		// Function to calculate length of string
		Function<String, Integer> lengthFunction = msg -> msg.length();

		String message = "Welcome to Java Streams";

		// get length using Function
		int length = lengthFunction.apply(message);

		if (length > maxLength) {
			System.out.println("Message exceeds limit. Length = " + length);
		} else {
			System.out.println("Message is within limit. Length = " + length);
		}
	}
}
