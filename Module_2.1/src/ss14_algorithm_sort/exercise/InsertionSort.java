package ss14_algorithm_sort.exercise;

public class InsertionSort {
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(a[j] < a[j-1]){
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }else {
                    break;
                }
            }
        }
    }
}
