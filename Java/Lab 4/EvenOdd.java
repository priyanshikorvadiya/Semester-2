//Write a program to check whether a number is even or odd.[A] 
import java.util.Scanner;;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        //Method calling
        Determination(num);

        sc.close();
    }
        //Checks even or odds
    public static void Determination(int num){
        if(num % 2 == 0){
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }
    }
}