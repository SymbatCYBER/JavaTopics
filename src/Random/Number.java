package Random;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner input = new Scanner ( System.in);
        System.out.println(" enter number one ");
        double number1 = input.nextDouble();
        System.out.println( " enter number two" );
        double number2 = input.nextDouble();
        input.nextLine();
        System.out.println(" Create calculator ");

        String op =input.nextLine();
       double result = 0;
boolean valid = true;
      switch (op) {

          case "+":
             result= number1+number2;
             break;
          case "*":
              result = number1*number2;
              break;
          case "/":
              result = number1/number2;
              break;
          case "%":
              result = number1%number2;
              break;
          default:
              System.out.println("invalid");

              valid= false;
               if ( valid) {

                   System.out.println(number1+ op + number2 + "= " + result);
               }
      }

    }
}