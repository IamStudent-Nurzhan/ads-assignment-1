import java.util.Scanner;

public class task5 {
    /**
     * This program prints the Fibonacci sequence up to a given number N.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.println("Enter the value of N: "); // Prompt the user to enter the value of N
        int N = sc.nextInt(); // Read the value of N
        for (int i = 0; i <= N; i++) {
            System.out.println("fib(" + i + ") = " + fib(i)); // Print Fibonacci numbers up to N
        }
        sc.close(); // Close the scanner
    }

    /**
     * Recursive method to calculate the Fibonacci number.
     *
     * @param n The position in the Fibonacci sequence.
     * @return The Fibonacci number at position n.
     */
    public static int fib(int n) {
        if (n <= 1) {
            return n; // Base case: fib(0) = 0, fib(1) = 1
        }
        return fib(n - 1) + fib(n - 2); // Recursive case: fib(n) = fib(n-1) + fib(n-2)
    }
}

