package ss1_introduction.BT;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên của  bạn : ");
        name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
