package collection_framework.List.frq;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> frequencyMap = CountFrq.getFrequency(input);
        
        //displaying of frq map
        System.out.println(frequencyMap); 
    }

    
}
