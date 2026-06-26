/*Write a java Multithread program [A] 
i. Using Thread class. 
ii. Using Runnable Interface.  */

class Th1 extends Thread{
    public void run(){
        for(int i = 1; i <=10 ; i++){
            System.out.println("Number :"+i);
        }
        try{
            sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Th2 implements Runnable{

    public void run(){
        for(int i = 11; i <= 20 ; i++){
            System.out.println("Number :"+i);
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class MultithreadDemo {
    public static void main(String[] args) {
        
        Th1 t1 = new Th1();
        t1.start();

        Th2 t2 = new Th2();
        Thread Th2 = new Thread(t2);
        Th2.start();

    }
}
