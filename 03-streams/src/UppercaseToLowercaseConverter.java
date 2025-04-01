import java.io.*;

public class UppercaseToLowercaseConverter {

    // Method to read the file, convert uppercase to lowercase, and write to another file
    public static void convertUppercaseToLowercase(String inputFilePath, String outputFilePath) {
        try (
            // BufferedReader for reading the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            // BufferedWriter for writing to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            
            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Convert the line to lowercase
                String lowerCaseLine = line.toLowerCase();
                // Write the lowercase line to the output file
                writer.write(lowerCaseLine);
                writer.newLine();  // Write a new line
            }

            System.out.println("File converted successfully and saved to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error processing the files: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "input.txt";  // Path to the input file
        String outputFilePath = "output.txt";  // Path to the output file

        // Call method to convert uppercase to lowercase and save to output file
        convertUppercaseToLowercase(inputFilePath, outputFilePath);
    }
}
