package ss1_introduction.TH;

import java.util.Scanner;

public class Equations {
    public static void main(String[] args) {
        float a ;
        float b ;
        float c ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a = scanner.nextFloat();
        System.out.println("Nhập hệ số b : ");
        b = scanner.nextFloat();
        System.out.println("Phương trình vừa nhập có dạng là : " + a + "X"+ "+" + b + " = " + 0);
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm ");
            }else {
                System.out.println("Phương trình vô nghiệm ");
            }
        }else {
            System.out.println("Phương trình có ngiệm là : " + -b/a);
        }
    }
}
