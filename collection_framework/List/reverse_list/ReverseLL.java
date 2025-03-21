package collection_framework.List.reverse_list;
import java.util.LinkedList;
public class ReverseLL {
	static void reverseLL(LinkedList<Integer>ll) {
		 int i = 0;
	        int j = ll.size() - 1;

	        while (i < j) {
	            // Swap elements at i and j
	            int temp = ll.get(i);
	            ll.set(i, ll.get(j));
	            ll.set(j, temp);

	            i++;
	            j--;
	        }
	}
}
