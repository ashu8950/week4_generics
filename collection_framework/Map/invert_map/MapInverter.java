package collection_framework.Map.invert_map;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class MapInverter {

    public Map<Integer, List<String>> invertMap(Map<String, Integer> original) {
        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> entry : original.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (!inverted.containsKey(value)) {
                inverted.put(value, new ArrayList<>());
            }

            inverted.get(value).add(key);
        }

        return inverted;
    }
}

