package gr.aueb.cf.ch6;

/**
 * Finds max value element of an array
 * and returns the position of the array of the max number
 */
public class ExMaxElementArrayApp {

    public static void main(String[] args) {
        int[] arr = {61, 42, 25, 2, 94, 31};
        int maxPosition = 0;

        maxPosition = getMaxPosition(arr);
        if (maxPosition == -1) {
            System.out.println("Error in searching...");
        }

        System.out.printf("Max Value: %d, maxPosition: %d", arr[maxPosition], maxPosition +1);
    }

    /**
     * Searches the array to find the max value. If the
     * value is found, the position of the array is returned.
     *
     * @param arr  The input array
     * @return      the position of the max value
     */
    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int maxPosition = 0;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
