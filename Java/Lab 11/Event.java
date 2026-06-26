/* Create interface EventListener with performEvent() method. Create MouseListener 
interface which inherits EventListener along with mouseClicked(), mousePressed(), 
mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener 
interface which inherits EventListener along with keyPressed(), keyReleased() methods. 
WAP to create EventDemo class which implements MouseListener and KeyListener and 
demonstrate all the methods of the interfaces. [A] */

interface EventListener{
    void performEvent();
}

interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface  KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener , KeyListener{

    public void performEvent(){
        System.out.println("Event is performed");
    }

    public void mouseClicked(){
        System.out.println("Mouse is clicked");
    }

    public void mousePressed(){
        System.out.println("Mouse is pressed");
    }

    public void mouseReleased(){
        System.out.println("Mouse is released");
    }

    public void mouseMoved(){
        System.out.println("Mouse is moved");
    }

    public void mouseDragged(){
        System.out.println("Mouse is dragged");
    }

    public void keyPressed(){
        System.out.println("Key is pressed");
    }

    public void keyReleased(){
        System.out.println("Key is released");
    }
}

public class Event {
    public static void main(String[] args) {
        EventDemo e = new EventDemo();

        e.performEvent();
        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();
    }
}
