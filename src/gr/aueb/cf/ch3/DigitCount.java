package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος ενός ακεραίου
 * με do/while. Για παράδειγμα αν ο χρήστης δώσει
 * το 259 το πλήθος των ψηφίων είναι 3.
 */
public class DigitCount {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        int copyOfNum = 0;
        int count = 0;
        int sumOfDigits = 0;
        int rhDigit = 0;

        System.out.println("Please insert an int");
        num = in.nextInt();

        copyOfNum = num;

        do {
            count++;

            rhDigit = copyOfNum % 10;
            sumOfDigits += rhDigit;

            copyOfNum = copyOfNum / 10;
        } while (copyOfNum != 0);


        System.out.println("Sum of digits:" + sumOfDigits);
        System.out.printf("Το πλήθος των ψηφίων του ακεραίου %d είναι %d\n", num, count);
    }
}
