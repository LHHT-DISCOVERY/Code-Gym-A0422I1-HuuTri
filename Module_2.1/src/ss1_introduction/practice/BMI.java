package ss1_introduction.practice;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight ;
        float height ;
        System.out.println("Nhập vào chiều cao : ");
        height = scanner.nextFloat();
        System.out.println("Nhập vào cân nặng : ");
        weight = scanner.nextFloat();
        float BMI = weight/(height*height);
        if(BMI < 0){
            System.out.println("Nhập sai cân nặng ");
        }else if(BMI < 18.5 ){
            System.out.println("Underweight");
        }else if(BMI < 25){
            System.out.println("Normal");
        }else if(BMI < 30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
