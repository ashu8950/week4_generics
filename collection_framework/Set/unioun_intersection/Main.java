package collection_framework.Set.unioun_intersection;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        SetOperation operations = new SetOperation();

        Set<Integer> union = operations.getUnion(set1, set2);
        Set<Integer> intersection = operations.getIntersection(set1, set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
