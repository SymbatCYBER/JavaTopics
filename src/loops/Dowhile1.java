package loops;

import java.util.Random;
import java.util.Scanner;

public class Dowhile1 {
    public static void main(String[] args) {
//        Generate a random number from 1 to 100.
//        Ask the user to guess the number. If the guess is too high print “Too high”
//        If the guess is too low print “Too low”. They continue to guess until they guess the correct number.
//                Count how many guesses were taken and when the number is guessed correctly print
//    “You guessed right after guessValue tries !
        Scanner input =  new Scanner(System.in);
        Random random = new Random ();


        int num2 = random.nextInt(100) +1;
        int guess = 0;
        int count = 0;
      do {
          System.out.println(" enter your guess ");
          guess=input.nextInt();
          count++;
          if (guess < num2) {
              System.out.println("too low ");

          } else if (guess> num2) {
              System.out.println(" too high");
          } else {
              System.out.println("you guessed right  after " + count + " tries ");
          }
      }while(num2 != guess);


    }
}
