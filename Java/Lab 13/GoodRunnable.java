/*Write an application that executes two threads. One thread displays "Good Morning" 
every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 
milliseconds. Create the threads by implementing the Runnable interface. [A]  */

class GoodMorning implements Runnable{
    public void run(){
        while (true) {
            System.out.println("Good Morning !");

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class GoodAfternoon implements Runnable{
    public void run(){
        while(true){
            System.out.println("Good Afternoon !");

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class GoodRunnable {
    public static void main(String[] args) {
        
        GoodMorning th1 = new GoodMorning();
        Thread t1 = new Thread(th1);
        t1.start();

        GoodAfternoon th2 = new GoodAfternoon();
        Thread t2 = new Thread(th2);
        t2.start();
    }
}
