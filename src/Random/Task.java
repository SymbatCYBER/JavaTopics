package Random;

import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(10);
        num++; // this is how i get the range to be 1-10
        System.out.println(" guess number");
        int guessNumber = input.nextInt();

            System.out.println(" you entered low" + num);
           if ( num==guessNumber) {
               System.out.println( "good guess");

           }else if(guessNumber< 1 || guessNumber > 10){
               System.out.println( " not valid  guess");

           }


    }


}
