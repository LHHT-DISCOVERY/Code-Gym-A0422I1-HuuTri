package ss13_algorithm_search.practice;

public class BinaryTreeSearch {
    public static int binaryTreeSearch(int[] a, int x) {
        int left = 0 , mid, right = a.length -1 ;
        while (left <= right) {
            mid = (left + right) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
