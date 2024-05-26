package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού με .
 * Ελέγχεται αν ο αριθμός είναι μεταξύ [1-5]
 * και δίνει feeback
 */
public class SmartMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true){
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές (5 για έξοδο):");
            System.out.println("1. Εισαγωγη");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            }
            if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            }
            if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            }
            if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            }
            if (choice> 5 || choice < 1) {
                System.out.println("Αδύνατη επιλογή. Ξαναδοκιμάστε");
            }
        if (choice == 5) {
            System.out.println("Έξοδος");
            break;
        }
        }
    }
}
