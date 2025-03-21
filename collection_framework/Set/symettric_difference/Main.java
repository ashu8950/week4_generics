package collection_framework.Set.symettric_difference;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        SetSymmetricDifference sDiff = new SetSymmetricDifference();
        Set<Integer> result = sDiff.getSymmetricDifference(set1, set2);

        System.out.println("Symmetric Difference: " + result);
    }
}