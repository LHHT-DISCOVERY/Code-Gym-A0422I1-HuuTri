package ss9_arraylist_linkedlist.exercise.project_arraylist;

public class MyListTest1 {
    public static void main(String[] args) {
        MyList<Integer> integerMyLists = new MyList<Integer>();
        // thêm ở vị trí cuối cùng
        System.out.println(" ----- Array before ----- ");
        integerMyLists.add(5);
        integerMyLists.add(6);
        integerMyLists.add(7);
        integerMyLists.add(8);
        for (int i = 0; i < integerMyLists.size(); i++) {
            System.out.printf("Element [%d] is : " + integerMyLists.get(i), i);
            System.out.println();
        }

        // add ở vị trí bất kì
        integerMyLists.add(0, 0);
        integerMyLists.add(1, 1);
        integerMyLists.add(2, 2);
        integerMyLists.add(3, 3);
        System.out.println(" ----- Array then ----- ");
        for (int i = 0; i < integerMyLists.size(); i++) {
            System.out.printf("Element [%d] is : " + integerMyLists.get(i), i);
            System.out.println();
        }

        // array remove
        System.out.println("-------------IndexOf--------------");
        System.out.println("Array remove value is : " + integerMyLists.remove(3));
        System.out.println("Array remove value is : " + integerMyLists.remove(3));
        System.out.println("Array then remove ");
        for (int i = 0; i < integerMyLists.size(); i++) {
            System.out.printf("Element [%d] is : " + integerMyLists.get(i), i);
            System.out.println();
        }

        // array size
        System.out.println("-------------size--------------");
        System.out.println("Array size : " + integerMyLists.size() + " element ");

        // clone
        System.out.println("-------------clone--------------");
        MyList<Integer> newList = integerMyLists.clone();
        for (int i = 0; i < newList.size(); i++) {
            System.out.printf("Element [%d] is : " + newList.get(i), i);
            System.out.println();
        }

        // IndexOf
        System.out.println("-------------IndexOf--------------");
        System.out.println(" Index of value 7  index is : " + integerMyLists.indexOf(7));
        System.out.println(" Index of value 74 index is : " + integerMyLists.indexOf(74));

        // Contains
        System.out.println("-------------Contains--------------");
        System.out.println("Contains value 8 is Integer My List ? : " + integerMyLists.contains(8));
        System.out.println("Contains value 88 is Integer My List ? : " + integerMyLists.contains(88));


        // clear
        System.out.println("-------------clear--------------");
        integerMyLists.clear();
        System.out.println("integerMyLists then clear()");
        for (int i = 0; i < integerMyLists.size(); i++) {
            System.out.printf("Element [%d] is : " + integerMyLists.get(i), i);
            System.out.println();
        }
        System.out.println("\" Clear up \"");
    }

}
