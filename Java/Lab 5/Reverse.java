//Write a program to print given array in reverse order.
import java.util.Arrays;
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        //Allocating value
        for(int i = 0;i < arr.length;i++){
           System.out.print("Enter arr["+i+"]");
           arr[i] = sc.nextInt();
        }

        //Printing array
        for(int i = 0;i < arr.length;i++){
           System.out.println("arr["+i+"]:" + arr[i]);
        }

        //Method calling for reversing an array
        arr = reverseArray(arr);
        System.out.println("Reversed Array: " + (Arrays.toString(arr)));

        sc.close();
    }

    //Method to find reversed array
    public static int[] reverseArray(int[] arr){
        int index = arr.length - 1;
        int temp = 0;
        for(int i = 0;i <= index;i++){
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            index--; 
        }
        return arr;
    }

}