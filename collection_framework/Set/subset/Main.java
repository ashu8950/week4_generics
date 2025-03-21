package collection_framework.Set.subset;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));             // Subset
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));       // Superset

        SubsetChecker checker = new SubsetChecker();
        boolean isSubset = checker.isSubset(set1, set2);

        System.out.println("Is Set1 a subset of Set2? " + isSubset);
    }
}

