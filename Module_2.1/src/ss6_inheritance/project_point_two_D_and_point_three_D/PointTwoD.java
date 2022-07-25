package ss6_inheritance.project_point_two_D_and_point_three_D;

public class PointTwoD {
    private float x;
    private float y;

    public PointTwoD() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public PointTwoD(float x, float y) {
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
        return " X is : " + this.getX() + "\n Y is : " + this.getY();
    }

}
