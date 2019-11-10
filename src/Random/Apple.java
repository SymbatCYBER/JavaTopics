package Random;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        char c = input.nextLine().charAt(0);

        System.out.println( " enter your grade");
           char grade = input.nextLine().charAt(0);
        switch (grade ) {
            case 'A':
            case 'a':
                System.out.println( " Excellent!");
                break;

            case  'B':
            case 'b':
                System.out.println( " Great");
                break;
            case 'C':
            case 'c':
                System.out.println( " okay ");
                break;
            case 'D' :
            case 'd':
                System.out.println("you can do better");
                break;
            case 'F':
            case 'f':

                System.out.println(" Something need to change ");
                break;
            default:
                System.out.println(" Not a valid letter grade");



        }










    }




}
