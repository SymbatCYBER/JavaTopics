package loops;

import java.util.Random;
import java.util.Scanner;

public class loopSixnumbersRandom {
    public static void main(String[] args) {
        Random random = new Random();
//        int number = random.nextInt(26);
//        number+=65;
//        char letter = (char)(number);
//        System.out.println("Random num " + number);
//        System.out.println("your letter " + letter);

        String number = "";  //125
        for(int i=0; i < 6; i++) {
            int ranNum = random.nextInt(10);
//            if(number.contains(ranNum+ "")) {
//                ranNum = random.nextInt(10);
//            }

            while(number.contains(ranNum + "")) {
                ranNum = random.nextInt(10);
            }
            number += ranNum;
        }
        System.out.println(number);









    }
}
