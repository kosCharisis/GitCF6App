package gr.aueb.cf.ch14;

public class StringUtils {
    private StringUtils() {}

    public static String reverse(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return rev;
    }

    public static String uppercase(String s) {
        String upper = s.toUpperCase();
        return upper;
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlsoPalindrome(String s) {
        boolean equal = reverse(s).equals(s);
        return equal;
    }

}
