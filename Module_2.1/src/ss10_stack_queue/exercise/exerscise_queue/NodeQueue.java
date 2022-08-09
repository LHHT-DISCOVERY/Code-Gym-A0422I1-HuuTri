package ss10_stack_queue.exercise.exerscise_queue;

public class NodeQueue<E> {
    E element;
    NodeQueue<E> next;

    public NodeQueue(E element, NodeQueue<E> next) {
        this.element = element;
        this.next = next;
    }

    public NodeQueue() {
    }

    public NodeQueue(E element) {
        this.element = element;
    }
}
