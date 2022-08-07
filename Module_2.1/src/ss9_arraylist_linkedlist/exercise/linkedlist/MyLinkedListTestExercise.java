package ss9_arraylist_linkedlist.exercise.linkedlist;

public class MyLinkedListTestExercise {
    public static void main(String[] args) {
        MyLinkedListExercise<Integer> integerNode = new MyLinkedListExercise<>();

        // Method add in linked list
        integerNode.addLast(3);
        integerNode.addLast(4);
        integerNode.addLast(4);
        integerNode.addLast(5);
        integerNode.addLast(6);
        integerNode.addLast(7);
        integerNode.addLast(8);
        integerNode.addLast(9);
        integerNode.addFist(2);
        integerNode.addFist(1);
        integerNode.add(0, 0);

        // Print linked list
        System.out.print("Linked List then Input : ");
        integerNode.PrintLinkedList(integerNode.head);
        System.out.println("------------------------");

        // print size
        System.out.println("Linked List Size : " + integerNode.size());
        System.out.println("------------------------");

        // method remove
        System.out.print("remove first element is : " + integerNode.getFist());
        integerNode.removeFistElement();
        System.out.println();
        System.out.print("remove last element is : " + integerNode.getLast());
        integerNode.removeLastElement();
        System.out.println();
        System.out.println("remove element is : 4 ");
        integerNode.remove(4);
        System.out.print("remove element index [3]  : " + integerNode.getIndex(3));
        integerNode.removeElementIndex(3);
        System.out.println();
        System.out.print("Linked List then Remove : ");
        integerNode.PrintLinkedList(integerNode.head);
        System.out.println("------------------------");

        // contain
        System.out.println("value is : " + integerNode.contain(558));
        System.out.println("value is : " + integerNode.contain(2));
        System.out.println("------------------------");

        // indexOf
        System.out.println("Index : " + integerNode.indexOf(5));
        System.out.println("Index : " + integerNode.indexOf(23));
        System.out.println("------------------------");

        //clone
        System.out.print("Then clone : ");
        MyLinkedListExercise<Integer> myLinkedListExerciseClone = integerNode.clone();
        myLinkedListExerciseClone.PrintLinkedList(myLinkedListExerciseClone.head);
        System.out.println("------------------------");

        // get first , get last
        System.out.println("Get first : " + myLinkedListExerciseClone.getFist());
        System.out.println("Get last : " + myLinkedListExerciseClone.getLast());
        System.out.println("Get element at index [3]: " + myLinkedListExerciseClone.getIndex(3));
        System.out.println("------------------------");

        // clear
        integerNode.clear();
        integerNode.PrintLinkedList(integerNode.head);
        System.out.println(integerNode.size());
        System.out.println("-----------The End-------------");

    }
}
