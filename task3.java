import java.util.Scanner;

public class task3 {
    /**
     * This program checks if a number is prime.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.println("Enter the number:"); // Prompt the user to enter a number
        int n = scanner.nextInt(); // Read the number

        if (n < 1) {
            System.out.println("Number needs to be greater than 1"); // Handle numbers less than 1
        } else if (n == 1) {
            System.out.println("1 is neither prime nor composite"); // Handle the special case of 1
        } else {
            boolean isPrime = true; // Variable to track if the number is prime
            for (int divisor = 2; divisor <= (n / 2); divisor++) {
                if (n % divisor == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is prime"); // Print if the number is prime
            } else {
                System.out.println(n + " is composite"); // Print if the number is composite
            }
        }
    }
}
