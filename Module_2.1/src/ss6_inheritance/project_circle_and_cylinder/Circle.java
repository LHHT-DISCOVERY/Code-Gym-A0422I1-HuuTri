package ss6_inheritance.project_circle_and_cylinder;

public class Circle {
    private Double radius;
    private String color;

    public Circle() {
        this.setRadius(0.0);
        this.setColor("No Color");
    }

    public Circle(double radius, String color) {
        this.setRadius(radius);
        this.setColor(color);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return " Color is : " + this.getColor() + "\n Radius is : " + this.getRadius();
    }
}
