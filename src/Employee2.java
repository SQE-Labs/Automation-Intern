public class Employee2 {

    // Private fields for name and salary
    private String name;
    private double salary;

    // Constructor to initialize Employee2
    public Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Test Employee2 and Manager classes
        Employee2 Employee2 = new Employee2("Alice", 50000);
        System.out.println("Employee2 Name: " + Employee2.getName());
        System.out.println("Employee2 Salary: " + Employee2.getSalary());

        Manager manager = new Manager("Bob", 75000, "IT");
        System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager Salary: " + manager.getSalary());
        System.out.println("Manager Department: " + manager.getDepartment());

        manager.setDepartment("HR");
        System.out.println("Updated Manager Department: " + manager.getDepartment());
    }
}

// Subclass Manager
class Manager extends Employee2 {

    // Private field for department
    private String department;

    // Constructor to initialize Manager
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }
}
