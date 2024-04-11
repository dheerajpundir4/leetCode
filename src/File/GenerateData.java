package File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class GenerateData {
    GenerateData(){


    }

    public static void generateTxtData() {
        String inputFile = "input.txt"; // Path to the input file


        try {
            // Check if the input file exists, create it if not
            File file = new File(inputFile);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Input file created successfully.");
            }

            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));

            String line;
            // Read each line from the input file and write it to the output file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a newline character after each line
            }
            //generate the data
            for (int i = 2; i < 10; i++) {
                String str = i + " square " + (i * i);
                writer.write(str);
                writer.newLine();
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
    public static void generatePdfData() {
        String inputFile = "input.csv"; // Path to the input file


        try {
            // Check if the input file exists, create it if not
            File file = new File(inputFile);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Input file created successfully.");
            }

            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));

            String line;
            // Read each line from the input file and write it to the output file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a newline character after each line
            }
            //generate the data
            for (int i = 2; i < 10; i++) {
                String str = i + " square " + (i * i);
                writer.write(str);
                writer.newLine();
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
