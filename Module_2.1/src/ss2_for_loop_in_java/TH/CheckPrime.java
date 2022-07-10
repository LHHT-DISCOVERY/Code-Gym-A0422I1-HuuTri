package ss2_for_loop_in_java.TH;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập vào số cần kiểm tra : ");
        number = scanner.nextInt();
        if (number <= 0 || number == 1) {
            System.out.println(number + " is Not Prime");
        } else if (number == 2) {
            System.out.println(number + " is Prime");
        } else {
            boolean isFlag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is Not Prime");
                    isFlag = false;
                    break;
                }
            }
            if (isFlag == true) {
                System.out.println(number +" is Prime");
            }
        }
    }
}
