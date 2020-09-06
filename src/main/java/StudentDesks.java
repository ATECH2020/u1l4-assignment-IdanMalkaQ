import java.util.Scanner;

class StudentDesk {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner in = new Scanner(System.in);
        boolean mod1 = false;
        boolean mod2 = false;
        boolean mod3 = false;
        int sumOfDesks = 0;
        int sumOfDesks1 = 0;
        int sumOfDesks2 = 0;
        int sumOfDesks3 = 0;
        //Reads ints from user
        int class1 = in.nextInt();
        int class2 = in.nextInt();
        int class3 = in.nextInt();
        int sum = 0;

        /*
         *  your code goes here
         */

        sum = (class1%2) +  (class2%2) + (class3%2);
        sumOfDesks1 = class1 / 2 ;
        sumOfDesks2 = class2 / 2 ;
        sumOfDesks3 = class3 / 2 ;

        sumOfDesks = sumOfDesks1 + sumOfDesks2 + sumOfDesks3 + sum;
            
        System.out.print(sumOfDesks);

        // closing the scanner object
        in.close();
    }
}
