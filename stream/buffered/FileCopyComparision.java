package stream.buffered;

import java.io.*;

public class FileCopyComparision {
    private static final int BUFFER_SIZE = 4096; // 4KB

    public static void main(String[] args) {
        String sourcePath = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\stream\\buffered\\sourcePath";
        String destUnbuffered = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\stream\\buffered\\destUnbuffered";
        String destBuffered = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\stream\\buffered\\destBuffered";

        // Unbuffered Copy
        long startUnbuffered = System.nanoTime();
        copyWithUnbufferedStream(sourcePath, destUnbuffered);
        long endUnbuffered = System.nanoTime();

        // Buffered Copy
        long startBuffered = System.nanoTime();
        copyWithBufferedStream(sourcePath, destBuffered);
        long endBuffered = System.nanoTime();

        // Report time in milliseconds
        System.out.println("\nExecution Time:");
        System.out.println("Unbuffered Stream: " + (endUnbuffered - startUnbuffered) / 1_000_000 + " ms");
        System.out.println("Buffered Stream:   " + (endBuffered - startBuffered) / 1_000_000 + " ms");
    }

    private static void copyWithUnbufferedStream(String source, String destination) {
        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Unbuffered copy completed.");

        } catch (IOException e) {
            System.err.println("Unbuffered stream error: " + e.getMessage());
        }
    }

    private static void copyWithBufferedStream(String source, String destination) {
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("Buffered copy completed.");

        } catch (IOException e) {
            System.err.println("Buffered stream error: " + e.getMessage());
        }
    }
}
