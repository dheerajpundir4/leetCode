package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FileReadWriteExample {

    public static void main(String[] args) {
        String inputFile = "input.txt"; // Path to the input file
        String inputPdfFile = "input.csv"; // Path to the input file
        String outputFile = "output.txt"; // Path to the output file

        GenerateData.generateTxtData();
        GenerateData.generatePdfData();

        try {
            // Check if the input file exists, create it if not
            File file = new File(inputFile);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Input file created successfully.");
            }

            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedReader reader2 = new BufferedReader(new FileReader(inputPdfFile));

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            String line2;
            // Read each line from the input file and write it to the output file
            while ((line = reader.readLine()) != null && (line2 = reader2.readLine()) != null) {
                writer.write(line +" -->");
                writer.write(line2);
                writer.newLine(); // Add a newline character after each line
            }
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a newline character after each line
            }

            // Close the reader and writer
            reader.close();
            reader2.close();
            writer.close();

            System.out.println("File has been read from and written to successfully.");
        } catch (IOException e) {
            // Handle any IO exceptions that may occur
            System.err.println("Error reading/writing file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

