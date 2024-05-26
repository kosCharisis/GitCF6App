package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από το χρήστη τη θερμοκρασία σε κελσίους
 * και τη μετατρέπει σε fahrenheit
 */
public class FahrenheitApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        //Εντολές
        System.out.println("Please insert temperature in Fahrenheit");
        fahrenheit = in.nextInt();
        celsius = 5 * (fahrenheit - 32) / 9;

        //Εκτύπωση Αποτελεσμάτων
        System.out.printf("The temperature in Celsius is %d", celsius);

    }
}
