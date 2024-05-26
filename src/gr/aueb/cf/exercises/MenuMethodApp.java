package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού
 * Ο χρήστης δίνει έναν αριθμό μεταξύ [1-6]
 * Έπειτα δίνει τον αριθμο τωνν αστεριών
 * Οι επιλογές εκτελούνται με τη χρήση της μεθόδου
 *
 */
public class MenuMethodApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int n = 0;

        do {
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
            System.out.println("Δώσε επιλογή:");

            choice = in.nextInt();

            if (choice < 1 || choice > 6) {
                System.out.println("Error in choice");
            }

            if (choice < 6 && choice > 0) {
                  System.out.println("Παρακαλώ δώστε αριθμό για αστεράκια");
                  n = in.nextInt();
            }

            switch (choice) {

                case 1:
                    horizontal(n);
                    break;
                case 2:
                    vertical(n);
                    break;
                case 3:
                    for (int j = 1; j <= n; j++) {
                        horizontal(n);
                    }
                    break;
                case 4:
                    for (int j = 1; j <= n; j++) {
                        horizontal(j);
                    }
                    break;
                case 5:
                    for (int j = 1; j <= n; n--) {
                        horizontal(n);
                    }
                    break;
            }
            System.out.println();
        } while (choice != 6);
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή μας.");
    }

    /**
     * Stars in horizontal n formation
     *
     * @param n     number of stars
     */
    public static void horizontal(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" * ");
        }
        System.out.println();
    }

    /**
     * Stars in horizontal n formation
     *
     * @param n     number of stars
     */
    public static void vertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" * ");
        }
    }
}