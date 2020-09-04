import java.util.Scanner;

class Timestamps {
  public static void main(String[] args) {

    // Creates a new scanner for user input
    Scanner in = new Scanner(System.in);

    int hourSum;
    int minuteSum;
    int secondSum;

    // Reads ints from user
    System.out.println("Enter your 1st hour: ");
    int hours1 = in.nextInt();
    System.out.println("Enter your 1st minutes: ");
    int minutes1 = in.nextInt();
    System.out.println("Enter your 1st seconds: ");
    int seconds1 = in.nextInt();
    System.out.println("Enter your 2nd hour: ");
    int hours2 = in.nextInt();
    System.out.println("Enter your 2nd minutes: ");
    int minutes2 = in.nextInt();
    System.out.println("Enter your 2nd seconds: ");
    int seconds2 = in.nextInt();

    /*
     * your code goes here
     */
    hours1 = hours1 * 3600;
    hours2 = hours2 * 3600;
    hourSum = hours1 - hours2;

    minutes1 = minutes1 * 60;
    minutes2 = minutes2 * 60;
    minuteSum = minutes1 - minutes2;

    secondSum = seconds1 - seconds2;

    System.out.println(hourSum);
    System.out.println(minuteSum);
    System.out.println(secondSum);
    System.out.println((hourSum + minuteSum + secondSum) * -1);
    // closing the scanner object
    in.close();
  }
}
