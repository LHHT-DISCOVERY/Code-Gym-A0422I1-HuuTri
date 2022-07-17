package ss4_class_and_object_in_java.BT.project_fan;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "Blue";
    }

    public String getSpeed() {
        String s = "";
        switch (speed) {
            case SLOW:
                s = "SLOW";
                break;
            case MEDIUM:
                s = "MEDIUM";
                break;
            case FAST:
                s = "FAST";
                break;
        }
        return s;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
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

    public void turnOn() {
        this.on = true;
    }

    public void turnoff() {
        this.on = false;
    }


    public String toString() {
        if (on) {
            return " Fan speed :  " + getSpeed() + "\n Color : " + getColor() +
                    "\n Fan Radius : " + getRadius() + "\n Fan is ON";
        }
        return " Fan speed :  " + getSpeed() + "\n Fan color : " + getColor() +
                "\n Fan Radius : " + getRadius() + "\n Fan is OFF";
    }
}
