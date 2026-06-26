/* Declare a class called book having author_name as private data member. Extend book 
class to have two sub classes called book_publication & paper_publication. Each of 
these classes have private member called title. Write a complete program to show 
usage of dynamic method dispatch (dynamic polymorphism) to display book or paper 
publications of given author. [B] */

import java.util.Scanner;

// Base class
class Book {
    private String author_name;

    public void getAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter author name: ");
        author_name = sc.nextLine();
        sc.close();
    }

    // Virtual method (automatically virtual in Java)
    public void display() {
        System.out.println("Author: " + author_name);
    }
}

// Derived class 1
class Book_Publication extends Book {
    private String title;

    public void getTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        title = sc.nextLine();
        sc.close();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Book Title: " + title);
    }
}

// Derived class 2
class Paper_Publication extends Book {
    private String title;

    public void getTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter paper title: ");
        title = sc.nextLine();
        sc.close();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Paper Title: " + title);
    }
}

// Main class
public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book bptr;  // Base class reference
        Book_Publication b = new Book_Publication();
        Paper_Publication p = new Paper_Publication();

        int choice;

        System.out.println("Enter 1 for Book Publication");
        System.out.println("Enter 2 for Paper Publication");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            b.getAuthor();
            b.getTitle();
            bptr = b;
        } else if (choice == 2) {
            p.getAuthor();
            p.getTitle();
            bptr = p;
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("\nDisplaying details:");
        bptr.display();   // Dynamic Method Dispatch

        sc.close();
    }
}