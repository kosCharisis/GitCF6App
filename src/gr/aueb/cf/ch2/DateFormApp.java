package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από το χρήστη τρεις ακέραιους αριθμούς
 * που αναπαριστούν ημέρα, μήνα, έτος και τα
 * εμφανίζει σε μορφή: HH/MM/EE
 */
public class DateFormApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int yearResult = 0;

        //Εντολές
        System.out.println("Please insert day");
        day = in.nextInt();
        System.out.println("Please insert month");
        month = in.nextInt();
        System.out.println("Please insert year");
        year = in.nextInt();
        yearResult = year % 100;

        //Εκτύπωση Αποτελεσμάτων
        System.out.printf("The date is %02d/%02d/%d", day, month, yearResult);

    }
}
