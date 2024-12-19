package ControlStatements;

import java.util.Scanner;

public class ControlStatements2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Employee Salary Calculator!");

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();
        sc.nextLine(); // Consume the newline

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("\nEnter details for Employee " + i + ":");

            System.out.print("Base Salary: ");
            double baseSalary = sc.nextDouble();
            sc.nextLine(); // Consume the newline

            System.out.print("Performance Rating (Excellent, Good, Average, Poor): ");
            String rating = sc.nextLine();

            System.out.print("Years of Experience: ");
            int yearsOfExperience = sc.nextInt();
            sc.nextLine(); // Consume the newline

            double finalSalary = calculateFinalSalary(baseSalary, rating, yearsOfExperience);
            System.out.printf("Final Salary for Employee %d: %.2f%n", i, finalSalary);
        }

        sc.close();
    }

    // Function to calculate the final salary
    public static double calculateFinalSalary(double baseSalary, String rating, int yearsOfExperience) {
        double bonusPercentage;

        // Determine bonus percentage based on rating
        switch (rating.toLowerCase()) {
            case "excellent":
                bonusPercentage = 0.20;
                break;
            case "good":
                bonusPercentage = 0.10;
                break;
            case "average":
                bonusPercentage = 0.05;
                break;
            case "poor":
                bonusPercentage = 0.0;
                break;
            default:
                System.out.println("Invalid performance rating. No bonus applied.");
                bonusPercentage = 0.0;
        }

        // Calculate bonus
        double bonus = baseSalary * bonusPercentage;

        // Add extra experience bonus if applicable
        if (yearsOfExperience > 5) {
            bonus += baseSalary * 0.05; // Extra 5% bonus
        }

        // Calculate final salary
        return baseSalary + bonus;
    }
}

