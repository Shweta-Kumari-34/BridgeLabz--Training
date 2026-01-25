package junit.testingfilehandlingmethods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {
	// writes content to a file
	public void writeToFile(String filename, String content) throws IOException {
		FileWriter writer = new FileWriter(filename);
		writer.write(content);
		writer.close();
	}

	// reads content from a file
	public String readFromFile(String filename) throws IOException {
		return new String(Files.readAllBytes(Paths.get(filename)));
	}

	// checks if file exists
	public boolean fileExists(String filename) {
		File file = new File(filename);
		return file.exists();
	}
}
