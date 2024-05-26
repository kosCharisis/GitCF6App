package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει τρεις δεκκαδικούς που αναπαριστούν
 * τις πλευρές ενός τριγώνου.
 * Ελέγχουμε ένα τρίγωνο είναι ορθογώνιο
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;

        System.out.println("Please insert 3 sides of the trangle:");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = Math.abs (a*a - b*b - c*c) <= EPSILON;
        System.out.println("Triangle is right: " + isRight);
    }
}
