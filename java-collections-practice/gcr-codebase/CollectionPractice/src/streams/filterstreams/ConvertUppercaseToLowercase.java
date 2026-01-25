package streams.filterstreams;

import java.io.*;

public class ConvertUppercaseToLowercase {

	public static void main(String[] args) {

		String sourceFile = "D:\\java file\\LargestSecondLargest.java";
		String destinationFile = "D:\\java file\\EmployeeBonus.java";
        
		//exception generating code is written here
		try {
			// FileReader & FileWriter (character streams)
			FileReader fr = new FileReader(sourceFile);
			FileWriter fw = new FileWriter(destinationFile);

			// Buffered streams for efficiency
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);

			int ch;
			while ((ch = br.read()) != -1) {
				// convert character to lowercase
				bw.write(Character.toLowerCase((char) ch));
			}

			br.close();
			bw.close();

			System.out.println("File converted to lowercase successfully.");

		}
		//prevent abnormal termination of program
		catch (IOException e) {
			System.out.println("Error Occur: " + e.getMessage());
		}
	}
}
