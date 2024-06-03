package gr.aueb.cf.ch13.model;

public class PointXYZ {
    private int x;
    private int y;
    private int z;

    public PointXYZ() {

    }

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String converToString() {
        return "Point {" + "x= " + x + ", y= " + y + ", z= " + z + "}";
    }

    public String getXYDistance() {
        double distance = Math.hypot(x,y);
        return "Distance in XY dimension, from center of axis " + "d = " + distance;
    }

    public String getYZDistance() {
        double distance = Math.hypot(y,z);
        return "Distance in YZ dimension, from center of axis " + "d = " + distance;
    }

    public String getXZDistance() {
        double distance = Math.hypot(x,z);
        return "Distance in XZ dimension, from center of axis " + "d = " + distance;
    }

    public String getXYZDistance() {
        double distance = Math.sqrt( Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
        return "Distance from center of axis " + "d = " + distance;
    }

}
