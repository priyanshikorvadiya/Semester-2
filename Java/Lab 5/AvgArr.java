/*Write a program that creates and initializes a four integer element array. Calculate and 
display the average of its values.[A]  */
import java.util.Scanner;
public class AvgArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];

        //Allocating value
        for(int i = 0;i < a.length; i++){
            System.out.print("Enter a["+i+"]:");
            a[i] = sc.nextInt();
        }

        //Printing array
        for(int i : a){
            System.out.println(i+",");
        }

        //Method calling
        float avg = Avg(a);
        System.out.println("Avg of all the arry elements is : " +(avg));
        sc.close();
    }

    //Method for average of all the elements of an array
    public static float Avg(int[] a){
        int sum = 0;
        for(int i = 0;i < a.length; i++){
            sum = sum + a[i];
        }
        float avg = sum / 4;
    return avg;
    }
}