package stream.read_large_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ErrorLogFilter {

    // Reads a file line by line and prints lines containing "error"
    public void filterErrors(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        }
    }
}

