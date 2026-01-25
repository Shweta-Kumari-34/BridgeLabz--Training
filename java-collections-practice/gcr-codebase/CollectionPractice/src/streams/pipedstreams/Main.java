package streams.pipedstreams;
import java.io.*;
public class Main {
	    public static void main(String[] args) {

	        try {
	            PipedOutputStream pos = new PipedOutputStream();
	            PipedInputStream pis = new PipedInputStream(pos);

	            WriterThread writer = new WriterThread(pos);
	            ReaderThread reader = new ReaderThread(pis);

	            writer.start();
	            reader.start();

	        } catch (IOException e) {
	            System.out.println("Connection Error Occur");
	        }
	    }
	}



