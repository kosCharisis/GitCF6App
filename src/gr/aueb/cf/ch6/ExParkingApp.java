package gr.aueb.cf.ch6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * We give the inbound time and outbound time of cars in a parking lot
 * in a form of double-array.
 * Checks parked cars and gives the biggest number
 * of parked cars at the same time.
 */
public class ExParkingApp {

    public static void main(String[] args) {

        int[][] park = {{1012, 1136}, {1317, 1417}, {1015, 1020}};
        int[][] park2 = new int[6][2];
        int[] parked = new int[6];

        for (int i = 0; i < 3; i++) {
            park2[i][0] = park [i][0];
            park2[i+3][0] = park [i][1];
            park2[i][1] = 1;
            park2[i+3][1] = 0;
        }

        for (int[] row : park2) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();

        sortByColumn(park2,0);

        for (int[] row : park2) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < parked.length; i++) {
            parked[i] = park2 [i][1];
        }

        System.out.println("Maximum parked cars: " + togetherParked(parked, 0));

        int[] test = {1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0};
        System.out.print(togetherParked(test, 0));
    }

    /**
     * Sorts the array in ascending order according to a given column
     *
     * @param arr       the input array
     * @param col       the column to be sorted
     */
    public static void sortByColumn(int arr[][], int col) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare (final int[] entry1, final int[] entry2) {
                if (entry1[col] > entry2[col])
                    return 1;
                else
                    return -1;
            }
        });
    }

    /**
     * Checks the elements of an array for a key number and returns
     * the largest number of the consecutively repeated elements
     *
     * @param arr       the input array
     * @param key       the element to be searched
     * @return          the largest number of repeated elements
     */

    public static int togetherParked(int[] arr, int key) {
        int largest = 0;
        int count = 0;

        for (int j : arr) {
            if (j == key) {
                count++;
            } else {
                count = 0;
            }
            if (count > largest) {
                largest = count;
            }
        }
        return largest;
    }
}
