/*Write a Java program that divides two numbers.  If Num1 or Num2 were not an integer, 
the program would throw a Number Format Exception. If Num2 were Zero, the program 
would throw an Arithmetic Exception. Display appropriate message for each exception. 
[B]  */

import java.util.Scanner;

public class NumberFormat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int ans = a / b;
            System.out.println("ans:"+ans);
            int Display = Integer.parseInt("number divides!");
        } catch (NumberFormatException ne) {
            System.out.println(ne.getMessage());
        }
        sc.close();
    }
}

