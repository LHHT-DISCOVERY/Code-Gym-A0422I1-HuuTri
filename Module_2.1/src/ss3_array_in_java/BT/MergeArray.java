package ss3_array_in_java.BT;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        System.out.print("Nhập vào kích thước của mảng 1 : ");
        n = scanner.nextInt();
        System.out.print("Nhập vào kích thước của mảng 2 : ");
        m = scanner.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[m];
        int[] arrayResult = new int[m + n];
        System.out.println("Nhập vào mảng thứ 1 có kích thước là " + n);
        for (int j = 0; j < n; j++) {
            System.out.printf("Nhập phần tử [%d] : ", j);
            array1[j] = scanner.nextInt();
        }
        System.out.println("Mảng 1 là : " + Arrays.toString(array1));
        System.out.println("Nhập vào mảng thứ 2 có kích thước là " + m);
        for (int j = 0; j < m; j++) {
            System.out.printf("Nhập phần tử [%d] : ", j);
            array2[j] = scanner.nextInt();
        }
        System.out.println("Mảng 2 là : " + Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            arrayResult[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            int a = array1.length + i;
            arrayResult[a] = array2[i];
        }
        System.out.println("Mảng ghép bằng for là : " + Arrays.toString(arrayResult));

// arraycoppy (Object src, int srcPos, Object dest, int destPos, int length)
// (mảng muốn coppy, vị trí bắt đầu mảng muốn coppy , mảng mới, vị trí bắt đầu mảng mới,sl cần coppy)
        System.arraycopy(array1, 0, arrayResult, 0, array1.length);
        System.arraycopy(array2, 0, arrayResult, array1.length, array2.length);
        System.out.println("Kết quả sau khi gộp 2 mảng là : " + Arrays.toString(arrayResult));
    }
}
