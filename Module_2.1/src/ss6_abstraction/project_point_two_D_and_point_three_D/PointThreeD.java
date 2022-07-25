package ss6_abstraction.project_point_two_D_and_point_three_D;

public class PointThreeD extends PointTwoD {
    private float z;

    public PointThreeD() {
        this.setZ(0);

    }

    public PointThreeD(float x, float y, float z) {
        super(x, y);
        this.setZ(z);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float[] array3D) {
        super.setXY(array3D);
        this.z = array3D[2];
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), z};
    }

    public String toString() {
        return super.toString() + "\n Z is : " + this.getZ();
    }
}
