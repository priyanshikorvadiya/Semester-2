/* Write a Java program to create an abstract class Vehicle with abstract methods 
startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the 
Vehicle class and implement the respective methods to start and stop the engines for 
each vehicle type.[B] */

import java.util.Scanner;

// Abstract base class
abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

// Car subclass
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key ignition.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a kick or button.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

// Main class to test with user input
public class VehicleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a vehicle type:");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car();
        } else if (choice == 2) {
            vehicle = new Motorcycle();
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        vehicle.startEngine();
        vehicle.stopEngine();

        scanner.close();
    }
}