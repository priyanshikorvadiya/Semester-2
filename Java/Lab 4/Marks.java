//Write a program to calculate the division obtained by the students.[A]
import java.util.Scanner;
public class Marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks out of 100 in subject 1");
        int s1 = sc.nextInt();
        System.out.println("Enter marks out of 100 in subject 2");
        int s2 = sc.nextInt();
        System.out.println("Enter marks out of 100 in subject 3");
        int s3 = sc.nextInt();
        System.out.println("Enter marks out of 100 in subject 4");
        int s4 = sc.nextInt();
        System.out.println("Enter marks out of 100 in subject 5");
        int s5 = sc.nextInt();
        
        //Method calling
        CalculateDivision(s1, s2, s3, s4, s5);
        
        sc.close();
    }
        //Function to find percencentage and grade
    public static void CalculateDivision(int s1, int s2,int s3,int s4,int s5){
            double percentage = 0;
        if(s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40){
        System.out.println("Student is passed in Exam");

            percentage = ((double)s1 + s2 + s3 + s4 + s5) * 100 / 500;

        System.out.println("Percentage scored by student is: "+ ((double)s1 + s2 + s3 + s4 + s5)*100/300);

        if(percentage > 90){
            System.out.println("Grade is A+");
        }
        else if(percentage > 80){
            System.out.println("Grade is A");
        }
        else if(percentage > 70){
            System.out.println("Grade is B+");
        }
        else if(percentage > 60){
            System.out.println("Grade is B");
        }
        else if(percentage > 50){
            System.out.println("Grade is C");
        }
        else if(percentage >= 40){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
        }
        else{
            System.out.println("Student is failed");
        }

    }
}