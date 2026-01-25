package streams.pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {

    PipedOutputStream pos;

    WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        try {
            pos.write("Hello from Writer Thread".getBytes());
            pos.close();
        } catch (IOException e) {
            System.out.println("Write Error Occur");
        }
    }

}
