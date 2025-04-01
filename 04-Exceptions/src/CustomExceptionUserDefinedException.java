import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionUserDefinedException {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Ask the user for their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();  // Read user input for age

            // Call the validateAge method to check the age
            validateAge(age);

            // If no exception occurs, print the success message
            System.out.println("Access granted!");
        } catch (InvalidAgeException e) {
            // Handle the custom exception and display the message
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner in the finally block
            scanner.close();
        }
    }
}
