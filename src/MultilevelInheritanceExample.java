class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, int numberOfDoors, int batteryCapacity) {
        super(brand, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery() {
        System.out.println("Charging " + batteryCapacity + " kWh battery...");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 4, 100);
        tesla.startEngine();
        tesla.displayInfo();
        tesla.chargeBattery();
    }
}
