import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {
        // File path for the "info.txt" file
        String filePath = "info.txt";

        // Use try-with-resources to automatically close the BufferedReader after reading
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Read and print the first line of the file
            String firstLine = br.readLine();
            if (firstLine != null) {
                System.out.println("First line of the file: " + firstLine);
            } else {
                System.out.println("The file is empty.");
            }
        } catch (IOException e) {
            // Handle IOException if file is not found or an error occurs while reading
            System.out.println("Error reading file");
        }
    }
}
