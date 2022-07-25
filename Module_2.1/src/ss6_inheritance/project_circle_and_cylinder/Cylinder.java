package ss6_inheritance.project_circle_and_cylinder;

public class Cylinder extends Circle {
    private Double height;

    public Cylinder() {
        this.setHeight(0.0);
    }

    public Cylinder(Double radius, String color, Double height) {
        super(radius, color);
        this.setHeight(height);
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double calculatorVolume() {
        return Math.PI * this.getRadius() * this.getRadius() * this.getHeight();
    }

    public String toString() {
        return super.toString() + "\n Height is : " + this.getHeight() + "\n volume is : " + calculatorVolume();
    }

}
