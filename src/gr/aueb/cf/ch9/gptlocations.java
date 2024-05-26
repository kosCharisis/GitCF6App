package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.file.*;
import java.util.*;


public class gptlocations {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java InsertWords <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try {
            // Read all lines from the file

            Path path = Paths.get("C:/tmp/locations.txt");
            List<String> lines = Files.readAllLines(path);

            if (lines.isEmpty()) {
                System.out.println("Input file is empty.");
                return;
            }

            // Extract words from the first line
            String firstLine = lines.get(0);
            String[] firstLineWords = firstLine.split(" +");



            // Open a BufferedWriter to write to the output file
            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                // Process each of the other lines
                for (int i = 1; i < lines.size(); i++) {
                    String[] lineWords = lines.get(i).split(" +");
                    List<String> modifiedWords = new ArrayList<>();

                    // Insert the words from the first line between the words of the current line
                    int minLength = Math.min(firstLineWords.length, lineWords.length);
                    for (int j = 0; j < minLength; j++) {
                        modifiedWords.add(lineWords[j]);
                        modifiedWords.add(firstLineWords[j]);
                    }

                    // If the current line has more words than the first line
//                    for (int j = minLength; j < lineWords.length; j++) {
  //                      modifiedWords.add(lineWords[j]);
    //                }

                    // If the first line has more words than the current line
//                    for (int j = minLength; j < firstLineWords.length; j++) {
  //                      modifiedWords.add(firstLineWords[j]);
    //                }

                    // Write the modified words to the output file
                    for (String word : modifiedWords) {
                        writer.write(word + " ");
                    }
                    writer.newLine();
                }
            }

            System.out.println("Words have been modified and written to " + "C:/tmp/locationsmod.txt");

            System.out.println(path);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
