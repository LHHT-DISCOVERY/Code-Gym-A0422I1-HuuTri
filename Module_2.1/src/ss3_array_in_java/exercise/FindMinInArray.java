package ss3_array_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào kích thước mảng ");
        n = scanner.nextInt();
        int[] array = new int[n];
        inputAndShowArray(array);
        System.out.println("Giá trị nhỏ nhất của mảng là : " + minArray(array));
    }

    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void inputAndShowArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là : " + Arrays.toString(array));
    }
}
