package collection_framework.Set.symettric_difference;
import java.util.Set;
import java.util.HashSet;

public class SetSymmetricDifference {
    public Set<Integer> getSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        // Add elements from set1 that are not in set2
        for (Integer item : set1) {
            if (!set2.contains(item)) {
                result.add(item);
            }
        }

        // Add elements from set2 that are not in set1
        for (Integer item : set2) {
            if (!set1.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }
}
