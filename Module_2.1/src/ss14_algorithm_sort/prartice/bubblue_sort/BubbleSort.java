package ss14_algorithm_sort.prartice.bubblue_sort;

public class BubbleSort {
    public static void bubbleSort(int[] a) {
        for (int i = 0 ; i < a.length-1 ; i++){
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
    }
}
