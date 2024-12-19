// Derived class 1
class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, boolean hasCarrier) {
        super(brand);
        this.hasCarrier = hasCarrier;
    }

    public void displayInfo() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        Bike myBike = new Bike("Yamaha", true);

        myCar.startEngine();
        myCar.displayInfo();

        myBike.startEngine();
        myBike.displayInfo();
    }
}
