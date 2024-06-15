package gr.aueb.cf.ch14;

public class ValidationUtils {
    private ValidationUtils() {}

    public static boolean isValidated (String s) {
        if (s.length() < 1 || s.length() > 31) {
            return false;
        }
        return true;
    }

    public static boolean isValidatedNumber (int i) {
        if (i < 1 || i > 10) {
            return false;
        }
        return true;
    }

}
