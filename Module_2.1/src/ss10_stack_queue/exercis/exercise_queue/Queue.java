package ss10_stack_queue.exercis.exercise_queue;

import ss10_stack_queue.practice.queue_linked_list.Node;

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
