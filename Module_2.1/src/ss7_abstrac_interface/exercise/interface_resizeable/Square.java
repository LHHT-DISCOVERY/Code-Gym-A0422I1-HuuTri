package ss7_abstrac_interface.exercise.interface_resizeable;

public class Square extends Shape implements Resizeable {
    private double side = 0.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String toString() {
        return "A Square Side = "
                + getSide()
                + ", Area is : "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public double resize(double percent) {
        System.out.printf(" Then Side is (percent : %.1f) : " + " Side is : "
                + (this.side = this.side + percent), percent);
        return this.getArea();
    }
}
