package ss13_algorithm_search.practice;

import java.util.Scanner;

public class TestBinarySearchTree {
    public static void main(String[] args) {
        int[] a = {2,3,4,56,457,745,7,34,4545,54,5454,544445};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(BinaryTreeSearch.binaryTreeSearch(a , x));
    }
}
