//WAP that reads a number in meters and converts it into feet and displays the result
import java.util.Scanner;
public class Feet{

public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter value in meters:");
      double meter = sc.nextDouble();

      double feet = meter * 3.28084;
      System.out.println("Value in feet="+feet);
      sc.close();
}
}