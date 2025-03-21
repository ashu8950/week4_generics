package collection_framework.Queue.reverse_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        QueueReverser reverser = new QueueReverser();
        reverser.reverse(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
