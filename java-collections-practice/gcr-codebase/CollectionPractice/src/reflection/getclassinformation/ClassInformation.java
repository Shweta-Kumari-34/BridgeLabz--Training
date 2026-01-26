package reflection.getclassinformation;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInformation {

	public static void main(String[] args) {

		// Scanner for user input
		Scanner input = new Scanner(System.in);

		System.out.println("Enter class name (example: java.lang.String):");
		String className = input.nextLine();

		try {
			// Load class at runtime
			Class<?> cls = Class.forName(className);

			// Display constructors
			System.out.println("\nConstructors:");
			for (Constructor<?> c : cls.getDeclaredConstructors()) {
				System.out.println(c.getName());
			}

			// Display fields
			System.out.println("\nFields:");
			for (Field f : cls.getDeclaredFields()) {
				System.out.println(f.getName());
			}

			// Display methods
			System.out.println("\nMethods:");
			for (Method m : cls.getDeclaredMethods()) {
				System.out.println(m.getName());
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		}

		input.close();
	}
}
