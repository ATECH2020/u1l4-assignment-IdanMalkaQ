import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner in = new Scanner(System.in);

        //Reads ints from user
        double hourAngle = in.nextDouble(); 
        
        double minuteAngle;
        double minute = 0;
        if(hourAngle > 0 && hourAngle <= 90)
        {// time frame 1 - 3
            hourAngle = hourAngle % 30;
            minute = hourAngle / .5;
            System.out.println(minute);
        }else if(hourAngle > 90 && hourAngle <= 180)
        {// time frame 3 - 6
            hourAngle = hourAngle % 30;
            minute = hourAngle / .5;
            System.out.println(minute);
        }else if(hourAngle > 180 && hourAngle <= 270)
        {// time frame 6 - 9
            hourAngle = hourAngle % 30;
            minute = hourAngle / .5;
            System.out.println(minute);        
        }else if(hourAngle > 270 && hourAngle <= 360)
        {// time frame 9 - 12
            hourAngle = hourAngle % 30;
            minute = hourAngle / .5;
            System.out.println(minute);            
        }
        
        
        
        if(minute > 0 && hourAngle <= 15)
        {// time frame 1 - 3
            // angle 1 - 90
            minuteAngle = minute * 6;
            System.out.println(minuteAngle);
        }else if(hourAngle > 15 && hourAngle <= 30)
        {// time frame 3 - 6
            // angle 91 - 180
            minuteAngle = minute * 6;
            System.out.println(minuteAngle);
        }else if(hourAngle > 30 && hourAngle <= 45)
        {// time frame 6 - 9
            // angle 181 - 270
            minuteAngle = minute * 6;
            System.out.println(minuteAngle);             
        }else if(hourAngle > 45 && hourAngle <= 60)
        {// time frame 9 - 12
            // angle 271 - 360
            minuteAngle = minute * 6;
            System.out.println(minuteAngle);            
        }

        // closing the scanner object
        in.close();
    }
}
