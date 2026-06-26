/*Write a java program to compute shopping bill 
Discount rules: 
• Bill ≥ ₹5000 → 20% discount 
• Bill ≥ ₹3000 → 10% discount 
Add 5%GST to final bill amount. 
Calculate final payable amount. */
import java.util.Scanner;
public class ShoppingBill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount");
        double bill = sc.nextDouble();
        double discount = 0;
        double finalBill = 0;

        if(bill >= 5000){
            discount = bill * 0.20;
        }
        else if(bill >= 3000){
            discount = bill * 0.10;
        }

        finalBill = bill - discount + bill * 0.05;

        System.out.println(finalBill);

        sc.close();
    }
}