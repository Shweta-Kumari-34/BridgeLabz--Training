package streams.bufferedstreams;

import java.io.*;

public class EfficientFileCopy {

	public static void main(String[] args) {

		String source = "D:\\java file\\QuizApplication.java";
		String destUnbuffered = "D:\\java file\\DigitFrequency.java";
		String destBuffered = "D:\\java file\\FibonacciSequence .java";

		// Unbuffered copy
		//try block put code that generate exception
		try {
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(destUnbuffered);

			long start = System.nanoTime();
			int b;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
			long end = System.nanoTime();

			fis.close();
			fos.close();

			System.out.println("Unbuffered copy time taken: " + (end - start) / 1000000 + " ms");

		}
		//catch block prevent abnormal termination of program
		catch (IOException e) {
			System.out.println("Error in unbuffered while copying: " + e.getMessage());
		}

		// Buffered copy
		////try block put code that generate exception
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destBuffered));

			byte[] buffer = new byte[4096]; 
			int bytesRead;

			long start = System.nanoTime();
			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}
			long end = System.nanoTime();

			bis.close();
			bos.close();

			System.out.println("Buffered copy time taken: " + (end - start) / 1_000_000 + " ms");

		}
		//catch block prevent abnormal termination of program
		catch (IOException e) {
			System.out.println("Error in buffered while copying: " + e.getMessage());
		}
	}
}
