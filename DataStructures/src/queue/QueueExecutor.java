package queue;

import java.util.Queue;

public class QueueExecutor {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(10);
        queue.enqueue(20);

        queue.printStack();
    }
}
