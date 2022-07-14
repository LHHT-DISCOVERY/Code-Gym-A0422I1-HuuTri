package ss3_array_in_java.BT;

import java.util.Scanner;

public class SumOneColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng ma trận : ");
        int n = scanner.nextInt();
        System.out.print("Nhập vào số cột ma trận : ");
        int m = scanner.nextInt();
        System.out.println();
        float[][] array = new float[n][m];
        inputAndShowArray(array, n, m);
        System.out.println(" tổng của cột là :  " + sumColumn(array));
    }

    public static void inputAndShowArray(float[][] array, int n, int m) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhập vào phần tứ [%d][%d] : ", i, j);
                array[i][j] = scanner.nextFloat();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static float sumColumn(float[][] array) {
        float sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập vào số cột bạn muốn tính tổng : ");
        int column = scanner.nextInt();
        if (column < 0 || column >= array.length) return 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][column];
        }
        return sum;
    }
}
