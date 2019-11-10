package IifElseStatements;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        System.out.println(" please enter integer");
        int number = input.nextInt();


        if (number % 2 ==0) {

            System.out.println(" even");
        }
        else {
            System.out.println(" Odd");
        }

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int evens =0;
        int odd =0;



        if ( num1 % 2==0) {
            evens++;
        }
        else  {
            odd++;
        }
        if ( num2 % 2==0) {
            evens++;
        }
        else  {
            odd++;
        }
        if ( num3 % 2==0) {
            evens++;
        }
        else  {
            odd++;
        }
        if ( num4 % 2==0) {
            evens++;
        }
        else  {
            odd++;
        }
        if ( num5 % 2==0) {
            evens++;
        }
        else  {
            odd++;
        }
    }

    }

