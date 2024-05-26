package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMethod {

    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("C:/tmp/file6out.txt");

            printMesssage(ps, "Hello Coding Factory!");
            printMesssage(System.out, "Hello CF!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Generic print Method.
     *
     * @param ps        the PrintStream.
     * @param message   the message to print.
     */
    public static void printMesssage(PrintStream ps, String message) {
        ps.println(message);
    }
}
