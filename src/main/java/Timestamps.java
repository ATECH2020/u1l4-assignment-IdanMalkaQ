import java.util.Scanner;

public class Timestamp{
  public static void main(String[] args) {

    // Creates a new scanner for user input
    Scanner in = new Scanner(System.in);

    int hourSum;
    int minuteSum;
    int secondSum;

    // Reads ints from user
    int hours1 = in.nextInt();
    int minutes1 = in.nextInt();
    int seconds1 = in.nextInt();
    int hours2 = in.nextInt();
    int minutes2 = in.nextInt();
    int seconds2 = in.nextInt();

    /*
     * your code goes here
     */
    hours1 = hours1 * 3600;
    hours2 = hours2 * 3600;
    hourSum = hours2 - hours1;

    minutes1 = minutes1 * 60;
    minutes2 = minutes2 * 60;
    minuteSum = minutes2 - minutes1;

    secondSum = seconds2 - seconds1;
    System.out.print((hourSum + minuteSum + secondSum));
    // closing the scanner object
    in.close();
  }
}
