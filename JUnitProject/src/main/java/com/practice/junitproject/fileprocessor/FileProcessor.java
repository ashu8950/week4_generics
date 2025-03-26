package com.practice.junitproject.fileprocessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileProcessor {

    /**
     * Writes the given content to a file.
     * @param filename The name of the file.
     * @param content The content to write.
     * @throws IOException If an I/O error occurs.
     */
    public static void writeToFile(String filename, String content) throws IOException {
        Files.write(Path.of(filename), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    /**
     * Reads content from a file.
     * @param filename The name of the file.
     * @return The file content as a string.
     * @throws IOException If the file does not exist.
     */
    public static String readFromFile(String filename) throws IOException {
        return Files.readString(Path.of(filename));
    }
}

