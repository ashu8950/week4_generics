package collection_framework.Map.highest_value_key;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();
        data.put("A", 10);
        data.put("B", 20);
        data.put("C", 15);

        MaxValueKeyFinder finder = new MaxValueKeyFinder();
        String maxKey = finder.findMaxKey(data);

        System.out.println("Key with maximum value: " + maxKey);
    }
}
