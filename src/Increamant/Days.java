package Increamant;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Days {


    public static void main(String[] args) {
        Scanner input = new Scanner( System .in);
        System.out.println( " full weeks ");


        int days = input.nextInt();
        int weeks = days/ 7;
        System.out.println(" you have weeks " + weeks);
        int remainder = days%7;
        System.out.println( "you have " + remainder);
int hour = remainder *24;

        System.out.println( " you had " + hour );

int remainder2 = hour%24;

        System.out.println( " now you have " + remainder2);


int min = remainder2;

int remainder3=remainder2*60;
        System.out.println( " last one " + remainder3);
    }
}
