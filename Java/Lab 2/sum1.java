import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no-1:");
        int i = sc.nextInt();
        
        System.out.println("Enter no-2:");
        int j = sc.nextInt();
        
        // Corrected print statement
        System.out.println("The sum is: " + (i + j));
        
        sc.close(); // Clean up memory
    }
}