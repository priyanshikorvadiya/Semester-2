/* The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
Write a java program that demonstrates how to establish this class hierarchy. Declare 
one instance variable of type String that indicates the color of a vegetable. Create and 
display instances of these objects. Override the toString() method of object to return a 
string with the name of vegetable and its color. [A] */

import java.util.Scanner;

// Abstract base class
abstract class Vegetable {
    String color;

    Vegetable(String color) {
        this.color = color;
    }

    public abstract String toString();
}

// Subclasses
class Potato extends Vegetable {
    Potato(String color) { super(color); }
    public String toString() { return "Potato is " + color; }
}

class Brinjal extends Vegetable {
    Brinjal(String color) { super(color); }
    public String toString() { return "Brinjal is " + color; }
}

class Tomato extends Vegetable {
    Tomato(String color) { super(color); }
    public String toString() { return "Tomato is " + color; }
}

// Main class
public class VegetableDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a vegetable:");
        System.out.println("1. Potato");
        System.out.println("2. Brinjal");
        System.out.println("3. Tomato");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the color of the vegetable: ");
        String color = scanner.next();

        Vegetable veg;
        switch (choice) {
            case 1: veg = new Potato(color); break;
            case 2: veg = new Brinjal(color); break;
            case 3: veg = new Tomato(color); break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        System.out.println(veg);
        scanner.close();
    }
}