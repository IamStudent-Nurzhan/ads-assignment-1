
import java.util.Scanner;

public class task1 {
    /**
     * This program finds the minimum element in an array.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter the number of elements: "); // Prompt the user to enter the number of elements
        int n = scanner.nextInt(); // Read the number of elements
        int[] arr = new int[n]; // Initialize an array of the given size
        System.out.println("Enter the elements:"); // Prompt the user to enter the elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read each element into the array
        }

        int min = arr[0]; // Initialize the minimum with the first element
        for (int num : arr) {
            if (num < min) {
                min = num; // Update the minimum if a smaller element is found
            }
        }

        System.out.println("Minimum element: " + min); // Print the minimum element
    }
}



