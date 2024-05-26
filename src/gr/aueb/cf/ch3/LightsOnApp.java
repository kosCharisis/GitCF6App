package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν
 * βρέχει και ταυτόχρονα είτε είναι σκοτάδι
 * ή τρέχει με ταχύτητα υψηλή. Ο χρήστης εισάγει τα
 * τρία παραπάνω στοιχεία και το πρόγραμμα εκτυπώνει
 * αν τα φώτα ανάβουν ή όχι
 *
 * @author
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        boolean areLightsOn = false;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert your speed");
        speed = in.nextInt();

        isRunning = speed >= MAX_SPEED;
        areLightsOn = isRaining && (isDark || isRunning);

        System.out.println("Are lights on:" + areLightsOn);

    }
}
