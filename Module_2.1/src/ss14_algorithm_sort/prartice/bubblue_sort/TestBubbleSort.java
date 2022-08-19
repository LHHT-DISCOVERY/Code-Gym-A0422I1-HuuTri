package ss14_algorithm_sort.prartice.bubblue_sort;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] a = {2,1,6,4,3,7};
        BubbleSort.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
