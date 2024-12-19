package ControlStatements;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Outer loop for each line
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print the number without a new line
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner object
        sc.close();
    }
}
