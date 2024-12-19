/*Create a base class Animal with a method makeSound(). Then create two subclasses, Dog and Cat, that override
the makeSound() method to print "Woof" and "Meow" respectively.*/


public class Animal {
    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }


    public static void main(String[] args) {
        // Create instances of Dog, Cat, Bird, and Horse
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();
        Animal horse = new Horse();

        // Call the makeSound method on each instance
        dog.makeSound(); // Should print "Woof"
        cat.makeSound(); // Should print "Meow"
        bird.makeSound(); // Should print "Tweet"
        horse.makeSound(); // Should print "Neigh"
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

// Subclass Bird
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Tweet");
    }
}

// Subclass Horse
class Horse extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Neigh");
    }
}

