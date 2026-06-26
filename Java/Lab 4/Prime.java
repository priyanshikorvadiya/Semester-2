//Write a program to check that the given number is prime or not.[A] 
import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        //Method calling
        NumPrime(num);

        sc.close();
    }
    //Method that checks number is prime or not
    public static void NumPrime(int num){
        int i = 1;
        int count = 0;
        while(num >= i){
            if(num % i == 0){
                count++;
            }
            i++;
        } 
        if(count == 2){
            System.out.println("Given number is Prime Number");
        }
        else{
            System.out.println("Given number is not Prime Number");
        }
    }
}