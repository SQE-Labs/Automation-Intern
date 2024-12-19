package Abstraction;

// Interface for making phone calls
interface PhoneCall {
    void makeCall(String phoneNumber);  // Method to make a call
}

// Interface for taking photos
interface Photography {
    void takePhoto();  // Method to take a photo
}

// Interface for playing music
interface Multimedia {
    void playMusic();  // Method to play music
}

// Smartphone class implements all three interfaces
class Smartphone implements PhoneCall, Photography, Multimedia {
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Making a call to: " + phoneNumber);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo with the camera.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music from the device.");
    }
}

public class MultipleInheritance_Interfaces {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        // Using the phone to make a call
        smartphone.makeCall("123-456-7890");

        // Using the phone to take a photo
        smartphone.takePhoto();

        // Using the phone to play music
        smartphone.playMusic();
    }
}

