public class Employee {

    // Private instance variables
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    // Constructor to initialize the Employee object
    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter for employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter for employeeName
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter for employeeSalary (returns a formatted string)
    public String getEmployeeSalary() {
        return String.format("$%,.2f", employeeSalary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(101, "John Doe", 75000.00);

        // Access and modify the id and name
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: " + employee.getEmployeeSalary());

        // Modify the employee ID and name
        employee.setEmployeeId(102);
        employee.setEmployeeName("Jane Smith");

        System.out.println("Updated Employee ID: " + employee.getEmployeeId());
        System.out.println("Updated Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: " + employee.getEmployeeSalary());
    }
}
