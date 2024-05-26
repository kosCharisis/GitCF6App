package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Requests 6 integers from the user.
 * Checks if the array with the six numbers pass the following five filters
 */
public class ExFilterSixApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] six = new int[6];
        int numberCheck = -1;

        for (int i = 0; i < six.length; i++) {
            System.out.println("Please give a number between 1 and 49 for the " + (i+1) + " place");
            six[i] = sc.nextInt();
        }

        for (int element : six) {
            System.out.print(element + " ");
        }
        System.out.println();

//        for (int i=0; i < six.length; i++) {
//            System.out.print(six[i] + " ");
//       }
//       sc.close();

        for (int i = 0; i < six.length; i++) {
            if (six[i] < 1 || six[i] > 49) {
                numberCheck = i;
                break;
            }
        }

        if (numberCheck != -1) {
            System.out.println("Wrong numbers");
        }
        else {
            System.out.printf("The array has no more than 3 even elements: %b\n", areLTNEven(six, 3));
            System.out.printf("The array has no more than 3 odd elements: %b\n", areLTNOdd(six, 3));
            System.out.printf("The array has no more than 3 consecutive elements: %b\n", hasLessThanThreeConsecutive(six));
            System.out.printf("The array has no more than 3 elements with the same ending: %b\n", !areSameEnding(six, 3));
            System.out.printf("The array has no more than 3 elements within the same group of tens: %b\n", !areSameGroupOften(six, 3));
        }
    }

    /**
     *Checks if the array has even elements no more than a threshold
     *
     * @param arr           the input array
     * @param threshold     the threshold
     * @return              false otherwise
     */
    public static boolean areLTNEven(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count <=threshold;
    }

    /**
     *Checks if the array has odd elements no more than a threshold
     *
     * @param arr           the input array
     * @param threshold     the threshold
     * @return              false otherwise
     */
    public static boolean areLTNOdd(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count <=threshold;
    }

    /**
     * Checks if the array has no more than three consecutive elements
     *
     * @param arr           the input array
     * @return              false otherwise
     */
    public static boolean hasLessThanThreeConsecutive(int[] arr) {
        int cons = 0;
        for (int i = 0; i < arr.length-3; i++) {
            if ((arr[i] == arr[i+1]-1) && (arr[i]==arr[i+2]-2) && (arr[i]==arr[i+3]-3)) {
                cons++;
            }
        }
        return cons < 1;
    }

    /**
     * Checks if the array has elements with the same ending
     * more than a threshold
     *
     * @param arr           the input array
     * @param threshold     the threshold
     * @return              false otherwise
     */
    public static boolean areSameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];
        boolean hasSameEnding = false;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item > threshold) {
                hasSameEnding = true;
                break;
            }
        }
        return hasSameEnding;
    }

    /**
     * Checks if an array has elements in the same group of tens
     * more than a threshold
     *
     * @param arr           the input array
     * @param threshold     the threshold
     * @return              false otherwise
     */
    public static boolean areSameGroupOften(int[] arr, int threshold) {
        int[] tens = new int[10];
        boolean sameTen = false;

        for (int item : arr) {
            tens[item / 10]++;
        }

        for (int item : tens) {
            if (item > threshold) {
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }
}
