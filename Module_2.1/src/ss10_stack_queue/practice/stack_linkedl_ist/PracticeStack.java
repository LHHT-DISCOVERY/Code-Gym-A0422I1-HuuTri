package ss10_stack_queue.practice.stack_linkedl_ist;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class PracticeStack<T> {
    private LinkedList<T> stack;

    public PracticeStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        PracticeStack<String> stringPracticeStack = new PracticeStack<>();
        stringPracticeStack.push("five");
        stringPracticeStack.push("for");
        stringPracticeStack.push("three");
        stringPracticeStack.push("two");
        stringPracticeStack.push("one");
        System.out.print("Stack then POP : ");
        while (!stringPracticeStack.isEmpty()) {
            System.out.print(stringPracticeStack.pop() + " ");
        }
    }
}
