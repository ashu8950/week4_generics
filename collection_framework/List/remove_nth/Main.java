package collection_framework.List.remove_nth;
import java.util.Arrays;
import java.util.LinkedList;
public class Main {
	public static void main(String[]args) {
		LinkedList<Character>ll = new LinkedList<>(Arrays.asList('A','B','C','D','E'));
		int N = 2;
		char ch = NthNode.getNthNode(ll,N);
		System.out.println(ch);
	}
}
