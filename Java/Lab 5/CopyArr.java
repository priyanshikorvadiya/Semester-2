/*Write a Java program to copy all the elements of an array to another array and print 
both the array elements. [B]  */
import java.util.Arrays;
import java.util.Scanner;
public class CopyArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size = sc.nextInt();
        int[] a = new int[size];

        //Allocating value
        for(int i = 0;i < a.length; i++){
            System.out.print("Enter a["+i+"]:");
            a[i] = sc.nextInt();
        }

        //Printing array
        for(int i : a){
            System.out.println(i+", ");
        }

        //Method calling
        int[] ca = Copy(a);
        System.out.println("Copied array: " + (Arrays.toString(ca)));

        sc.close();
    }
    
    //Method to copy an array
    public static int[]  Copy(int[] a){
        int[] ca = new int[a.length];
        for(int i = 0 ; i < a.length; i++){
            ca[i] = a[i];
        }
        return ca;
    }
}