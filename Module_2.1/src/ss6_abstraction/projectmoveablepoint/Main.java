package ss6_abstraction.projectmoveablepoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create Object Point none parameter
        Point point = new Point();
        System.out.println(point);
        System.out.println();

        // create Object Point two parameter
        Point point1 = new Point(2, 4);
        System.out.println(point1);
        System.out.println();


        // create Object moveAblePoint
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.print(moveablePoint);
        System.out.println();

        // create Object moveAblePoint three parameter
        MoveablePoint moveablePoint1 = new MoveablePoint(2, 3, 4, 5);
        System.out.print(moveablePoint1);

        // move x,y
        System.out.printf("(%.1f , %.1f) " , moveablePoint1.getX(), moveablePoint1.getY() );
        System.out.printf("with speed [%.1f,%.1f]",moveablePoint1.getXSpeed(),moveablePoint1.getYSpeed());
        System.out.println("  =>  Later ---> " + moveablePoint1.move());
    }
}
