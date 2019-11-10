package Random;

import java.util.Random;

public class NumberToDay {
    public static void main(String[] args) {

        Random random = new Random();
     int number = random.nextInt(26);
        number+=65;
        char letter = (char)(number);
        System.out.println("Random num " + number);
        System.out.println("your letter " + letter);







    }
}
