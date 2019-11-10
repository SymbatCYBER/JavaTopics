package loops;

import java.util.Scanner;

public class Attempt {
    public static void main(String[] args) {
//      Scanner input = new Scanner(System.in);
////        Part 2:
////        Modify the above task:
////        Give 3 attempts to login.
////   If user fails to enter right password within 3 attempts print "Sorry. You account is locked.
////   Try after 5 hours" and end the program.
////
//
//    for (int attepmts = 0;  ; attepmts++){
//        if (attepmts ==3) {
//            System.out.println(" Your account is locked ");
//            break;
//        }
//    }

        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double sum = 0;
        for (double i=1; i<=n; i++){

            sum =sum +(1/i);  }
        // sum = sum + 1/i;
        System.out.println(sum);


    }
}
