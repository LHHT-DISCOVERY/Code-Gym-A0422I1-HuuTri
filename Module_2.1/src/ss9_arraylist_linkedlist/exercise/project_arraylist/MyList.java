package ss9_arraylist_linkedlist.exercise.project_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        checkIndex(index);
        insert(index, element);
    }

    private void checkIndex(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException(String.format("Index out of bound : %d for size : %d ", index, this.size));
        }
    }

    private void insert(int index, E element) {
        if (this.size == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.elements.length * 2);
        }
        for (int i = this.size; i > index + 1; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = element;
        this.size++;
    }

    // E setElement
    public void setElement(Object[] elements) {
        this.elements = elements;
    }

    // E remove index
    public E remove(int index) {
        checkIndex(index);
        E element = getElement(index);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        this.size--;
        return element;
    }

    // size
    public int size() {
        return size;
    }

    // clone
    public MyList<E> clone() {
        MyList<E> newList = new MyList<>(elements.length);
        for (int i = 0; i < size(); i++) {
            newList.add(getElement(i));
        }
        return newList;
    }

    // indexOf
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // add E element
    public boolean add(E element) {
        if (elements.length == size) {
            elements = Arrays.copyOf(this.elements, this.elements.length * 2);
        }
        elements[size++] = element;
        return true;
    }

    // E getElement
    private E getElement(int index) {
        return (E) elements[index];
    }

    // E get
    public E get(int index) {
        checkIndex(index);
        return getElement(index);
    }

    // contains
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    // ensureCapacity

    // clear
    public void clear() {
        elements = new MyList[0];
        size = 0;
    }
}
