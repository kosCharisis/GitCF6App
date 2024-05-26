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

            in.nextLine(); //consumes first line and ignore

            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(","); //read lines and split where commas

                pw.print("{location: '" + tokens[0] + "', latitude: "
                        + tokens[1] + ", longitude: " + tokens[2] + " },");
                pw.flush(); // creates the desired format using the columns from txt

                pw.println();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
