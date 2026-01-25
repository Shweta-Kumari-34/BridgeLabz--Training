package streams.readuserinput;

import java.io.*;

public class ReadUserInput {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String filename = "D:\\java file\\FibonacciSequence .java";
		
        //exception generated code is written in try block
		try {
			// Reading user input
			System.out.print("Please enter your name: ");
			String name = reader.readLine();

			System.out.print("Please enter your age: ");
			String age = reader.readLine();

			System.out.print("Please enter your favorite programming language: ");
			String language = reader.readLine();

			// Writing to file
			FileWriter writer = new FileWriter(filename);
			
			System.out.println("***********************************************************");
			writer.write("Name: " + name + "\n");
			writer.write("Age: " + age + "\n");
			writer.write("Favorite Programming Language: " + language + "\n");
			
			System.out.println("***********************************************************");

			writer.close();
			System.out.println("User information saved to file" + filename);

		}
		//catch block prevent abnormal termination of program
		catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
