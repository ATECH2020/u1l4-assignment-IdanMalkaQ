import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner in = new Scanner(System.in);
        int hours = 0;
        int minutes = 0;
        //Reads int from user
        System.out.println("How many seconds have passed?");
        int number = in.nextInt();
        System.out.println("Seconds: " + number);
        //Your code goes here
        minutes = number / 60;
        hours = number / 3600;
        System.out.println("Minutes: "+ minutes);
        System.out.println("Hours: " + hours);

        // closing the scanner object
        in.close();
    }
}
