import java.math.BigInteger;
import java.util.Scanner;

public class task6 {
    /**
     * This program calculates the power of a number using BigInteger for large results.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter the base number a: "); // Prompt the user to enter the base number
        BigInteger a = scanner.nextBigInteger(); // Read the base number
        System.out.print("Enter the exponent n: "); // Prompt the user to enter the exponent
        int n = scanner.nextInt(); // Read the exponent
        System.out.println("Result: " + power(a, n)); // Print the result of a^n
        scanner.close(); // Close the scanner
    }

    /**
     * Recursive method to calculate the power of a number.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a^n.
     */
    public static BigInteger power(BigInteger a, int n) {
        if (n == 0) {
            return BigInteger.ONE; // Base case: a^0 = 1
        }
        return a.multiply(power(a, n - 1)); // Recursive case: a^n = a * a^(n-1)
    }
}

