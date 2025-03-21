package collection_framework.Set.subset;

import java.util.Set;

public class SubsetChecker {

    public boolean isSubset(Set<Integer> subset, Set<Integer> superset) {
        for (Integer element : subset) {
            if (!superset.contains(element)) {
                return false;
            }
        }
        return true;
    }
}

