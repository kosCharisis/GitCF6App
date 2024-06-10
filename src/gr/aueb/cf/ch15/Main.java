package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(5.5);
        Point p2 = new Point2D(5, 12);  //Point2D

        Point p3 = new Point3D(5, 4, 3);  //Point3D

        System.out.println("Distance from origin: " + p1.getDistanceFromOrigin());
        System.out.println("Distance from origin: " + p2.getDistanceFromOrigin());
        System.out.println("Distance from origin: " + p3.getDistanceFromOrigin());


        p3.movePlusOne();
        ((Point3D) p3).sayHi();

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);
    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }
}
