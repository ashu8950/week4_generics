package collection_framework.List.rotator;

import java.util.List;
import java.util.ArrayList;

public class ListRotator {
    public List<Integer> rotateLeft(List<Integer> list, int positions) {
        int size = list.size();
        if (size == 0 || positions % size == 0) return list;

        positions = positions % size; // To handle positions > size

        List<Integer> rotated = new ArrayList<>();
        rotated.addAll(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));

        return rotated;
    }
}

