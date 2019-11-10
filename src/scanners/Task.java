package scanners;

import java.util.Scanner;

public class Task {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "How many kids you have ?");
        int kids = input.nextInt();
        System.out.println(" are you female ?");
        String female = input.nextLine();
       input.nextLine();


        System.out.println( " enter your number");
        int number = input.nextInt();
        System.out.println( " where you living");
        String live= input.nextLine();
        input.nextLine();






    }
}
