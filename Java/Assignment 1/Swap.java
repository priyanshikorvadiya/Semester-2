//Write a Java program to swap two numbers using bitwise XOR. 
import java.util.Scanner;
public class Swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        
        System.out.println("Before swapping: a = "+ a +", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = "+ a +", b = " + b);

        sc.close();
    }
}