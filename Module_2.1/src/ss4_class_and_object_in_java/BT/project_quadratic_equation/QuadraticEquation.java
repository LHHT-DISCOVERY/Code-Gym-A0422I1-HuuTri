package ss4_class_and_object_in_java.BT.project_quadratic_equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    // constructor với 3 parameter A,B,C
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // get hệ số A
    public double getA() {
        return a;
    }

    // set hệ số A
    public void setA(double a) {
        this.a = a;
    }

    // get hệ số B
    public double getB() {
        return b;
    }

    // set hệ số B
    public void setB(double b) {
        this.b = b;
    }

    // get hệ số C
    public double getC() {
        return c;
    }

    // set hệ số C
    public void setC(double c) {

        this.c = c;
    }

    // xử lí các case có thể sảy ra đối với pt bậc 2
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

    // delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // nghiệm 1
    public double getRoot1() {
        return ((-b + (Math.sqrt(b * b - 4 * a * c)))) / (2 * a);

    }

    // nghiệm 2
    public double getRoot2() {
        return ((-b - (Math.sqrt(b * b - 4 * a * c)))) / (2 * a);

    }
}