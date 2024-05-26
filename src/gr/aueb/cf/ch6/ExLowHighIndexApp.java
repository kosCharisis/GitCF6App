package gr.aueb.cf.ch6;

/**
 * Checks if a key (ex. 8) exists in the sorted array.
 * If it exists returns the low and the high indexes for the array
 * using a method.
 */
public class ExLowHighIndexApp {

    public static void main(String[] args) {
       int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
       int key = 8;
       int position = -1;
       int[] limits; // = getLowAndHighIndexOf(arr, key);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println(" Key NOT Found");
        }
        else {
            System.out.printf("The element %d was at first found at index %d\n", key, position);

            //limits = getLowAndHighIndexOf(arr, key);

            System.out.print("Low and High Index: ");

            for (int i : getLowAndHighIndexOf(arr, key)) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     *Checks the elements of a sorted array for a key number
     *and returns the low and high indexes of them
     *
     * @param arr       the input array
     * @param key       the key number
     * @return          low and high index
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int lowIndex = -1;
        int highIndex = -1;
        int[] limits;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lowIndex = i;
                break;
            }
        }

        for (int j = lowIndex; j < arr.length - 1; j++) {
            if (arr[j] != arr[j + 1]) {
                break;
            }
            highIndex = j + 1;
        }

        limits = new int[] {lowIndex, highIndex};
        return limits;
    }
}
