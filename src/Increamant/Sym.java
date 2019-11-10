package Increamant;

import java.awt.*;
import java.util.Scanner;

public class Sym {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

//        System.out.println(" enter the character");
//        char num1 = input.nextLine().charAt(0);
//        char num2 = input.nextLine().charAt(0);
//        System.out.println(num1 > num2);
//
//
//        System.out.println( " enter number");
//
//        int numberOne= input.nextInt();
//        int numberTwo = input.nextInt();
//        boolean s = numberOne==numberTwo;
//
        System.out.println( " enter your first num");



        double x = input.nextDouble();
        System.out.println( " enter your second num");
    double y = input.nextDouble();

        System.out.println( x + y);
        System.out.println(x -y);
        System.out.println(x * y);
        System.out.println(x /y);
        System.out.println( x % y);

//        8) Vending machine change.
//                Write a program that will ask used to enter a whole number from 1 to 99.
//        User will get back the amount of quarters, dimes, nickels, and pennies that are needed to equal to the provided number. > input Enter your change68 >
//        outputYour change of 68 was converted to:quarters: 2dimes: 1nickels: 1pennies: 3
//
        System.out.println( " enter your change");

int chan= input.nextInt();
    int quarters = chan /25;
     int remainder = chan % 25;
     int dimes = remainder / 10;
     int remainder1=remainder%10;
     int nickels = remainder1/5;
     int remainder3 = remainder1%5;
     int pennies =remainder3;


        System.out.println( "i have quarters="+ quarters +  " i have dimes" + dimes + " i have nickels " + nickels + " i have pennies" + pennies );















    }
}
