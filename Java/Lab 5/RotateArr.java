/*There is an integer array nums sorted in ascending order (with distinct values). 
Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., 
nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] 
might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. 
Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums.[C] 
Example 1: 
Input: nums = [4,5,6,7,0,1,2], target = 0 
Output: 4 
Example 2: 
Input: nums = [4,5,6,7,0,1,2], target = 3 
Output: -1 */
import java.util.Arrays;
import java.util.Scanner;
public class RotateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {0,1,2,3,4,5,6,7};

        //Number of rotation
        System.out.print("Enter number of rotation");
        int n = sc.nextInt();

        System.out.println("Original array: ");
        for(int i : a){
            System.out.print(i+",");
        }

        //Move to the next line
        System.out.println();

        //Object to call method 
        RotateArr ra = new RotateArr();
        a = ra.Rotate(a, n);
        System.out.println("Rotated array by n :" +(Arrays.toString(a)));
        sc.close();   
    }

    //Method to rotate an array
    int[] Rotate(int[] a,int n){
        int temp;
        for(int j = 0; j < n; j++){
            temp = a[0];
        for(int i = 0; i < a.length - 1; i++){
            a[i] = a[i + 1];
        }
        //To print last element
        a[a.length - 1] = temp;
    }
        return a;
    }
}