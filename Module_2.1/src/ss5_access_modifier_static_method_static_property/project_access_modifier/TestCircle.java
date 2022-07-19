package ss5_access_modifier_static_method_static_property.project_access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        circle.setRadius(5.0);
        System.out.println(" Radius is : " + circle.getRadius() + "\n Color is : " + circle.getColor());
        System.out.println(" Area is : " + circle.getArea());
        System.out.println();


        Circle circle1 = new Circle();
        System.out.println(" Radius1 is : " + circle1.getRadius()+ "\n Color is : " + circle.getColor());
        System.out.println(" Area is : " + circle.getArea());
    }
}
