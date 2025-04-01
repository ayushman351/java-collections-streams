import java.io.*;

public class FileReaderExample {

    // Method to read the file content
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read and print the content of the file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle IOException when file is not found or other I/O errors
            System.out.println("File not found");
        }
    }

    public static void main(String[] args) {
        String fileName = "data.txt";  // File to read

        // Attempt to read the file
        readFile(fileName);
    }
}
