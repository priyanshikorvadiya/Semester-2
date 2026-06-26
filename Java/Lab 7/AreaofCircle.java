//Write a program to create circle class with area function to find area of circle. [A] 

import java.util.Scanner;
class Circle{
     
    double radius;
 
    Circle(double radius){
        this.radius = radius;
    }
    
    double Area(){
        return Math.PI * radius * radius;
    }
}

public class AreaofCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius of circle :");
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

        System.out.println("Area of circle = "+c.Area());

        sc.close();
    }
}