package employees;

public class Manager extends Employee2 {
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
