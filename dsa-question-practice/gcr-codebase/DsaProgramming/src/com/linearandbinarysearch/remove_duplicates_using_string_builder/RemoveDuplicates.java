package com.linearandbinarysearch.remove_duplicates_using_string_builder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();
		StringBuilder sb = new StringBuilder();
		// initializing HashSet to store unique character
		HashSet<Character> set = new HashSet<>();
		// traversing each character
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// check if character is already present
			if (!set.contains(ch)) {
				sb.append(ch);
				set.add(ch);
			}
		}

		System.out.println("String without duplicates: " + sb.toString());
		input.close();
	}
}
