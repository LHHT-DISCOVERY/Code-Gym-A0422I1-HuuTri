package ss5_access_modifier_static_method_static_property.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car = new Car("BMW", "HuuTri");
        car.On();
        System.out.println(car);


        Car car2 = new Car("Mercedes", "HuuTri");
        car2.On();
        System.out.println(car2);


        Car car3 = new Car("Lamborghini", "HuuTri");
        car3.On();
        System.out.println(car3);


    }
}
