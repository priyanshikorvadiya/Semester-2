/*A power company charges:
₹5 per unit for first 100 units
₹7 per unit for next 100 units
₹10 per unit beyond 200 units
Write a Java program to calculate the total electricity bill using arithmetic operators. */
import java.util.Scanner;
public class ElectricityBill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter used units");
        int u = sc.nextInt();
        int bill = 0;
        
        if(u <= 100){
            bill = u * 5;
        }
        else if(u <= 200){
            bill = (100 * 5) + ((u-100) * 7);
        }
        else{
            bill = (100 * 5) + (100 * 7) + ((u-200) * 10);
        }
        System.out.println("Electricity bill is:"+bill);
        sc.close();
    }
}