package ss10_stack_queue.exercis.exercise_queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.deQueue();
        queue.enQueue(4);
        System.out.println("Deque : " + queue.deQueue().element);
        System.out.println("Deque : " + queue.deQueue().element);
    }

}
