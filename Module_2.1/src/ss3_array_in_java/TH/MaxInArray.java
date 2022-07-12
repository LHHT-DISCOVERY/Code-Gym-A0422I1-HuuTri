package ss3_array_in_java.TH;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        boolean isValidSize;
        do {
            System.out.print("Nhập vào kích thước mảng (0->20) : ");
            size = scanner.nextInt();
            isValidSize = size < 0 || size > 20;

            if (isValidSize) {
                System.out.println(" Vui lòng nhập size từ [0:20] .Xin nhập lại !! ");
            }
        } while (isValidSize);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập vào phần tử thứ [%d] : ", i);
            array[i] = scanner.nextInt();
        }
        System.out.print(" Mảng sau khi nhập là : ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i + 1 ;
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là : " + max + " Tại vị trí " + index);
    }
}
