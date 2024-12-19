

package Main;

import employees.Employee2;
import employees.Manager;

public class Main {
    public static void main(String[] args) {
        // Create instances of Employee2 and Manager at the beginning
        Employee2 employee = new Employee2("Alice", 50000);
        Manager manager = new Manager("Bob", 75000, "IT");

        // Use the instances below
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());

        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager Salary: " + manager.getSalary());
        System.out.println("Manager Department: " + manager.getDepartment());

        // Update manager's department and display the changes
        manager.setDepartment("HR");
        System.out.println("Updated Manager Department: " + manager.getDepartment());
    }
}
