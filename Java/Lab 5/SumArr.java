//Write a Java program to sum values of an array.[A] 
import java.util.Scanner;
public class SumArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] a = new int[size];

        //Allocating value
        for(int i = 0;i < a.length; i++){
            System.out.print("Enter a["+i+"]:");
            a[i] = sc.nextInt();
        }

        //Printing array
        for(int i : a){
            System.out.println(i+",");
        }

        //Method calling
        int sum = Sum(a);
        System.out.println("Sum of all the arry elements is : " +(sum));
        sc.close();
    }

    //Method for sum of all the elements of an array
    public static int Sum(int[] a){
        int sum = 0;
        for(int i = 0;i < a.length; i++){
            sum = sum + a[i];
        }
    return sum;
    }
}