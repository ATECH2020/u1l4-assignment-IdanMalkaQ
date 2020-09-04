import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner in = new Scanner(System.in);
        int hours = 0;
        int minutes = 0;
        //Reads int from user
        int number = in.nextInt();
        //Your code goes here
        minutes = number / 60;
        hours = number / 3600;
        System.out.println(hours);

        // closing the scanner object
        in.close();
    }
}
