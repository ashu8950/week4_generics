package collection_framework.Set.set_to_sorted;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class SetToSortedList {
    // Manual sorting logic (Bubble Sort)
    public List<Integer> convertAndManualSort(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // swap
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}
