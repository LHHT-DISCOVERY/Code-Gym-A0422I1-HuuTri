package ss7_abstrac_interface.TH.project_comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[6];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(6);
        circles[2] = new ComparableCircle(3 , " red" , true);
        circles[3] = new ComparableCircle(4 , " red" , true);
        circles[4] = new ComparableCircle(2 , " red" , true);
        circles[5] = new ComparableCircle(5 , " red" , true);
        for( ComparableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println(" -----= After then sort ( Radius )=----- ");
        for( ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
