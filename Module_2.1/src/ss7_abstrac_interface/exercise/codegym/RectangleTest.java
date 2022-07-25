package ss7_abstrac_interface.exercise.codegym;

import com.codegym.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        com.codegym.Rectangle rectangle = new com.codegym.Rectangle();
        System.out.println(rectangle);

        rectangle = new com.codegym.Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
