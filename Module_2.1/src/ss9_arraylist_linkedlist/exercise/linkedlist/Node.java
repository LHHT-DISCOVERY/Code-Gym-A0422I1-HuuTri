package ss9_arraylist_linkedlist.exercise.linkedlist;

public class Node<E> {
    E element;
    Node<E> next;

    public Node() {
    }

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public Node(E element) {
        this.element = element;
    }
}

