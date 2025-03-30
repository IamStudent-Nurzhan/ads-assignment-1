import java.util.Scanner;

public class task10 {
    /**
     * This program calculates the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.println("Enter the first number:"); // Prompt the user to enter the first number
        int n1 = scanner.nextInt(); // Read the first number
        System.out.println("Enter the second number:"); // Prompt the user to enter the second number
        int n2 = scanner.nextInt(); // Read the second number
        int a = Gcd(n1, n2); // Calculate the Greatest Common Divisor (GCD)
        System.out.println("GCD: " + a); // Print the GCD
    }

    /**
     * Recursive method to calculate the Greatest Common Divisor (GCD).
     *
     * @param n1 The first number.
     * @param n2 The second number.
     * @return The GCD of the two numbers.
     */
    private static int Gcd(int n1, int n2) {
        if (n1 % n2 == 0) {
            return n2; // Base case: if n1 is divisible by n2, return n2
        } else {
            return Gcd(n2, n1 % n2); // Recursive case: use the Euclidean algorithm
        }
    }
}
