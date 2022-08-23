package ss15_exception_and_debug.exercise;

import java.util.Scanner;

public class CheckTriangle {
    public static boolean triangleException(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException(" Ko the nhap so am hoac bang 0");
        }
        if (a + c <= b || a + b <= c || c + b <= a) {
            throw new IllegalTriangleException("Ko ton tai tam giac nay");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a : ");
        double a = scanner.nextInt();
        System.out.print("nhap  b: ");
        double b = scanner.nextInt();
        System.out.print("nhap c: ");
        double c = scanner.nextInt();
        while (true) {
            try {
                if (CheckTriangle.triangleException(a, b, c)) {
                    System.out.println("Nhap thanh cong tam giac ");
                    break;
                }
            } catch (IllegalTriangleException x) {
                System.out.println("Exception : " + x.getMessage());
                System.out.println();
                System.out.print("nhap lai a : ");
                a = scanner.nextInt();
                System.out.print("nhap lai b: ");
                b = scanner.nextInt();
                System.out.print("nhap lai c: ");
                c = scanner.nextInt();
            }
        }

    }
}
