package IifElseStatements;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 30;
        if(number >= 0 && number <= 50) {
            if(number >= 10 && number <= 40) {
                if(number >= 20 && number <= 30) {
                    System.out.println("Your number is good");
                } else {
                    System.out.println("Not in the 20 - 30 range");
                }
            } else {
                System.out.println("Not in the 10 - 40 range");
            }
        } else {
            System.out.println("Not in the 0 - 50 range");
        }
    }
}











