package gr.aueb.cf.ch2;

/**
 * Ελέγχει την υπερχείληση στν περίπτωση
 * που συμβεί.
 */
public class OverflowApp {
    public static void main(String[] args) {

        //Δήλωδη και αρχικοποίηση μεταβλητών
        int num1 = 2_147_483_647;
        int num2 = 3;
        int result = 0;
        long i = 4_155_000_000L;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.printf("Το αποτέλεσμα είναι: %d%n", result);
        System.out.println("i= " + i);
    }
}
