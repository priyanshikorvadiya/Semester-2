/*Write a program to add two different Time class’s objects. Time class contains 3 
fields hours, Minute and Seconds. (Take input from user and assume user will 
always enter a valid data, e.g. if Time1 is 02:55:55 and Time2 is 03:07:10 then 
result is 06:03:05) [A]  */

class Time{
    int hr,min,sec;

    Time(int hr , int min , int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    //Constructor overloading
    Time(){
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }

    Time addTime(Time t1 , Time t2){
        this.sec = t1.sec + t2.sec;
        this.min = t1.min + t2.min;
        this.hr = t1.hr + t2.hr;

        if(this.sec >= 60){
            this.min = this.min + this.sec / 60;
            this.sec = this.sec % 60;
        }

        if(this.min >= 60){
            this.hr = this.hr + this.min / 60;
            this.min = this.min % 60;
        }

        return this;
    }
}

public class TimeAdd{
    public static void main(String[] args) {
        Time t1 = new Time(10, 123, 65);
        Time t2 = new Time(0, 3, 3);
        Time t3 = new Time();

        t3 = t3.addTime(t1, t2);

        System.out.println(t3.hr + " : " + t3.min + " : " + t3.sec);
    }
}