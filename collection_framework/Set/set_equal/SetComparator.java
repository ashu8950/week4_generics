package collection_framework.Set.set_equal;
import java.util.Set
;public class SetComparator {
    public <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        return set1.equals(set2);
    }
}
