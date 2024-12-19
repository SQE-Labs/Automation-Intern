// Base class for geometry-related calculations
class Geometry {
    // Method to calculate the area (overloaded for different shapes)
    double calculateArea(double side) {
        // Area of a square
        return side * side;
    }

    double calculateArea(double length, double width) {
        // Area of a rectangle
        return length * width;
    }

    double calculateArea(double radius, boolean isCircle) {
        // Area of a circle
        // Using the formula π * r^2
        return Math.PI * radius * radius;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Create an instance of the Geometry class
        Geometry geometry = new Geometry(); // Instance is required for non-static methods

        // Calculate and display the area of a square
        double squareArea = geometry.calculateArea(5.0); // Side = 5
        System.out.println("Area of Square: " + squareArea);

        // Calculate and display the area of a rectangle
        double rectangleArea = geometry.calculateArea(5.0, 10.0); // Length = 5, Width = 10
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculate and display the area of a circle
        double circleArea = geometry.calculateArea(7.0, true); // Radius = 7
        System.out.println("Area of Circle: " + circleArea);
    }
}
