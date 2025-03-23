package stream.piped_stream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {

    public static void main(String[] args) {
        try {
            PipedOutputStream output = new PipedOutputStream();
            PipedInputStream input = new PipedInputStream(output); // Connect streams

            WriterThread writer = new WriterThread(output);
            ReaderThread reader = new ReaderThread(input);

            reader.start();
            writer.start();

        } catch (IOException e) {
            System.err.println("Pipe setup error: " + e.getMessage());
        }
    }
}
