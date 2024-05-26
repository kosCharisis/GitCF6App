package gr.aueb.cf.ch7;

/**
 * Takes a String and cypher it by means of replacing every
 * character with its next one (ex. ASCII-wise)
 * Takes the cyphered String and deciphers it by means of
 * replacing every character with its previous one.
 */
public class CypherDecipherApp {

    public static void main(String[] args) {
        String s = "cat 123 & DOG ενα";
        int key = 1;

        String cypher = "";
        for (char c : s.toCharArray()) {
            cypher += Character.toString((char)(c + key));
        }
        System.out.println(cypher);

        String decipher = "";
        for (char c : cypher.toCharArray()) {
            decipher += Character.toString((char)(c - key));
        }
        System.out.println(decipher);
    }
}
