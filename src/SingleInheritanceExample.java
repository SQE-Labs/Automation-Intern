

// Base class
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void startEngine() {
        System.out.println(brand + " engine started.");
    }
}

// Derived class
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}



public class SingleInheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        myCar.startEngine();
        myCar.displayInfo();
    }
}
