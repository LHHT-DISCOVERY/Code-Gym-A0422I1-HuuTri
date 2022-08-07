package ss9_arraylist_linkedlist.exercise.linkedlist;

class MyLinkedListExercise<E> {
    Node<E> head, tail;
    int size;

    //method addFist
    public void addFist(E element) {
        Node<E> newNode = new Node<E>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //method addLast
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

    //method checkIndex
    public void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(" ERROR ");
        }
    }

    //method add at index
    public void add(int index, E element) {
        checkIndex(index);
        if (index == 0) {
            addFist(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node<E> newNode = new Node<>(element);
            Node<E> current = head;
            int count = 0;
            while (current != null) {
                count++;
                if (count == index) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
            }
        }
        size++;
    }

    // method check linked list empty
    public void checkEmpty() {
        if (size == 0) {
            throw new IllegalStateException("Link list is empty ");
        }
    }

    // method remove at index
    public void removeElementIndex(int index) {
        checkEmpty();
        checkIndex(index);
        if (index == 0) {
            removeFistElement();
        } else if (index == size) {
            removeLastElement();
        } else {
            Node<E> current = head;
            Node<E> period = null;
            int count = 0;
            while (current.next != null) {
                if (index == count) {
                    period.next = current.next;
                    break;
                }
                period = current;
                current = current.next;
                count++;
            }
        }
    }

    // method remove at element
    public void remove(E element) {
        checkEmpty();
        if (head.element.equals(element)) {
            removeFistElement();
        } else {
            Node<E> current = head;
            Node<E> period = null;
            while (current.next != null) {

                if (current.element.equals(element)) {
                    if (period != null) {
                        period.next = current.next;
                        // vì current = current.next
                        // => current.next <=> current.next.next
                    }
                    break;
                }
                period = current;
                current = current.next;
            }
            size--;
        }
    }

    // method remove FistElement
    public void removeFistElement() {
        checkEmpty();
        head = head.next;
        size--;
    }

    //method remove last element
    public void removeLastElement() {
        checkEmpty();
        Node<E> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
    }

    //method getFist
    public E getFist() {
        checkEmpty();
        return head.element;
    }

    // method get last
    public E getLast() {
        checkEmpty();
        return tail.element;
    }

    // method get index
    public E getIndex(int index) {
        checkIndex(index);
        int n = size - 1;
        if (index == 0) {
            getFist();
        } else if (index == n) {
            return tail.element;
        } else {
            Node<E> checkIndex = head;
            int count = 0;
            while (checkIndex.next != null) {
                if (count == index) {
                    return checkIndex.element;
                }
                checkIndex = checkIndex.next;
                count++;
            }

        }
        return null;
    }

    // method get size
    int size() {
        return size;
    }

    // method clone
    public MyLinkedListExercise<E> clone() {
        checkEmpty();
        Node<E> nodeClone = head;
        MyLinkedListExercise<E> cloneMyLinkedList = new MyLinkedListExercise<>();
        while (nodeClone != null) {
            cloneMyLinkedList.addLast(nodeClone.element);
            nodeClone = nodeClone.next;
        }
        return cloneMyLinkedList;
    }

    //method check element
    public boolean contain(E element) {
        Node<E> nodeCheck = head;
        while (nodeCheck != null) {
            if (nodeCheck.element.equals(element)) {
                return true;
            }
            nodeCheck = nodeCheck.next;
        }
        return false;
    }

    // method search element anh get index of element
    public int indexOf(E element) {
        Node<E> nodeCheck = head;
        int i = 0;
        while (nodeCheck != null) {
            if (nodeCheck.element.equals(element)) {
                return i;
            }
            nodeCheck = nodeCheck.next;
            i++;
        }
        return -1;
    }

    //method clear
    public void clear() {
        Node<E> tempt = head;
        while (tempt != null) {
            tempt.element = null;
            tempt = tempt.next;
        }
        size = 0;
    }

    // print linked list
    public void PrintLinkedList(Node<E> head) {
        if (head == null) {
            System.out.println("Link list is empty");
        } else {
            Node<E> tempt = head;
            while (tempt != null) {
                System.out.print(tempt.element);
                tempt = tempt.next;
                if (tempt != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }
}