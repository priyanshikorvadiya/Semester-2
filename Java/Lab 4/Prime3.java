//Write a program in Java to print all 3-digit prime numbers.[C] 
import java.util.Scanner;
public class Prime3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 100;

        int i = 1;
        int count = 0;
        for(num1 = 100 ; num1 <= 999 ; num1++){
            if(num1 % i == 0){
                count++;
            }
            i++;
        
        if(count == 2){
            System.out.println("Prime number is" + num1);
        }
    }
        sc.close();
    }
}    
    
