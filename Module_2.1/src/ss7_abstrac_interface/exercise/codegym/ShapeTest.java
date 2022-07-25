package ss7_abstrac_interface.exercise.codegym;

import com.codegym.Shape;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Shape[] shape1 = new Shape[4];
    }
}
