package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Finds the second min element of an array.
 * That is the next larger after the minimum.
 */
public class ExSecondMinApp {

    public static void main(String[] args) {
        int[] arr = {19, 34, 55, 20, 12, 72, 21, 91, 25};
        Arrays.sort(arr);
        traverseArray(arr);
    }

    /**
     * Sorts the array in an ascending order
     *
     * @param arr  the input array
     */
    public static void selectionSort(int[] arr) {
        if (arr == null) return;
        int min;
        int minPosition;

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }
            swap(arr, i, minPosition);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void traverseArray(int[] arr) {
        /*for (int element: arr) {
            System.out.print(element + " ");
        }*/
        System.out.printf("The second min element is %d", arr[1]);
    }
}
