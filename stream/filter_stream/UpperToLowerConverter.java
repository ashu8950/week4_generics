package stream.filter_stream;

import java.io.*;

public class UpperToLowerConverter {

    // Converts uppercase letters in a file to lowercase and writes to a new file
    public void convertToLowercase(String sourceFile, String destinationFile) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(sourceFile), "UTF-8"));
            BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(destinationFile), "UTF-8"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
        }
    }
}

