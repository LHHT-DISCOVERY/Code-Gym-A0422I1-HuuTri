package ss7_abstrac_interface.BT.interface_resizeable;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape2 = new Shape();
        System.out.println(shape2);

        shape2 = new Shape("red", false);
        System.out.println(shape2);


        int size = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(size, "red", true);
        shapes[1] = new Rectangle(size, size, "red", false);
        shapes[2] = new Square("red", true, size);
        System.out.println("----- Before ------");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println(" ___ Area Then ___ ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println(" => Area Circle : "
                        + ((Circle) shape).resize(size * (int) Math.floor(Math.random() * 10)));
                System.out.println();
            }
            if (shape instanceof Rectangle) {
                System.out.println(" => Area Rectangle : "
                        + ((Rectangle) shape).resize(size * (int) Math.floor(Math.random() * 10)));
                System.out.println();

            }
            if (shape instanceof Square) {
                System.out.println(" => Area Square : "
                        + ((Square) shape).resize(size * (int) Math.floor(Math.random() * 10)));
                System.out.println();

            }
        }
    }
}
