// WAP to calculate area of rectangle
import java.util.Scanner;
public class AreaOfRec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter l");
        double l=sc.nextDouble();
        System.out.println("Enter b");
        double b=sc.nextDouble();
        System.out.println("Area (l*b):"+(l*b));
        sc.close();
    }
}
