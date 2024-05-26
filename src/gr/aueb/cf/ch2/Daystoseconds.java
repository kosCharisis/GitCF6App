package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει τις ημέρες, τις ώρες, τα λεπτά, τα δευτερόλεπτα
 * και τα μετατρέπει σε δευτερόλεπτα.
 */
public class Daystoseconds {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECS_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60 * 60;
        final int SECS_PER_DAY = 24 * 60 * 60;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = 0;
        //int remainingSeconds = 0;

        System.out.println("Please insert total days");
        days = in.nextInt();
        System.out.println("Please insert total hours");
        hours = in.nextInt();
        System.out.println("Please insert total minutes");
        minutes = in.nextInt();
        System.out.println("Please insert total seconds");
        seconds = in.nextInt();

        totalSeconds = days * SECS_PER_DAY + hours * SECS_PER_HOUR + minutes * SECS_PER_MINUTE + seconds * SECS_PER_MINUTE;

        System.out.printf("Total seconds: %,d, Days: %d, Hours: %02d, Minutes: %02d, Seconds: %02d",
                totalSeconds, days, hours, minutes, seconds);


    }
}
