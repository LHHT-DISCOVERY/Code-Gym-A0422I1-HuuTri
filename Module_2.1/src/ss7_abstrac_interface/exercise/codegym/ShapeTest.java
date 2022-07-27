package ss7_abstrac_interface.exercise.codegym;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Shape[] shape1 = new Shape[5];
        shape1[0] = new Circle(3, "red", true);
        shape1[1] = new Rectangle(2, 3, "red", false);
        shape1[2] = new Square("red", false, 4);
        shape1[3] = new Square("red", false, 4);
        shape1[4] = new Shape();
        for (Shape shape2 : shape1) {
            System.out.println("---------------------------");
            System.out.println(shape2);
            if (shape2 instanceof Square) {
                ((Square) shape2).howToColor();
            }
        }
    }
}
