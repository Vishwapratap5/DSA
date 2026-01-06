package Problems;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingOneQueue {

    private Queue<Integer> q = new ArrayDeque<>();

    // Push → O(n)
    public void push(int x) {
        q.offer(x);

        int size = q.size();
        // rotate previous elements
        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }

    // Pop → O(1)
    public int pop() {
        if (q.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q.poll();
    }

    // Peek → O(1)
    public int peek() {
        if (q.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingOneQueue s = new StackUsingOneQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
