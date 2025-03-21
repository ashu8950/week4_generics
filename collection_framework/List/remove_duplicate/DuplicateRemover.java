package collection_framework.List.remove_duplicate;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class DuplicateRemover {
	//method for removing duplicate
    public List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>();
        seen.addAll(list);
        return new ArrayList<>(seen);
    }
}