package ControlStatements;

public class ControlStatements {
    public static void main(String[] args) {
        fizzBuzzVariation();
    }

    public static void fizzBuzzVariation() {
        for (int i = 1; i <= 100; i++) {
            // Handle multiples of 3 and 5 first
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Check for prime numbers
            else if (isPrime(i)) {
                System.out.println("Prime");
            }
            // Otherwise, just print the number
            else {
                System.out.println(i);
            }
        }
    }

    // Optimized helper function to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false; // Numbers less than 2 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Not a prime number
        }
        return true; // Prime number
    }
}

