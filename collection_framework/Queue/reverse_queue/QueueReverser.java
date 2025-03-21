package collection_framework.Queue.reverse_queue;

import java.util.Queue;

public class QueueReverser {

    public void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        // Remove front element
        int front = queue.remove();

        // Recursively reverse remaining queue
        reverse(queue);

        // Add front element to rear
        queue.add(front);
    }
}

