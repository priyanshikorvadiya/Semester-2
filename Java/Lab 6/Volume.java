/*Create class Cube with attributes (height, width and depth with double datatype). 
Implement getter() and setter() method to assign data for 2 cubes. Create method 
volume() to calculate volume for 2 cubes.*/

import java.util.Scanner;

class Cube {
    // Attributes
     double height;
    double width;
     double depth;

   void setter(double h,double w,double d){
        height=h;
        width=w;
        depth=d;
    }

    void getter(){
        System.out.println( "Volume = "+(height*width*depth));
    }
}
public class Volume{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cube c1=new Cube();
        Cube c2 =new Cube();
        
        System.out.println("enter height, width & depth for c1");
        c1.setter( sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        c1.getter();

        System.out.println("enter height ,width & depth for c2");
        c2.setter(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        c2.getter();

        sc.close();
    }
}