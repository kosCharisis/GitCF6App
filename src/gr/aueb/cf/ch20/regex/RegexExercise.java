package gr.aueb.cf.ch20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise {

    public static void main(String[] args) {
        String s = "#&12BAcd";
        System.out.println(isGTEight(s));
        System.out.println(hasMTOneLowercase(s));
        System.out.println(hasMTOneUppercase(s));
        System.out.println(hasMTOneNumber(s));
        System.out.println(hasMTOneUppercaseLowercaseNumberChar(s));
        System.out.println(hasMTOneSpecialChat(s));

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-])^.{8,}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static boolean isGTEight(String s) {
        return s.matches(".{8,}");
    }

    public static boolean hasMTOneLowercase (String s) {
        return s.matches(".+[a-z].+");
    }

    public static boolean hasMTOneUppercase (String s) {
        return s.matches(".+[A-Z].+");
    }

    public static boolean hasMTOneNumber (String s) {
        return s.matches(".+\\d.+");
    }

    public static boolean hasMTOneUppercaseLowercaseNumberChar (String s) {
        return s.matches("(?=.+?[a-z])(?=.+?[A-Z])(?=.+?[0-9])(?=.+[#?!@$%^&*-])^.{8,}$");
    }

    public static boolean hasMTOneSpecialChat (String s) {
        return s.matches(".+[#?!@$%^&*-].+");
    }
}
