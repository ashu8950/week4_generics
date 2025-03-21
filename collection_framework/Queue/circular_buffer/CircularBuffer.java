package collection_framework.Queue.circular_buffer;

public class CircularBuffer {
	private int[] buffer;
    private int capacity;
    private int start = 0; // points to oldest element
    private int size = 0;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }

    public void insert(int value) {
        int end = (start + size) % capacity;
        buffer[end] = value;

        if (size < capacity) {
            size++;
        } else {
            // Buffer full, overwrite oldest → move start forward
            start = (start + 1) % capacity;
        }
    }

    public void printBuffer() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            int index = (start + i) % capacity;
            System.out.print(buffer[index]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
