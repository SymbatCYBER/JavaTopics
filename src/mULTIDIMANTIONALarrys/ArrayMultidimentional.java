package mULTIDIMANTIONALarrys;

import java.util.Random;

public class ArrayMultidimentional {
    public static void main(String[] args) {
        Random random =new  Random();

        int[][] nums = {{44, 62, 12, 51, 33},{33, 12, 26, 27, 38,},{5, 4, 3, 2, 1}, {1, 2, 3, 4, 5}};

        for(int row=0; row<nums.length;row++) {
            for(int col=0; col<nums[row].length;col++){
                System.out.print(nums[row][col]+"\t");//"\t" is gives you spases

            }
            System.out.println(" ");

        }


    }

}