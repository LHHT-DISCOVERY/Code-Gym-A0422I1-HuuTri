package ss3_array_in_java.TH;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in) ;
        boolean inValidSize;
        do {
            System.out.print("Nhập vào kích thước mảng (0->20) : ");
            size = scanner.nextInt();
            inValidSize = size < 0 || size > 20;

            if (inValidSize) {
                System.out.println(" Vui lòng nhập size từ [0:20] .Xin nhập lại !! ");
            }
        } while (inValidSize);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập vào phần tử thứ [%d] : ", i);
            array[i] = scanner.nextInt();
        }
        System.out.print(" Mảng sau khi nhập là : ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.print(" Mảng sau khi đảo ngược là : ");
        for (int j : array) {
            System.out.print(j + "\t");
        }
    }
}
