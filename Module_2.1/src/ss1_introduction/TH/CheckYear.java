package ss1_introduction.TH;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year ;
        System.out.println("Nhập vào năm cần kiểm tra ");
        year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0 ){
                if(year % 400 == 0 ){
                    System.out.println(year + " Là năm thuận");
                }else {
                    System.out.println(year + " Là năm không thuận");
                }
            }else {
                System.out.println(year + " Là năm nhuận");
            }
        }else {
            System.out.println(year + " Là năm không thuận");
        }

    }
}
