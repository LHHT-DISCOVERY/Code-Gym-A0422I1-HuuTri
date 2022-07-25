package ss3_array_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        int input;
        while (choice != 0) {
            System.out.println("Mảng : " + Arrays.toString(array));
            System.out.println("--Menu--");
            System.out.println("1 . xóa phàn tử ");
            System.out.println("0 . thoát chương trình ");
            System.out.print("Nhập vào lưa chọn của bạn : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị muốn xóa : ");
                    input = scanner.nextInt();
                    boolean isFlag = false;
                    for (int i = 0; i < array.length; i++) {
                        if (input == array[i]) {
                            isFlag = true;
                            for (int j = i; j < array.length - 1; j++) {
                                array[j] = array[j + 1];
                                array[j + 1] = 0;
                            }
                            System.out.println("Mảng sau khi xóa là : " + Arrays.toString(array));
                        }
                    }
                    if (!isFlag) {
                        System.out.println("Mảng không tồn tại giá trị " + input);
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập đúng mục trên menu");
            }
        }
    }
}
