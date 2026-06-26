//Name : Korwadiya Priyanshi
//Enrollment No. : 25010101133
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperation{
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
        
        //Method calling for sum of array elements
        int sum = sumArray(arr);
        System.out.println("Sum of the all elements in Array: "+(sum));

        //Method calling for multiplication of array elements
        int multi = multiArray(arr);
        System.out.println("Multiplication of the all elements in Array: "+(multi));

        //Method calling for reversing an array
        arr = reverseArray(arr);
        System.out.println("Reversed Array: " + (Arrays.toString(arr)));

        //Method calling for average of array elements
        float avg = averageArray(arr, n);
        System.out.println("Average of the all elements in array: "+(avg));

        //Method calling for largest array element
        int max = largestElementArray(arr);
        System.out.println("Largest array element is: "+(max));

        //Method calling for smallest array element
        int min = smallestElementArray(arr);
        System.out.println("Smallest array element is: "+(min));

        //Method calling for sorting an array
        arr = sortArray(arr);
        System.out.println("Sorted Array: " + (Arrays.toString(arr)) );

        sc.close();
    }

    //Method to find sum of all array element
    public static int sumArray(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    //Method to find multiplication of all array element
    public static int multiArray(int[] arr) {
        int multi = 1;
        for(int i = 0; i < arr.length; i++){
            multi = multi * arr[i];
        }
        return multi;
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

    //Method to find average of all array element
    public static float averageArray(int[] arr,int size){
        int sum = 0;
        float avg = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        avg = sum / size;
        return avg;
    } 

    //Method to find largest among all array element
    public static int largestElementArray(int[] arr) {
        int ans = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            ans = (arr[i] > max) ? arr[i] : max;
            max = ans;
        }
        return max;
    }

    //Method to find smallest among all array element
    public static int smallestElementArray(int[] arr) {
        int ans = 0;
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            ans = (arr[i] < min) ? arr[i] : min;
            min = ans;
        }
        return min;
    }

    //Method to find sorted array
    public static int[] sortArray(int[] arr){
        int temp = 0;

        //Outer loop for each pass
        for(int i = 0; i < arr.length; i++){
            //Inner loop to compare adjacement elements
            //(m - i - 1)because the last 'i' elements are already sorted
            for(int j = 0; j < arr.length - 1 ;j++){
                if(arr[j] > arr[j + 1]){
                    //swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } 
        }
        return arr;
    }
}