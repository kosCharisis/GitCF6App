package gr.aueb.cf.ch6;

/**
 * We specify an array
 * We use methods to return specific requests
 */
public class ExMethodsArrayApp {

    public static void main(String[] args) {
        int[] arr = {19, 34, 55, 20, 12, 72, 21, 19, 25};
        int value = 12;
        int position;
        int[] evenArr = filterEven(arr);
        int[] mappedArray = mapDouble(arr);

        position = getPosition(arr, value);
        System.out.printf("Position: %d, Value: %d\n", position + 1, arr[position]);

        traverseEven(evenArr); //traverseEven(filterEven(arr));
        traverseDouble(mappedArray); //traverseDouble(mapDouble(arr));
        System.out.printf("The array has at least one positive element: %b\n", hasOnePositive(arr));
        System.out.printf("All elements in the array are positive: %b",areAllPositive(arr));

    }

    /**
     * Searches the array to find a specific value. If the
     * value is found, the position of the array is returned.
     * Time complexity is linear O(n).
     *
     * @param arr       the input array
     * @param value     the requested value
     * @return          the position of the requested value
     */
    public static int getPosition(int[] arr, int value) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    /**
     * Searches the array for even values.
     * Counts the even values and creates the new array.
     * Then populates the new array with the even values.
     *
     * @param arr       the input array
     * @return          a new array of the even values
     */
    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count ++;
            }
        }

        int[] returnedArr = new int[count];
        count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                returnedArr[count] = item;
                count++;
            }
        }
        return returnedArr;
    }

    public static void traverseEven(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Double the value of each item of an array.
     *
     * @param arr   the input array.
     * @return      a new array with elements
     *              equal to double the initial
     *              array elements.
     */
    public static int[] mapDouble(int[] arr) {
        int[] arrayToReturn = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = arr[i] * 2;
        }
        return arrayToReturn;
    }

    public static void traverseDouble(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Checks if there is at least one positive in the input array.
     *
     * @param arr   the input array.
     * @return      false otherwise
     *
     */
    public static boolean hasOnePositive(int[] arr) {
        boolean hasPositive = false;

        for (int item: arr) {
            if (item > 0) {
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }

    /**
     * Checks if there are all positive in the input array.
     *
     * @param arr   the input array.
     * @return      false otherwise
     *
     */
    public static boolean areAllPositive(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }
}
