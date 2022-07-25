package ss1_introduction.practice;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        int day ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng cần kiểm tra ");
        day = scanner.nextInt();
        switch (day){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("có 31 ngày");
                break;
            case 2 :
                System.out.println("có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("có 30 ngày ");
                break;
            default:
                System.out.println("Nhập ko đúng tháng ");
        }
    }
}
