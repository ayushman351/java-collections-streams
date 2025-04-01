import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionProgram {

    // Method to perform division
    public static void divideNumbers() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();  // Read the first number
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();  // Read the second number

            // Perform division and display the result
            double result = num1 / num2;
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            // Handle invalid input (non-numeric value)
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            // Close the scanner object in the finally block
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }

    public static void main(String[] args) {
        divideNumbers();  // Call the method to perform division
    }
}
