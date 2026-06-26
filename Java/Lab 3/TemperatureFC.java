//Wap to convert temperature from ferenhit to celcius
import java.util.Scanner;
public class TemperatureFC{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter f");
        double f=sc.nextDouble();
        System.out.println("temperature in cecius ((f-32)*5/9):"+((f-32)*5/9));
        sc.close();
    }
}
