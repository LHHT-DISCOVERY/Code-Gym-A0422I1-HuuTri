package ss3_array_in_java.TH;

import org.jcp.xml.dsig.internal.dom.ApacheNodeSetData;
import sun.security.mscapi.CPublicKey;

import java.util.Scanner;

public class CovertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice ;
        do{
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1 :
                    System.out.println(" You select Fahrenheit to Celsius ");
                    System.out.print(" Enter Fahrenheit : ");
                    fahrenheit = input.nextDouble() ;
                    System.out.println(fahrenheit + " Fahrenheit " + " = " + fahrenheitToCelsius(fahrenheit) + " Celsius");
                    break;
                case 2 :
                    System.out.println(" Y0u select Celsius to Fahrenheit");
                    System.out.print("Enter Celius : ");
                    celsius = input.nextDouble();
                    System.out.println(celsius+ " Celsius" + " = " + celsiusToFahrenheit(celsius) + " Fahrenheit " );
                    break;
                case 0 :
                    System.out.println(" You select Exit ");
                    System.exit(0);
                default:
                    System.out.println(" Please ! Input number in menu");
            }
        }while(choice != 0 );
    }
        public static double celsiusToFahrenheit(double celsius){
            double fahrenheit = (9.0 / 5) * celsius + 32;
            return fahrenheit;
        }
        public static double fahrenheitToCelsius(double fahrenheit){
            double celsius = (5.0 / 9) * (fahrenheit - 32);
            return celsius;
        }
}
