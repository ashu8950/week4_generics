package collection_framework.Set.set_to_sorted;

import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Set<Integer> inputSet = new HashSet<>();
        inputSet.add(5);
        inputSet.add(3);
        inputSet.add(9);
        inputSet.add(1);

        SetToSortedList converter = new SetToSortedList();
        // Using manual sort (bubble sort)
        List<Integer> manualSortedList = converter.convertAndManualSort(inputSet);
        System.out.println("Sorted List (Manual): " + manualSortedList);
    }
}
