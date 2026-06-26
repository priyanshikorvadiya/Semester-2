/* Write a Java program to create an abstract class BankAccount with abstract methods 
deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that 
extend the BankAccount class and implement the respective   methods to handle 
deposits and withdrawals for each account type.[A] */

import java.util.Scanner;

// Abstract base class
abstract class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into SavingsAccount. Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from SavingsAccount. Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in SavingsAccount!");
        }
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    private double currentLimit;

    CurrentAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into CurrentAccount. Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + currentLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from CurrentAccount. Balance: " + balance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose account type:");
        System.out.println("1. SavingsAccount");
        System.out.println("2. CurrentAccount");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        BankAccount account;
        if (choice == 1) {
            account = new SavingsAccount(1000); // initial balance
        } else if (choice == 2) {
            account = new CurrentAccount(500, 200); // initial balance + overdraft
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        System.out.println("Enter operation: 1 for Deposit, 2 for Withdraw");
        int operation = scanner.nextInt();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        if (operation == 1) {
            account.deposit(amount);
        } else if (operation == 2) {
            account.withdraw(amount);
        } else {
            System.out.println("Invalid operation!");
        }

        scanner.close();
    }
}