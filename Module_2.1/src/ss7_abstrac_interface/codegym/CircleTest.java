package ss7_abstrac_interface.codegym;

import com.codegym.Circle;

public class CircleTest {
    public static void main(String[] args) {
        com.codegym.Circle circle = new com.codegym.Circle();
        System.out.println(circle);

        circle = new com.codegym.Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}