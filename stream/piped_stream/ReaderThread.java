package stream.piped_stream;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReaderThread extends Thread {
    private final PipedInputStream input;

    public ReaderThread(PipedInputStream input) {
        this.input = input;
    }

    // Reads data from the pipe
    public void run() {
        try {
            int data;
            System.out.print("Reader received: ");
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }
            input.close();
        } catch (IOException e) {
            System.err.println("Reader error: " + e.getMessage());
        }
    }
}

