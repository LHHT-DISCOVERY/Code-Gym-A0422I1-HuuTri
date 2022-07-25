package ss6_inheritance.project_point_two_D_and_point_three_D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Object twoD none parameter
        PointTwoD pointTwoD = new PointTwoD();
        System.out.print("Object Default Two D is : ");
        System.out.println(Arrays.toString(pointTwoD.getXY()));
        System.out.println(pointTwoD);
        System.out.println();

        // Object twoD two parameter
        PointTwoD pointTwoD1 = new PointTwoD(2,4);
        System.out.print("Object Two D is : ");
        System.out.println(Arrays.toString(pointTwoD1.getXY()));
        System.out.println(pointTwoD1);
        System.out.println();


        // Object threeD none parameter
        PointThreeD pointThreeD = new PointThreeD();
        System.out.print("Object Default Three D is : ");
        System.out.println(Arrays.toString(pointThreeD.getXYZ()));
        System.out.println(pointThreeD);
        System.out.println();


        // Object threeD three parameter
        PointThreeD pointThreeD1 = new PointThreeD(3,5,6);
        System.out.print("Object Three D is : ");
        System.out.println(Arrays.toString(pointThreeD1.getXYZ()));
        System.out.println(pointThreeD1);
    }

}
