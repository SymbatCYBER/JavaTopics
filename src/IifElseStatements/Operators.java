package IifElseStatements;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( " please enter  double numbers ");
        double user = input.nextDouble ();
        double user2 = input.nextDouble ();
        input.nextLine();
        System.out.println("choose operators ");

        String operator =input.nextLine ();

        if (  operator.equals("*") ) {

            System.out.println("result of " + user + operator + user2 + " is "   + (user*user2));
        }

         else if  ( operator.equals("-")) {
            System.out.println("result of " + user + operator + user2 + " is " + (user - user2));
        }

          else if  ( operator.equals("+")) {
                System.out.println("result of " + user + operator + user2 + " is "   + (user+user2));
          }

         else if  ( operator.equals("/")) {
                    System.out.println("result of " + user + operator + user2 + " is "   + (user/user2));

                    System.out.println(" hhhhh");



         }



















    }

}
