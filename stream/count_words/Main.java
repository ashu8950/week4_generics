package stream.count_words;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\stream\\count_words\\input";

        WordFrequencyCounter counter = new WordFrequencyCounter();

        try {
            counter.countWords(filePath);
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }
    }
}

