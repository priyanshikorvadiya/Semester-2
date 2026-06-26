//Write a program to find maximum no from given 3 no.(without if-else).[A] 
import java.util.Scanner;
public class Maximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        System.out.println("Enter c");
        int c=sc.nextInt();

        //Method calling
        Determination(a, b, c);

        sc.close();
    }
        public static void Determination(int a,int b,int c){
        int Max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Maximum is: "+Max);
    }
}
