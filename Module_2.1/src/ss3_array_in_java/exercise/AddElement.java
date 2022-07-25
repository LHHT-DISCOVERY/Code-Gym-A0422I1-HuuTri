package ss3_array_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        int index;
        int value;
        for (int i = 0; i < 5; i++) {
            array[i] = i + 3;
        }
        System.out.println("Mảng : " + Arrays.toString(array));
        System.out.print("Nhập vị trí muốn chèn : ");
        index = scanner.nextInt();
        if (index < 0 || index > array.length - 1) {
            System.out.println("Không chèn được ");
        } else {
            System.out.print("Nhập giá trị muốn chèn : ");
            value = scanner.nextInt();
            for (int i = 5; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            System.out.println("Mảng sau khi chèn là : " + Arrays.toString(array));
        }
    }
}
