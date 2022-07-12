package ss3_array_in_java.BT;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 0, 0, 0, 0, 0, 0};
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        int index;
        int value;
        while (choice != 0) {
            System.out.println("Mảng : " + Arrays.toString(array));
            System.out.println("--Menu--");
            System.out.println("1 . chèn phần tử ");
            System.out.println("0 . thoát chương trình ");
            System.out.print("Nhập vào lưa chọn của bạn : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập vị trí muốn chèn : ");
                    index = scanner.nextInt();
                    System.out.print("Nhập giá trị muốn chèn : ");
                    value = scanner.nextInt();
                    if (index < 0 || index >= array.length - 1) {
                        System.out.println("Không chèn được");
                    } else {
                        int temp = array[index];
                        array[index] = value;
                        for (int i = index+1; i < array.length; i++) {
                            array[i] = temp;
                            array[i+1] = array[i];
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
