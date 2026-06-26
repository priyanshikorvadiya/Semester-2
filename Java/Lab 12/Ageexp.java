/*Write a program to create a custom exception named AgeException, get the age of 
the user from command prompt (terminal) and if age is less than 18 it should throw 
AgeException, also handle this exception in main method. [A]  */

import java.util.Scanner;

class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}

public class Ageexp {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Age :");
        int age = sc.nextInt();

        try{
            if(age < 18){
                throw new AgeException("Your age is below 18");
            }
            else{
                System.out.print("Valid Age");
            }
        }

        catch(Exception e){
            System.out.println("General Exception :"+e.toString());
        }

        finally{
            sc.close();
        }
    }
}
