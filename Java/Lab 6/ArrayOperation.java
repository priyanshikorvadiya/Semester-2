/*Implement an array with 5 elements in class A. Create four methods for array 
operation(sortArray(), searchArray(), SumArray(), and avgArray()) and call all the four 
methods using object.[B] */
import java.util.Scanner;

class Arr{
    int[] arr = {70, 10, 30, 5, 40};

    //Method to find sum of all array element
    public void sumArray() {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
    }


    //Method to find average of all array element
    public double averageArray(){
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        return avg;
    } 

    
    //Method to find sorted array
    public void sortArray(){
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
    }

    //Method to search element in array
    public void SearchEle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search :");
        int se = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == se){
                System.out.println("Element found at index "+i+"");
            }
            else{
                System.out.println("Element not found");
            }
        }
        sc.close();
    }

}

public class ArrayOperation{
    public static void main(String[] args) {
        
        Arr obj = new Arr();

        obj.SearchEle();
        obj.averageArray();
        obj.sortArray();
        obj.sumArray();
        
    }

}