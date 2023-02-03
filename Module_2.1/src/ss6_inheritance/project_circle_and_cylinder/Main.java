package ss6_inheritance.project_circle_and_cylinder;

public class Main {
    public static int tinhchuso(int  a) {
        int kq = a ;
        int biendem = 0 ;
        while (kq !=0){
            kq = a/10;
            a = kq ;
            biendem++;
        }
        return biendem;
    }
    public static void main(String[] args) {
        // create Object circle no parameter
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println();


        // create Object circle1 two parameter
        Circle circle1 = new Circle(5.0, "Red");
        System.out.println(circle1);
        System.out.println();


        // create Object cylinder1 no parameter
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println();


        // create Object cylinder three parameter , Abstraction to Circle
        Cylinder cylinder = new Cylinder(5.0, "Red", 10.0);
        System.out.println(cylinder);
        System.out.println();

        int a[][] = {{1,2},{34,1234},{687,5}};
        int sum = 0 ;
        for (int i = 0 ; i < a.length ; i++){
            for (int j = 0; j < a[i].length ; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);

    }

}
