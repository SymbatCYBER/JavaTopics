package loops;

import java.util.Scanner;

public class RangeTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int  numOne = input.nextInt();

        int numTwo = input.nextInt();
         int sum = 0;

        System.out.println("enter two numbers");
     for (int i =numOne; i <= numTwo; i++ ) {
         sum+=i;
     }
        System.out.println(" the sum is " + numOne + " to " + numTwo + " is " + sum);

    }
}
