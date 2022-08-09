package ss10_stack_queue.exercise.exerscise_queue;

public class Queue<E> {
    NodeQueue<E> front, rear;
    int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (rear == null && front == null);
    }

    public void enQueue(E element) {
        NodeQueue<E> tempt = new NodeQueue<E>(element);
        if (this.rear == null) {
            this.front = this.rear = tempt;
            return;
        }
        this.rear.next = tempt;
        this.rear = tempt;

    }

    public NodeQueue<E> deQueue() {
        if (this.front == null)
            return null;
        NodeQueue<E> tempt = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return tempt;
    }
}
