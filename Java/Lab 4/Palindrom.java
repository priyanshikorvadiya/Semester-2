//Write a program to find that given Number is palindrome or not. [B]
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number");
        int num = sc.nextInt();

        //Method calling
        Determiner(num);
        sc.close();
    }
    //Checks that number is palindrome or not
    public static void Determiner(int num){
        int tempN = num;
        int digit = 0;
        int rev = 0;
        while(tempN != 0){
           digit = tempN % 10;
           rev = rev * 10 + digit;
           tempN = tempN / 10;
        }
        if(rev == num){
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("Given number is not palindrome");
        }
    }
}