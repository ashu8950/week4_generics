package stream.byte_array;

import java.io.*;

public class ImageToByteArray {

    /**
     * Converts an image file to a byte array.
     *
     * @param imagePath Path to the input image file.
     * @return Byte array representing the image data.
     * @throws IOException If file reading fails.
     */
    public byte[] convert(String imagePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }
}
