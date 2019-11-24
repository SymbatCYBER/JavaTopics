package mULTIDIMANTIONALarrys;

import java.util.Arrays;
import java.util.Random;

public class nnnnn {
    public static void main(String[] args) {
        Random random= new Random ();
    int [][] num = new int [4][4];
        System.out.println(Arrays.deepToString(num));
        for (int i=0; i <num.length; i++){

            for (int j=0; j <num.length; i++){

                num[i][j]=random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(num));
    }
}
