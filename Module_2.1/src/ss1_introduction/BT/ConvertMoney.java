package ss1_introduction.BT;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money;
        System.out.println("Nhập vào số tiền USD : ");
        money = scanner.nextInt();
        System.out.println(money + "USD" + " = " + 23000*money + " VND");
    }
}
