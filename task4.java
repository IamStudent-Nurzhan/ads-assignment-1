import java.util.Scanner;

public class task4 {
    /**
     * This program calculates the factorial of a given number using recursion.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter a number: "); // Prompt the user to enter a number
        int n = scanner.nextInt(); // Read the number
        System.out.println("Factorial: " + factorial(n)); // Print the factorial of the number
    }

    /**
     * Recursive method to calculate the factorial of a number.
     *
     * @param n The number to calculate the factorial for.
     * @return The factorial of the number.
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return factorial(n - 1) * n; // Recursive case: n! = (n-1)! * n
        }
    }
}
