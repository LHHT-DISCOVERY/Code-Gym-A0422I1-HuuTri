package ss4_class_and_object_in_java.BT.project_quadratic_equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void solvingEquation() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(" The equation has countless roots");
                } else {
                    System.out.println(" The equation has no roots");
                }
            } else {
                if (c == 0) {
                    System.out.println("The equation has one root : 0 ");
                } else {
                    System.out.println("The equation has one root : " + (-c / b));
                }
            }
        } else {
            if (getDiscriminant() > 0) {
                System.out.println(" The equation has two roots " + getRoot1() + " and " + getRoot2());
            } else if (getDiscriminant() == 0) {
                System.out.println(" The equation has one roots " + getRoot1());
            } else {
                System.out.println("The equation has no roots");
            }
        }
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return ((-b + (Math.sqrt(b * b - 4 * a * c)))) / (2 * a);

    }

    public double getRoot2() {
        return ((-b - (Math.sqrt(b * b - 4 * a * c)))) / (2 * a);

    }
}