public class Animal {

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call the makeSound method on each instance
        dog.makeSound(); // Should print "Woof"
        cat.makeSound(); // Should print "Meow"
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
