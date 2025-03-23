package stream.piped_stream;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {
    private final PipedOutputStream output;

    public WriterThread(PipedOutputStream output) {
        this.output = output;
    }

    // Writes data to the pipe
    public void run() {
        String message = "Hello from WriterThread!";
        try {
            output.write(message.getBytes());
            output.close();
        } catch (IOException e) {
            System.err.println("Writer error: " + e.getMessage());
        }
    }
}

