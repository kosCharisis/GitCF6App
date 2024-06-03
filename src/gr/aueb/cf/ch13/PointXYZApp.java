package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.PointXYZ;

public class PointXYZApp {

    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ();
        PointXYZ p2 = new PointXYZ(10, 12, 15);
        PointXYZ p3 = new PointXYZ(20, 6, 5);

        p1.setX(15);
        p1.setY(15);
        p1.setZ(10);

        System.out.println(p1.converToString());
        System.out.println(p2.converToString());
        System.out.println(p3.converToString());

        System.out.println("For point 1: " + p1.getXYDistance());
        System.out.println("For point 1: " + p1.getYZDistance());
        System.out.println("For point 1: " + p1.getXZDistance());
        System.out.println("For point 1: " + p1.getXYZDistance());

        System.out.println("For point 2: " + p2.getXYDistance());
        System.out.println("For point 2: " + p2.getYZDistance());
        System.out.println("For point 2: " + p2.getXZDistance());
        System.out.println("For point 2: " + p2.getXYZDistance());

        System.out.println("For point 3: " + p3.getXYDistance());
        System.out.println("For point 3: " + p3.getYZDistance());
        System.out.println("For point 3: " + p3.getXZDistance());
        System.out.println("For point 3: " + p3.getXYZDistance());
    }
}
