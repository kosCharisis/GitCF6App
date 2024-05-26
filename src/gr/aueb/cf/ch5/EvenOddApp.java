package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Άρτιοι και περιττοί. Ελέγχοι αν ένας ακέραιος έιναι
 * άρτιος ή περιττός με τη χρήση μεθόδου.
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        System.out.printf("%d is even : %b\n", inputNum, isEven(inputNum));
        System.out.printf("%d is odd : %b", inputNum, !isEven(inputNum));

    }

    /**
     * Evaluates if an input int is even
     *
     * @param a the input int.
     * @return  true if even, false otherwise
     */
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
