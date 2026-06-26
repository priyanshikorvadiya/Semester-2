//Wap to create basic calculator by getting 2 numbers and an operation (+,-,/,%,*) from user and apply the operation 
//given in string on the given numbers
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        double a=sc.nextDouble();
        System.out.println("Enter b");
        double b=sc.nextDouble();
        System.out.println("Enter operator(+,-,/,*,%)");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("Result="+(a+b));
                break;
            case '-':
                System.out.println("Result="+(a-b));
                break;
            case '/':
                System.out.println("Result="+(a/b));
                break;
            case '*':
                System.out.println("Result="+(a*b));
                break;
            case '%':
                System.out.println("Result="+(a%b));
                break;
        }
        sc.close();
    }
}