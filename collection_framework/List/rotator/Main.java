package collection_framework.List.rotator;
import java.util.List;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;

        ListRotator rotator = new ListRotator();
        List<Integer> rotated = rotator.rotateLeft(inputList, rotateBy);

        System.out.println("Rotated List: " + rotated);
	}
}
