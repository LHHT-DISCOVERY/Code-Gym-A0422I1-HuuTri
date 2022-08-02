package ss9_arraylist_linkedlist.practice.arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyLsist<Integer> listInterger = new MyLsist<Integer>();

        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(5);
        listInterger.add(34);
        listInterger.add(343);

        System.out.println("element 4: "+listInterger.get(4));
        System.out.println("element 1: "+listInterger.get(1));
        System.out.println("element 2: "+listInterger.get(2));
    }
}
