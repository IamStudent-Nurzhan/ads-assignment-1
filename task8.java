import java.util.Scanner;

public class task8 {
    /**
     * This program checks if a given string consists only of digits.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading input
        System.out.print("Enter a string: "); // Prompt the user to enter a string
        String s = scanner.nextLine(); // Read the input string
        if (isAllDigits(s, 0)) {
            System.out.println("yes"); // Print "yes" if the string contains only digits
        } else {
            System.out.println("no"); // Print "no" if the string contains non-digit characters
        }
        scanner.close(); // Close the scanner
    }

    /**
     * Recursive method to check if a string consists only of digits.
     *
     * @param s The input string.
     * @param i The current index in the string.
     * @return True if all characters are digits, false otherwise.
     */
    public static boolean isAllDigits(String s, int i) {
        if (i == s.length()) {
            return true; // Base case: if we've checked all characters, return true
        }
        if (s.charAt(i) < '0' || s.charAt(i) > '9') {
            return false; // If the current character is not a digit, return false
        }
        return isAllDigits(s, i + 1); // Recursively check the next character
    }
}
