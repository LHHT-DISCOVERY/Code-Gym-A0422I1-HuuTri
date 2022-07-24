package ss6_abstraction.projectmoveablepoint;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float[] array2D) {
        this.x = array2D[0];
        this.y = array2D[1];

    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public String toString() {
        return "(x,y) = " + "(" + this.getX() + "," + this.getY()+");";
    }
}
