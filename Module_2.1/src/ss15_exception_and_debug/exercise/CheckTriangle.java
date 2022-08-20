package ss15_exception_and_debug.exercise;

import java.util.Scanner;

public class CheckTriangle {
    public static void triangleException(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException(" KO the nhap so am hoac bang 0");
        } else if (a + c <= b || a + b <= c || c + b <= a) {
            throw new IllegalTriangleException("Ko ton tai tam giac nay");
        } else {
            throw new IllegalTriangleException("Nhap thanh cong tam giac");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("nhap a : ");
                double a = scanner.nextInt();
                System.out.print("nhap  b: ");
                double b = scanner.nextInt();
                System.out.print("nhap c: ");
                double c = scanner.nextInt();
                CheckTriangle.triangleException(a, b, c);
            } catch (IllegalTriangleException x) {
                x.printStackTrace();
            }
        }
}
