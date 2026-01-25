package junit.testingfilehandlingmethods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileProcessorTest {
	FileProcessor processor = new FileProcessor();
	String filename = "testfile.txt";
	String content = "Hello JUnit File Testing";

	// test writing and reading file content
	@Test
	void testWriteAndReadFile() throws IOException {
		processor.writeToFile(filename, content);
		String result = processor.readFromFile(filename);

		assertEquals(content, result);
	}

	// test if file exists after writing
	@Test
	void testFileExists() throws IOException {
		processor.writeToFile(filename, content);

		assertTrue(processor.fileExists(filename));
	}

	// test exception when file does not exist
	@Test
	void testReadFileNotFound() {
		assertThrows(IOException.class, () -> {
			processor.readFromFile("nofile.txt");
		});
	}
}
