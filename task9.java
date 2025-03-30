import java.util.Scanner;

public class task9 {
    /**
     * This program calculates the binomial coefficient C(n, k).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter the value of n: "); // Prompt the user to enter the value of n
        int n = scanner.nextInt(); // Read the value of n
        System.out.print("Enter the value of k: "); // Prompt the user to enter the value of k
        int k = scanner.nextInt(); // Read the value of k
        System.out.println("Binomial Coefficient C(" + n + ", " + k + ") = " + binomialCoefficient(n, k)); // Print the binomial coefficient
        scanner.close(); // Close the scanner
    }

    /**
     * Recursive method to calculate the binomial coefficient.
     *
     * @param n The value of n.
     * @param k The value of k.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        // Base cases: if k is 0 or k is equal to n, the coefficient is 1
        if (k == 0 || k == n) {
            return 1;
        }
        // Recursive case: use Pascal's rule to compute the coefficient
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
