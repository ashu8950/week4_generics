package collection_framework.Map.invert_map;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        MapInverter inverter = new MapInverter();
        Map<Integer, List<String>> invertedMap = inverter.invertMap(originalMap);

        System.out.println("Inverted Map: " + invertedMap);
    }
}
