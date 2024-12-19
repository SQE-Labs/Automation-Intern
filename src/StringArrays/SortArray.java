package StringArrays;

import java.util.Scanner; // Import Scanner class
import java.util.Arrays;  // Import Arrays class

public class SortArray {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store integers
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Take each integer input
        }

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sort the array using Arrays.sort() method
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Close the scanner object
        scanner.close();
    }
}

