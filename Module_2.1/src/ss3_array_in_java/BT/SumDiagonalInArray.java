package ss3_array_in_java.BT;

import java.util.Scanner;

public class SumDiagonalInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng :  ");
        int n = scanner.nextInt();
        System.out.print("Nhập vào số cột : ");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        inputAndShowArray(array, n, m);
        System.out.println("Tổng 2 đường chéo chính là : " + sumDiagonal(array));
    }

    public static void inputAndShowArray(int[][] array, int n, int m) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhập vào phần tử thứ [%d][%d] : ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập là : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static int sumDiagonal(int[][] array) {
        int sum_1 = 0;
        int sum_2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                // tổng các số trên đường chéo thứ nhất
                if (i == j) {
                    sum_1 += array[i][j];
                }
                // tổng các số trên đường chéo thứ 2 và loại bỏ đi vị trí trùng nhau trên đường chéo thứ nhất
                // vì số tại tâm của ma trận vuông trùng lại trên đường chéo chính thứ 2
                if (i + j == array.length - 1 && i != j) {
                    sum_2 += array[i][j];
                }
            }
        }
        // trả về tổng các số trên 2 đường chéo chính
        return sum_1 + sum_2;
    }
}
