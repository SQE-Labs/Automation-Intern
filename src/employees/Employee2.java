/*Create a class Employee with private fields for name and salary. Provide public getter and setter methods for these
fields. Create a subclass Manager that adds a private field for department and provides public getter and setter methods
for it.*/

package employees;

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
}
