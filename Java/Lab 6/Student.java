/*Create class Student with attributes (name: String, roll_no:int, SPI:double, 
course: String). Implement getter() and setter() method to assign data for 3 
students and display it.*/

import java.util.Scanner;

class StuClass{
    
    String name;
    int roll_no;
    double SPI;
    String course;

    void setter(String n , int r , double s , String c){
        name  = n;
        roll_no = r;
        name  = n;
        SPI = s;
        course = c;
    }

    void getter(){
        System.out.println(name+":"+roll_no+":"+SPI+":"+course);
    }
}
public class Student {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StuClass s1 = new StuClass();

        StuClass s2 = new StuClass();

        StuClass s3 = new StuClass();

        System.out.println("Enter roll_no, name, SPI & course for s1");
        String name1 = sc.next();
        int roll_no1 = sc.nextInt();
        double SPI1 = sc.nextDouble();
        String course1 = sc.next();
        s1.setter(name1 , roll_no1 , SPI1 , course1);
        s1.getter();

        System.out.println("Enter roll_no, name, SPI & course for s2");
        String name2 = sc.next();
        int roll_no2 = sc.nextInt();
        double SPI2 = sc.nextDouble();
        String course2 = sc.next();
        s2.setter(name2 , roll_no2 , SPI2 , course2);
        s2.getter();

        System.out.println("Enter roll_no, name, spi & course for s3");
        String name3 = sc.next();
        int roll_no3 = sc.nextInt();
        double SPI3 = sc.nextDouble();
        String course3 = sc.next();
        s3.setter(name3 , roll_no3 , SPI3 , course3);
        s3.getter();

        sc.close();
    }
}