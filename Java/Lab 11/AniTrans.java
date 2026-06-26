/* The Transport interface declares a deliver () method. The abstract class Animal is the 
super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is 
implemented by the Camel and Donkey classes. Write a test program that initialize an 
array of four Animal objects. If the object implements the Transport interface, the 
deliver () method is invoked. [B]  */

interface Transport {
    public void deliver();
}

abstract class Animal{

}

class Tiger extends Animal{

}

class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Deliver method is invoked(Camel)");
    }
}

class Deer extends Animal{

}

class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Deliver method is invoked(Donkey)");
    }
}

public class AniTrans { 
    public static void main(String[] args) {
        Animal obj[] = new Animal[4];

        /* Usaually absract class no object No bane but aapde object no array 
        banavi sakiye nd tema concrete class(je abstract no hoi) e j mukvana */

        obj[0] = new Tiger();
        obj[1] = new Camel();
        obj[2] = new Deer();
        obj[3] = new Donkey();

        for(int i = 0; i < 4; i++){
            if(obj[i] instanceof Transport){
                ((Transport)obj[i]).deliver();
            }
        }
    } 
}
