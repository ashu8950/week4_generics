package collection_framework.Set.set_equal;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        SetComparator comparator = new SetComparator();
        boolean isEqual = comparator.areSetsEqual(set1, set2);

        System.out.println("Are sets equal? " + isEqual);
    }
}
