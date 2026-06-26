/*Define class for Complex number with real and imaginary as data members. Create its 
constructor, overload the constructors. Also define addition method to add two 
complex objects. [C] */

class Complex{
    double real;
    double imaginary;

    Complex(){
        this.real = 0;
        this.imaginary = 0;
    }

    Complex(double real , double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex AddC(Complex c1 , Complex c2){
        this.real = c1.real + c2.real;
        this.imaginary = c1.imaginary + c2.imaginary;

        return this;
    }
}

public class ComplexNum{
    public static void main(String[] args) {

        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(10, 8);
        Complex c3 = new Complex();

        c3 = c3.AddC(c1, c2);
    
        System.out.println(c3.real + "+" + c3.imaginary + "i");
    }
}