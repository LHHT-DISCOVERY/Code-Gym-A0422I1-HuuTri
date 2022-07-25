package ss1_introduction.practice;

import java.util.Scanner;

public class AreaHCN {
    public static void main(String[] args) {
        float width ;
        float height ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width : ");
        width = scanner.nextFloat();
        System.out.println("Input height : ");
        height = scanner.nextFloat();
        System.out.println("Area is : " + height * width);
    }
}
