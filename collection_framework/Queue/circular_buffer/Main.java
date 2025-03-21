package collection_framework.Queue.circular_buffer;

public class Main {
	  public static void main(String[] args) {
	        CircularBuffer cb = new CircularBuffer(3);

	        cb.insert(1);
	        cb.insert(2);
	        cb.insert(3);
	        cb.printBuffer(); // Output: [1, 2, 3]

	        cb.insert(4); 
	        cb.printBuffer(); // Output: [2, 3, 4]

	        cb.insert(5); 
	        cb.printBuffer(); // Output: [3, 4, 5]
	    }
	
}
