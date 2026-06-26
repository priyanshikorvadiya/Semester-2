/*Write a program to create two threads, one thread will print odd numbers and second 
thread will print even numbers between 1 to 20 numbers. [A] */

class Odd extends Thread{
    int n1 , n2;

    Odd(int n1,int n2){
        for(int i = n1 ; i <= n2; i++){
            if (i % 2 != 0){
                System.out.println("Odd Thread :"+i);

                try{
                    sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

class Even extends Thread{
    int n1 , n2;

    Even(int n1,int n2){
        for(int i = n1 ; i <= n2; i++){
            if (i % 2 == 0){
                System.out.println("Even Thread :"+i);

                try{
                    sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

public class OddEvenThread {
    public static void main(String[] args) {
        
        Odd t1 = new Odd(1, 10);
        t1.start();

        Even t2 = new Even(11, 20);
        t2.start();
    }   
}
