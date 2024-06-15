package gr.aueb.cf.ch14;

public class MathHelper {
    private MathHelper() {}

    public static int maximum(int[] arr) {
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

    public static int minimum(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int minPosition = 0;
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        double aver;
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            }
        aver = (double)sum / arr.length;
        return aver;
    }

}
