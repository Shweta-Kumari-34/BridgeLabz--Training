package streams.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReaderThread extends Thread {

    PipedInputStream pis;

    ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        try {
            int data;
            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }
            pis.close();
        } catch (IOException e) {
            System.out.println("Read Error Occur");
        }
    }
}