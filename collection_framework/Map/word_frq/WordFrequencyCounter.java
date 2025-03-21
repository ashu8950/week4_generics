package collection_framework.Map.word_frq;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder content = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append(" ");
        }

        reader.close();
        return content.toString();
    }

    public Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordMap = new HashMap<>();

        // Clean text: lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

        String[] words = text.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                if (wordMap.containsKey(word)) {
                    wordMap.put(word, wordMap.get(word) + 1);
                } else {
                    wordMap.put(word, 1);
                }
            }
        }

        return wordMap;
    }
}
