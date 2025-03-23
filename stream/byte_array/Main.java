package stream.byte_array;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    /**
     * Main method to:
     * 1. Convert an image to byte array.
     * 2. Convert byte array back to a new image.
     * 3. Optionally compare both files for equality.
     */
    public static void main(String[] args) {
        
        String originalImagePath = "C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot 2024-10-10 141522.png";   
        String outputImagePath = "C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot_Copy.png";        

        ImageToByteArray converterToBytes = new ImageToByteArray();
        ByteArrayToImage converterToImage = new ByteArrayToImage();

        try {
            // Step 1: Convert image file to byte array
            byte[] imageBytes = converterToBytes.convert(originalImagePath);

            // Step 2: Write byte array to a new image file
            converterToImage.convert(imageBytes, outputImagePath);

            System.out.println("Image conversion completed successfully.");

            // Step 3: Verify both files are identical
            boolean isSame = Arrays.equals(
                Files.readAllBytes(Paths.get(originalImagePath)),
                Files.readAllBytes(Paths.get(outputImagePath))
            );

            System.out.println("Files are identical: " + isSame);

        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }
}
