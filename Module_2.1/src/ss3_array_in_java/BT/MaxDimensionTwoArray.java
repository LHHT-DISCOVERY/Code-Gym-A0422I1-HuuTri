package ss3_array_in_java.BT;

import java.util.Arrays;
import java.util.Scanner;

public class MaxDimensionTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] array = {{1, 2, 4}, {4, 5, 5}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
            System.out.println();
        }
        System.out.print("Nhập vào giá trị bạn muốn tìm : ");
        float a = Float.parseFloat(scanner.nextLine());
        boolean isFlag = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (a == array[i][j]) {
                    System.out.print("Tồn tại giá trị " + a);
                    System.out.println(" Tại vị trí " + " Hàng " + i + " Cột " + j);
                    isFlag = true;
                }
            }
        }
        if (isFlag == false) {
            System.out.println(" Giá trị " + a + " vừa nhập ko tồn tại trong mảng trên ");
        }

    }
}
