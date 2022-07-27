package ss7_abstrac_interface.exercise.interface_colorable;

public class Square extends Shape implements Colorable {
    private double side = 3.0;
    public  Square(){}
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
    public double getArea(){
        return side * side ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", Area is : "
                + getArea() +
                '}' + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides..");
    }
}
