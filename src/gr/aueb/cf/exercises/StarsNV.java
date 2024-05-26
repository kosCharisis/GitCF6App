package gr.aueb.cf.exercises;

import java.util.Scanner;

/**
 * Prints n stars vertically
 */
public class StarsNV {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Please give a number for the stars");
        choice = in.nextInt();

        for (int i = 1; i <= choice; i++) {
            System.out.println(" * ");
        }
    }
}
