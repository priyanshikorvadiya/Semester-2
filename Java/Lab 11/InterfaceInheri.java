/* Write a program that illustrates interface inheritance. Interface A is extended by A1 and 
A2. Interface A12 inherits from both A1 and A2.Each interface declares one constant 
and one method. Class B implements A12.Instantiate B and invoke each of its methods. 
Each method displays one of the constants. [A] */

interface A {
    int a = 10;
    void dispA();
}

interface A1 extends A {
    int b = 20;
    void dispA1();
}

interface A2 extends A {
    int c = 30;
    void dispA2();
}

interface A12 extends A1 , A2 {
    int d = 40;
    void dispA12();
}

class B implements A12 {

    int e = 50;

    public void dispA(){
        System.out.println("Constant of : "+a);
    }

    public void dispA1(){
        System.out.println("Constant of : "+b);
    }

    public void dispA2(){
        System.out.println("Constant of : "+c);
    }

    public void dispA12(){
        System.out.println("Constant of : "+d);
    }

    void dispB(){
        System.out.println("Constant of : "+e);
    }
}

public class InterfaceInheri{
    public static void main(String[] args) {
        B b = new B();

        b.dispA();
        b.dispA1();
        b.dispA2();
        b.dispA12();
        b.dispB();
    }
}