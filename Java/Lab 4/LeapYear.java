//Write a program to check whether a year is leap year or not.[B] 
import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int y = sc.nextInt();

        //Method calling
        Year(y);

        sc.close();
    }
        //Method that checks that year is leap year or not
    public static void Year(int y){
        if(y % 400 == 0){
            System.out.println("Year is Leap Year");
        }
        else if(y % 4 == 0 && y % 100 != 0){
            System.out.println("Year is Leap year");
        }
        else{
            System.out.println("Year is not Leap Year");
        }
    }
}