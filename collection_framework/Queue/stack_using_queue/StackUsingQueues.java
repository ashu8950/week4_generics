package collection_framework.Queue.stack_using_queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        q1.add(x);
    }

    // Removes the element on top of the stack and returns it
    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");

        // Leave last element in q1
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove(); // Last element = top of stack

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    // Get the top element
    public int top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove(); // Last element
        q2.add(top); // Put it back

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    // Return whether the stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }
}