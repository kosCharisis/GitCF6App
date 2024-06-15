package gr.aueb.cf.ch15;

public class PointUtil {

    public static void main(String[] args) {
        Point p1 = new Point(6.5);
        Point p2 = new Point2D(3, 4);
        Point p3 = new Point3D(3, 4, 5);

      System.out.println("Distance from origin: " + distanceFromOrigin(p1));
      System.out.println("Distance from origin: " + distanceFromOrigin(p2));
      System.out.println("Distance from origin: " + distanceFromOrigin(p3));
    }
    public static double distanceFromOrigin(Point point) {
        return point.getDistanceFromOrigin();
    }
}
