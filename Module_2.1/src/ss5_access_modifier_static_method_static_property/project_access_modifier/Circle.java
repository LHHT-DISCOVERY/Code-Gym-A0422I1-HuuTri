package ss5_access_modifier_static_method_static_property.project_access_modifier;

public class Circle {
    private Double radius = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(Double r) {
        this.setRadius(r);
    }

    // Private --> not ok
//    private Double getRadius() {
//        return radius;
//    }


    // Public --> Ok
//    public Double getRadius() {
//        return radius;
//    }


    // Default --> Oke
//      Double getRadius() {
//        return radius;
//    }


    // Protected  --> Oke
    protected Double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
