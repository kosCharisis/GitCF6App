package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Η εφαρμογή αποφαίνεται αν ένα έτος είναι δίσεκτο ή όχι.
 * Ο χρήστης δίνει ένα έτος και εμφανίζει αν είναι δίσεκτό.
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

//        while (year != 0) {
            System.out.println("Please insert a year");
            year = scanner.nextInt();

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                System.out.printf("The year %d is a Leap year\n", year);

            else {
                System.out.println("The year is NOT a Leap year");

//            }
        }
    }
}
