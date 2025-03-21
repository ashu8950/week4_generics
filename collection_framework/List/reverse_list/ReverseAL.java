package collection_framework.List.reverse_list;
import java.util.ArrayList;
public class ReverseAL {
	static void reverseAL(ArrayList<Integer>al) {
		int i=0;
		int j = al.size()-1;
		while(i<j) {
			int temp = al.get(i);
	        al.set(i, al.get(j));
	        al.set(j, temp);
	        i++;
	        j--;
		}
	}
}
