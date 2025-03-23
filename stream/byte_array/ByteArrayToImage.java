package stream.byte_array;

import java.io.*;

public class ByteArrayToImage {

    /**
     * Converts a byte array back to an image file.
     *
     * @param imageBytes Byte array containing image data.
     * @param outputPath Path where the new image file should be saved.
     * @throws IOException If file writing fails.
     */
    public void convert(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}

