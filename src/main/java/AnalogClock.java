import java.util.Scanner;

class AnalogClock{
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner in = new Scanner(System.in);

        //Reads ints from user
        double hourAngle = in.nextDouble(); 
        
        double minuteAngle;
        double minute = 0;
   
        hourAngle = hourAngle % 30;
        minute = hourAngle / .5;   
        minuteAngle = minute * 6;
        
        int min = (int)Math.round(minute);
        int minAng = (int)Math.round(minuteAngle);
        System.out.print(minAng/* + " " + min*/);
    
        // closing the scanner object
        in.close();
    }
}
