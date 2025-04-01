import java.util.Scanner;

public class MultipleCatchBlocks {

    // Method to retrieve value at a given index from the array
    public static void getValueAtIndex(int[] array, int index) {
        try {
            // Try to print the value at the specified index
            if (array == null) {
                throw new NullPointerException("Array is not initialized!");
            }
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle case where index is out of bounds
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            // Handle case where array is null
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a sample array
        int[] sampleArray = {10, 20, 30, 40, 50};

        try {
            // Ask the user to input an index
            System.out.print("Enter the index: ");
            int index = scanner.nextInt();  // Read the index value

            // Call the method to retrieve value at that index
            getValueAtIndex(sampleArray, index);

        } catch (Exception e) {
            // Handle any general exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the scanner object in the finally block
            scanner.close();
        }
    }
}
