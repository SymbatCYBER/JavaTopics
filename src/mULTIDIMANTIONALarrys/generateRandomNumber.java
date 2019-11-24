package mULTIDIMANTIONALarrys;

import java.util.Arrays;
import java.util.Random;

public class generateRandomNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(numberWhich(3,4)));


    }
    public static int [][]numberWhich(int numOfArrys, int num){
       int[] [] number= new int [numOfArrys][num];
        Random random = new Random();

       for (int i=0; i< number.length; i++){

           for (int j=0; j< number[i].length; j++){
              number [i] [j] = random.nextInt(100);
           }
       }return number;

    }


}

