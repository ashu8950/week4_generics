package com.practice.junitproject.fileprocessor_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.practice.junitproject.fileprocessor.FileProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {
    private static final String TEST_FILE = "C:\\Users\\DELL\\Desktop\\Generic\\JUnitProject\\src\\test\\java\\com\\practice\\junitproject\\fileprocessor_test\\testfile.txt";// Test file name

    /**
     * Tests if content is correctly written and read.
     */
    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        FileProcessor.writeToFile(TEST_FILE, content);
        
        String result = FileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, result, "File content should match");
    }

    /**
     * Tests if the file exists after writing.
     */
    @Test
    void testFileExistsAfterWrite() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Sample Data");
        assertTrue(Files.exists(Path.of(TEST_FILE)), "File should exist after writing");
    }

    /**
     * Tests exception handling when reading a non-existent file.
     */
    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }

    /**
     * Cleanup: Deletes the test file after each test.
     */
    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Path.of(TEST_FILE));
    }
}
