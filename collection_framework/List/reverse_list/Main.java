package collection_framework.List.reverse_list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
	public static void main(String[]args) {
		ArrayList<Integer>al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		LinkedList<Integer>ll = new LinkedList<>(Arrays.asList(1,2,3,4,5));
		ReverseAL.reverseAL(al);
		ReverseLL.reverseLL(ll);
		System.out.println("Revers arrayList :");
		System.out.println(al);
		System.out.println("Reverse LinkedList :");
		System.out.println(ll);
	}

	
}
