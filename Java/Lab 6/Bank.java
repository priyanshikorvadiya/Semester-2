/*Create class BankDemo and Account(accNum:int, accType:String, balance: double). 
Implement getter() and setter() method to assign and display data for 3 students.*/ 


import java.util.Scanner;

class bankacc{
    int acc_no;
    String acc_type;
    double balance;

    void setter(int n,String t,double b){
        acc_no=n;
        acc_type=t;
        balance=b;
    }

    void getter(){
        System.out.println(acc_no +":" +acc_type+":"+balance);
    }
}
public class Bank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        bankacc p1=new bankacc();
        bankacc p2=new bankacc();
        bankacc p3=new bankacc();

        System.out.println("enter acc_no, acc_type & balance for p1");
        p1.setter(sc.nextInt(), sc.next(), sc.nextDouble());
        p1.getter();

        System.out.println("enter acc_no, acc_type & balance for p2");
        p2.setter(sc.nextInt(), sc.next(), sc.nextDouble());
        p2.getter();
        
        System.out.println("enter acc_no, acc_type & balance for p3");
        p3.setter(sc.nextInt(), sc.next(), sc.nextDouble());
        p3.getter();

        sc.close();
    }
}