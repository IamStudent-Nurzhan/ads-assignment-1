import java.util.Scanner;

public class task2 {
    /**
     * This program calculates the average of elements in an array.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter the size of the array: "); // Prompt the user to enter the size of the array
        int n = scanner.nextInt(); // Read the size of the array
        int[] arr = new int[n]; // Initialize an array of the given size
        System.out.println("Enter the elements:"); // Prompt the user to enter the elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read each element into the array
        }

        int sum = 0; // Initialize sum to zero
        for (int num : arr) {
            sum += num; // Add each element to the sum
        }

        double average = (double) sum / n; // Calculate the average
        System.out.println("Average: " + average); // Print the average
    }
}

