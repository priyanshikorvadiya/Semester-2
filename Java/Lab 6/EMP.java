/*Write a Java program to create a class called Employee with a name, job title, and salary 
attributes, and methods to calculate and update salary. */
import java.util.Scanner;

class Employee {
    String name;
    String job_title;
    double salary;
    double bonus;   // bonus declared once

    // Setter method
    void setter(String n, String j, double s, double b) {
        name = n;
        job_title = j;
        salary = s;
        bonus = b;
    }

    // Getter method
    void getter() {
        System.out.println("Name = " + name);
        System.out.println("Job Title = " + job_title);
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + bonus);
    }

    // Calculate salary with bonus (first salary)
    void calculateSalary() {
        System.out.println("Salary with Bonus = " + (salary + bonus));
    }

    // Update salary and add bonus again
    void updateSalary(double newSalary) {
        salary = newSalary;
        System.out.println("Updated Salary with Bonus = " + (salary + bonus));
    }
}

public class EMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();

        System.out.println("Enter name:");
        String name = sc.next();

        System.out.println("Enter job title:");
        String job = sc.next();

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter bonus:");
        double bonus = sc.nextDouble();

        // set values
        e1.setter(name, job, salary, bonus);

        e1.getter();

        System.out.println("\n--- First Salary with Bonus ---");
        e1.calculateSalary();

        System.out.println("\nEnter new salary to update:");
        double newSalary = sc.nextDouble();

        System.out.println("\n--- Updated Salary with Bonus ---");
        e1.updateSalary(newSalary);

        sc.close();
    }
}