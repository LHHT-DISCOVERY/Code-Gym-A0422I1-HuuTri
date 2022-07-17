package ss4_class_and_object_in_java.BT.project_fan;

public class Main {

    public static void main(String[] args) {
        Fan fan = new Fan();
        // khởi tạo mặc định
        System.out.println(" Khởi tạo Fan mặc định ");
        System.out.println(fan);
        System.out.println("----------------------------------");
        // khởi tạo đối tượng 1
        System.out.println(" Khởi tạo Fan1 (Turn On)");
        Fan fan1 = new Fan();
        fan1.setSpeed(3); // set mức 3 = Fast
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.turnOn();
        System.out.println(fan1);
        System.out.println("------------END Fan1---------------");
        System.out.println("----------------------------------");
        // khởi tạo đối tượng 2
        System.out.println(" Khởi tạo Fan2 (Turn Off) ");
        Fan fan2 = new Fan();
        fan2.setRadius(5);
        fan2.setSpeed(1); // set mức 1 = Slow
        fan2.setColor("Blue");
        fan2.turnoff();
        System.out.println(fan2);
        System.out.println("------------END Fan2---------------");
    }
}
