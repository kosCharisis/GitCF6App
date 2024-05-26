package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExMenuMethodException {

    public static void main(String[] args) {
        int choice = 0;
        printMenu();
        choice = getChoice();
        try {
            printChoice(choice);
        } catch (IllegalArgumentException e) {
            System.out.println("Choice does not exist");
        }
    }

    /**
     * Menu with choices
     */
    public static void printMenu() {
        System.out.println("Choose one of the following numbers: ");
        System.out.println("1. Athens");
        System.out.println("2. Manila");
        System.out.println("3. Bangkok");
        System.out.println("4. Hanoi");
        System.out.println("5. Exit");
    }

    /**
     * Gets the choice from the user
     * which is an integer from 1 to 5
     *
     * @return     the input choice
     */
    public static int getChoice() {
        int choice = 0;
        try (Scanner in = new Scanner(System.in)) {
            if (in.hasNextInt()) {
            choice = in.nextInt();
        } else {
            System.out.println("Error. Not an integer");
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
            throw e;
        }
        return choice;
    }

    /**
     * Checks if the input number is between 1 and 5.
     * otherwise gives an exception
     *
     * @param choice    the input choice
     * @throws IllegalArgumentException
     */
   public static void printChoice(int choice) throws IllegalArgumentException {
        try {
            if (choice < 1 || choice > 5) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
        switch (choice) {
            case 1:
                System.out.println("1. Athens");
                break;
            case 2:
                System.out.println("2. Manila");
                break;
            case 3:
                System.out.println("3. Bangkok");
                break;
            case 4:
                System.out.println("4. Hanoi");
                break;
            case 5:
                System.out.println("5. Exit");
                break;
            }
        }
}
