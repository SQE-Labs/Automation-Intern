package ControlStatements;

import java.util.Scanner;

public class PositiveIntegerInput {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        int number; // Variable to store the user's input

        // Repeatedly prompt the user until a valid positive integer is entered
        do {
            System.out.print("Please enter a positive integer: ");

            // Check if the input is a valid integer
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid number. Please enter a positive integer.");
                sc.next(); // Consume the invalid input
            }

            // Get the valid integer input
            number = sc.nextInt();

            // If the number is not positive, prompt again
            if (number <= 0) {
                System.out.println("The number must be positive. Please try again.");
            }

        } while (number <= 0); // Loop continues until the number is positive

        // Print the valid number and exit
        System.out.println("You entered the valid number: " + number);

        // Close the scanner
        sc.close();
    }
}

