//WAP to find largest from three
import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        double a=sc.nextDouble();
        System.out.println("Enter b");
        double b=sc.nextDouble();
        System.out.println("Enter c");
        double c=sc.nextDouble();
        if(a>b){
            if(a>c){
                System.out.println("a is largest");  
            }
            else{
                System.out.println("c is largest");
            }
        }
        else{
            if(b>c){
                System.out.println("b is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
        sc.close();
    }
}
