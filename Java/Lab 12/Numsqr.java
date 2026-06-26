/*Write a program in java if number is less than 10 and greater than 50, it generate the 
exception out of range. Else it displays the square of number. [C]  */

import java.util.Scanner;

class OutofRangeException extends Exception{
    OutofRangeException(String msg){
        super(msg);
    }
}

public class Numsqr {
    public static void main(String[] args) throws OutofRangeException,Exception{
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number:");
        int num = sc.nextInt();

        if(num < 10 || num > 50){
             sc.close();
            throw new OutofRangeException("Number is out of range");
        }
        else{
            System.out.println(Math.pow(num, 2));
        }
       
        sc.close();

    }
}
