import java.util.Scanner;

public class task7 {
    /**
     * This program prints elements in reverse order using recursion.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter the number of elements: "); // Prompt the user to enter the number of elements
        int n = scanner.nextInt(); // Read the number of elements
        System.out.println("Enter the elements: "); // Prompt the user to enter the elements
        reversePrint(n, scanner); // Call the method to print elements in reverse order
        scanner.close(); // Close the scanner
    }

    /**
     * Recursive method to print elements in reverse order.
     *
     * @param n The number of elements to read.
     * @param scanner The Scanner object for reading input.
     */
    public static void reversePrint(int n, Scanner scanner) {
        if (n == 0) {
            return; // Base case: if n is 0, end the recursion
        }
        int num = scanner.nextInt(); // Read the next element
        reversePrint(n - 1, scanner); // Recursively call the method for the remaining elements
        System.out.print(num + " "); // Print the current element after the recursive call
    }
}


