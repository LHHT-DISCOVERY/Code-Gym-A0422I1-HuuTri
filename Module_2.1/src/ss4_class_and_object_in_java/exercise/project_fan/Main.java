package ss4_class_and_object_in_java.exercise.project_fan;

public class Main {

    public static void main(String[] args) {

        // khởi tạo mặc định
        Fan fan = new Fan();
        System.out.println(" Khởi tạo Fan mặc định ");

        // output Fan Default
        System.out.println(fan);
        System.out.println("----------------END Fan Default ----------------");


        // khởi tạo đối tượng 1
        System.out.println(" Khởi tạo Fan1 (Turn On)");
        Fan fan1 = new Fan();

        // set cho Fan1
        fan1.setSpeed(3); // set mức 3 = Fast
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.turnOn();

        // output Fan1
        System.out.println(fan1);
        System.out.println("------------END Fan1---------------");


        // khởi tạo đối tượng 2
        System.out.println(" Khởi tạo Fan2 (Turn Off) ");
        Fan fan2 = new Fan();

        // set cho Fan2
        fan2.setRadius(5);
        fan2.setSpeed(1); // set mức 1 = Slow
        fan2.setColor("Blue");
        fan2.turnoff();

        // output Fan2
        System.out.println(fan2);
        System.out.println("------------END Fan2---------------");
    }
}
