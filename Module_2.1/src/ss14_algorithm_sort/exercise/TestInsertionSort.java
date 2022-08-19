package ss14_algorithm_sort.exercise;

import java.util.Arrays;

public class TestInsertionSort {
    public static void main(String[] args) {
        int[] a = {1,7,6,2,3,4,8,5};
        InsertionSort.insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
