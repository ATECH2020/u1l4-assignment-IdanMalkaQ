
import java.util.Scanner;

class StudentDesks {
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

        /*
         *  your code goes here
         */

        
        if((class1%2) > 0)
        {
            int sum = class1%2;
            sumOfDesks1 = sumOfDesks1 + sum;
            System.out.println(sumOfDesks1);
            System.out.println(sum);
            mod1 = true;
        }else if((class2%2) > 0)
        {
            sumOfDesks2 = sumOfDesks2 + (class2%2);
            System.out.println(sumOfDesks2);
            System.out.println(class2%2);
            mod2 = true;
        }else if((class3%2) > 0)
        {
            sumOfDesks3 = sumOfDesks3 + (class3%2);
            System.out.println(sumOfDesks3);
            System.out.println(class3%2);
            mod3 = true;
        }else 
        {
            sumOfDesks = sumOfDesks;
        }
        sumOfDesks1 = class1/2;
        sumOfDesks2 = class2/2;
        sumOfDesks3 = class3/2;
        
        
        
        if(mod1 == true)
        {
            int sum = class1%2;
            sumOfDesks1 = sumOfDesks1 + sum;
            System.out.println(sum);
                        System.out.println(sumOfDesks1);
            System.out.println(sumOfDesks2);
            System.out.println(sumOfDesks3);
            sumOfDesks = sumOfDesks1 + sumOfDesks2 + sumOfDesks3;
        }else if(mod2 == true)
        {
            int sum = class2%2;
            sumOfDesks2 = sumOfDesks2 + sum;
            System.out.println(sum);
                        System.out.println(sumOfDesks1);
            System.out.println(sumOfDesks2);
            System.out.println(sumOfDesks3);
            sumOfDesks = sumOfDesks1 + sumOfDesks2 + sumOfDesks3;
        }else if(mod3 == true)
        {
            int sum = class3%2;
            sumOfDesks3 = sumOfDesks3 + sum;
            System.out.println(sum);
                        System.out.println(sumOfDesks1);
            System.out.println(sumOfDesks2);
            System.out.println(sumOfDesks3);
            sumOfDesks = sumOfDesks1 + sumOfDesks2 + sumOfDesks3;
        }else
        {
            sumOfDesks1 = class1/2 + class1%1;
            sumOfDesks2 = class2/2 + class1%2;
            sumOfDesks3 = class3/2 + class1%2;
            System.out.println(sumOfDesks1);
            System.out.println(sumOfDesks2);
            System.out.println(sumOfDesks3);
            sumOfDesks = sumOfDesks1 + sumOfDesks2 + sumOfDesks3;
        }
        
        System.out.println(sumOfDesks);

        // closing the scanner object
        in.close();
    }
}
