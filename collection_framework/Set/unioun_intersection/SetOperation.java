package collection_framework.Set.unioun_intersection;

import java.util.Set;
import java.util.HashSet;

public class SetOperation{

    public Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        // Add all elements from set1
        for (Integer item : set1) {
            result.add(item);
        }

        // Add elements from set2 if not already in result
        for (Integer item : set2) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        // Add only elements that are in both sets
        for (Integer item : set1) {
            if (set2.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }
}

