import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;

public class Solution {

    public static void main(String[] args) {
        String inputFile = "input.txt"; // Path to the input file
        String outputFile = "output.txt"; // Path to the output file

        try {
            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            // Read each line from the input file and write it to the output file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a newline character after each line
            }

            // Close the reader and writer
            reader.close();
            writer.close();

            System.out.println("File has been read from and written to successfully.");
        } catch (IOException e) {
            // Handle any IO exceptions that may occur
            System.err.println("Error reading/writing file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
