package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ExLocations {

    public static void main(String[] args) {
        File inFd = new File("C:/tmp/locations.txt");
        File outFd = new File("C:/tmp/locationsmod.txt");
        String line;
        String[] tokens;

        try(Scanner in = new Scanner(inFd);
            PrintStream pw = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("  +"); //spaces

                for (String token : tokens) {
                    pw.printf("Location: %s", token); //form
                    pw.flush();
                }
                pw.println();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
