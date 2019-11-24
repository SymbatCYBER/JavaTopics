package mULTIDIMANTIONALarrys;

import java.util.Arrays;

public class firstclass {
    public static void main(String[] args) {
        int [][] numbers = {{1,2,3}, {4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(numbers[2]));

        System.out.println((numbers[2][0]));

        System.out.println(numbers[1].length);
 for (int i=0; i <numbers.length; i++){
     for (int j=0; j< numbers[i].length;j++){
         System.out.println(numbers[i][j]);
     }
     System.out.println();
 }

    }
}
