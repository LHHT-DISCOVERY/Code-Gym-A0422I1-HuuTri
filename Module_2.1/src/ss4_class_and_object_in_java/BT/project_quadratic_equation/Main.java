package ss4_class_and_object_in_java.BT.project_quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print(" Enter A : ");
        a = scanner.nextDouble();
        System.out.print(" Enter B : ");
        b = scanner.nextDouble();
        System.out.print(" Enter C : ");
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(" A is : " + quadraticEquation.getA());
        System.out.println(" B is : " + quadraticEquation.getB());
        System.out.println(" C is : " + quadraticEquation.getC());

        quadraticEquation.solvingEquation() ;
    }
}
