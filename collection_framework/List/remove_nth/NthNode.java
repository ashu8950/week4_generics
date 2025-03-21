package collection_framework.List.remove_nth;
import java.util.LinkedList;
public class NthNode {
	static char getNthNode(LinkedList<Character>ll,int n) {
		int size = ll.size();
		int pos = size - n;
		
		return ll.get(pos);
	}
}
