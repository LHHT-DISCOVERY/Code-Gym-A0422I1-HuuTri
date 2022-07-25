package ss7_abstrac_interface.exercise.codegym;

public class SquareTest {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(3.0);
        System.out.println(square2);

        Square square = new Square("red" , true , 3) ;
        System.out.println(square);
    }
}
