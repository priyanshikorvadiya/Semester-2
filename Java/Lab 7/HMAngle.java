/* Write a Java program to find the angle between the hour and minute hands.[A] 
 
For Minute hand
60 min --> 360 deg
1 min --> 6 deg

For Hour hand
60 min --> 30 deg
1 min --> 0.5 deg
*/ 

import java.util.Scanner;
class Ang{
     
    double minutes;
    double hours;

    Ang(double minutes , double hours){
        this.minutes = minutes;
        this.hours = hours;
    }

    double Angle(){
        double hour_angle = hours * 30 + minutes * 0.5;
        double minute_angle = minutes * 6;

        double Anglet = Math.abs(hour_angle - minute_angle);

        double Angle = Math.min(Anglet , 360 - Anglet);

        return Angle;
    }
}

public class HMAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hours(0-12) :");
        double hours = sc.nextDouble();

        System.out.print("Enter Minute(0-59) :");
        double minutes = sc.nextDouble();

        Ang A = new Ang(minutes, hours);
        System.out.println("Angle between hour hand & minute hand :" + A.Angle());

        sc.close();
    }
}