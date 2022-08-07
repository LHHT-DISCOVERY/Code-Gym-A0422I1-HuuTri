package ss9_arraylist_linkedlist.practice.linkedlist;

class MyLinkedList<E> {
    Node<E> head, tail;
    int size;

    private static class Node<E> {
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

    public void addFist(E element) {
        Node<E> firstNode = new Node<E>(element);
        if (head == null) {
            head = tail = firstNode;
        } else {
            firstNode.next = head;
            head = firstNode;
        }
        size++;
    }

    public void addLast(E element) {
        Node<E> lastNode = new Node<>(element);
        if (head == null) {
            head = tail = lastNode;
        } else {
            tail.next = lastNode;
            tail = lastNode;
        }
        size++;
    }

    private void checkEmpty() {
        if (size == 0) {
            throw new IllegalStateException("Link list is empty ");
        }
    }

    public void removeFistElement() {
        checkEmpty();
        head = head.next;
        size--;
    }

    public void removeLastElement() {
        checkEmpty();
        while (head != null) {
            if (head.next != tail) {
                head = head.next;
            } else {
                head.next = null;
                tail = head;
            }
        }
    }

    public E getFist() {
        checkEmpty();
        return head.element;
    }

    public E getLast() {
        checkEmpty();
        return tail.element;
    }

    public void PrintLinkedList(Node<E> head) {
        if (head == null) {
            System.out.println("Link list is empty");
        } else {
            Node<E> tempt = head;
            while (tempt != null) {
                System.out.println(tempt.element);
                tempt = tempt.next;
                if (tempt != null) {
                    System.out.println("->");
                } else {
                    System.out.println();
                }
            }
        }
    }
}
