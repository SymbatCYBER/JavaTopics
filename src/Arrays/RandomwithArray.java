package Arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomwithArray {
    public static void main(String[] args) {


        Random random = new Random();

        int [] num = new int [50];

       for ( int i = 0; i < 50; i ++) {
     num [i]= random.nextInt((100)+1);

}
        System.out.println(Arrays.toString(num));


    }
}
