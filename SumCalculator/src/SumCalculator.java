// Import the Scanner class from the java.util
// package to read input from the user
import java.util.Scanner;

// Define a public class named SumCalculator
public class SumCalculator {
    // Define a public static method named calculateSum
    // that takes two integers a and b as parameters
    public static int calculateSum(int a, int b) {
        // Calculate the sum of a and b and return the result
        return a + b;
    }

    // Define the main method, the entry point of the program
    public static void main(String[] args) {
        // Create a new instance of the Scanner class to
        // read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer (a)
        System.out.print("Enter the first integer (a): ");
        // Read the first integer entered by the user
        // and store it in the variable 'a'
        int a = scanner.nextInt();

        // Prompt the user to enter the second integer (b)
        System.out.print("Enter the second integer (b): ");
        // Read the second integer entered by the user
        // and store it in the variable 'b'
        int b = scanner.nextInt();

        // Call the calculateSum method with
        // the values of 'a' and 'b, and store
        // the result in the variable 'sum'
        int sum = calculateSum(a, b);

        // Display the result, which is the sum of 'a' and 'b'
        System.out.println("Sum of a and b: " + sum);
    }
}
