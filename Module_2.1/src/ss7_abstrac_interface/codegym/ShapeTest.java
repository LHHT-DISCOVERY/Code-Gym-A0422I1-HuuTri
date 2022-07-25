package ss7_abstrac_interface.codegym;

import com.codegym.Shape;

public class ShapeTest {

    public static void main(String[] args) {
        com.codegym.Shape shape = new com.codegym.Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
