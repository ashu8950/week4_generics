package collection_framework.List.frq;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//counting  frequency method
public class CountFrq {
	static Map<String, Integer> getFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        return freqMap;
    }
}
