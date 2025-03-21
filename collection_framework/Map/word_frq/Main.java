package collection_framework.Map.word_frq;

import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      String filePath = "C:\\Users\\DELL\\Desktop\\Generic\\genericCollection\\src\\collection_framework\\Map\\word_frq\\input.txt";

        WordFrequencyCounter counter = new WordFrequencyCounter();

        try {
            String text = counter.readFile(filePath);
            Map<String, Integer> frequencies = counter.countWords(text);
            System.out.println("Word Frequencies: " + frequencies);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
