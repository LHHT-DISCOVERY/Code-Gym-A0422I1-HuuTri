package ss2_for_loop_in_java.TH;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhập vào số a ");
        a = Math.abs(scanner.nextInt());
        System.out.println("Nhập vào số b ");
        b = Math.abs(scanner.nextInt());
        if (a == 0 || b == 0) {
            System.out.println("Không tồn tại ước chung lớn nhất ");
        } else {
            int min = (a < b) ? a : b;
            for (int i = min; i >= 1; --i) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println(" Ước chung lớn nhất của 2 số là : " + i);
                    break;
                }
            }
        }
    }
}
