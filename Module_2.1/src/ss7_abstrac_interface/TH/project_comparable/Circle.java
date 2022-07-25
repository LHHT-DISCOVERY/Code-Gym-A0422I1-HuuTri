package ss7_abstrac_interface.TH.project_comparable;

public abstract class Circle {
    private double radius = 1.0;
    private String color = "green";
    public boolean filled = false;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return " Radius is : " + getRadius() + "\n Color is : " + getColor()
                + "\n" + (isFilled() ? " true " : " false ") + "\n ";
    }
}
