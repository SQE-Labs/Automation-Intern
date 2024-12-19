package StringArrays;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string to reverse: ");

        // Read the user input as a string
        String str = scanner.nextLine();

        // Reverse the string using StringBuilder
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Print the reversed string
        System.out.println("Reversed string: " + reversedStr);

        // Close the scanner
        scanner.close();
    }
}

